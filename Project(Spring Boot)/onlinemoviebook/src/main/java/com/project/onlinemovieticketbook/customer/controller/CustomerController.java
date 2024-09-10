package com.project.onlinemovieticketbook.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlinemovieticketbook.customer.entity.BookingTicket;
import com.project.onlinemovieticketbook.customer.entity.CancelBooking;
import com.project.onlinemovieticketbook.customer.entity.Customer;
import com.project.onlinemovieticketbook.customer.entity.Location;
import com.project.onlinemovieticketbook.customer.entity.Login;
import com.project.onlinemovieticketbook.customer.entity.Movie;
import com.project.onlinemovieticketbook.customer.entity.PayMaster;
import com.project.onlinemovieticketbook.customer.entity.Payment;
import com.project.onlinemovieticketbook.customer.entity.PaymentPro;
import com.project.onlinemovieticketbook.customer.service.BookingCancelServiceImpl;
import com.project.onlinemovieticketbook.customer.service.ConstomerServiceImpl;

import com.project.onlinemovieticketbook.customer.service.MovieServiceImpl;
import com.project.onlinemovieticketbook.customer.service.PaymentServiceImpl;

@RestController

@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ConstomerServiceImpl constomerService;
	
	@Autowired
	private PaymentServiceImpl paymentServiceImpl;

	@Autowired
	private BookingCancelServiceImpl bookingCancelServiceImpl;
	
	@Autowired
	private MovieServiceImpl movieServiceImpl;
	
	@GetMapping("/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		
		Customer theCustomer = constomerService.findById(customerId);
		
		if (theCustomer == null) {
			throw new RuntimeException("Employee id not found - " + customerId);
		}
		
		return theCustomer;
	}
	
	@PostMapping("/register")
	public String addEmployee(@RequestBody Customer theCustomer) {
		
		
		
		theCustomer.setId(0);
		
		constomerService.save(theCustomer);
		
		return "User ID: "+theCustomer.getId()+"\n Name: "+theCustomer.getName()+"\n Location: "+theCustomer.getLocation()+"\n Phone Number: "+theCustomer.getPhoneNo();
	}
	
	
	
	@PutMapping("/addcustomer")
	public String updateEmployee(@RequestBody Customer theCustomer) {
		
		constomerService.save(theCustomer);
		
		return "User ID: "+theCustomer.getId()+"\n Name: "+theCustomer.getName()+"\n Location: "+theCustomer.getLocation()+"\n Phone Number: "+theCustomer.getPhoneNo();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Login l) {
		return constomerService.login(l);
	}
	
	@GetMapping("/location")
	public List<Location> getLocation(){
		return constomerService.findAll();
		
	}
	
	@GetMapping("/location/{id}")
	public String getLocationList(@PathVariable int id) {
		Location loc =  constomerService.findLocation(id);
		return loc.getLocationName();	
	}
	
	@GetMapping("/movie/location/{id}")
	public List<Movie> movieLocation(@PathVariable int id){
		return movieServiceImpl.findAllMovieLoc(id);
		
	}
	@GetMapping("/movie/{id}")
	public Movie getMovie(@PathVariable int id){
		Movie movie = movieServiceImpl.findById(id);
		if (movie == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}
		return movie;
		
	}
	
	@PutMapping("/movie/booking/ticket")
	public String updateEmail(@RequestBody BookingTicket theUpdate) {
		String msg;
		Movie movie = movieServiceImpl.findById(theUpdate.getTheId());
		if (movie == null) {
			throw new RuntimeException("Employee id not found - " + theUpdate.getTheId());
		}
		else {
			if(movie.getSeats() == 0) {
				msg = "tickets not avaiable";
				movieServiceImpl.updateStatus(theUpdate.getTheId(), "House Full");
			}
			else if(theUpdate.getNoSeat()>movie.getSeats()) {
				msg ="booking tickets is more then avaiable tickets ";
			}
			else {
				msg = "Number of booking seats is "+theUpdate.getNoSeat()+" and Movie name "+movie.getMovie()+" and total amount is "+theUpdate.getNoSeat()*movie.getPrice();

			}
		
			}
		return msg;
		
	}
	
	@PostMapping("/payment")
	public String donePay(@RequestBody PaymentPro p) {
		String msg;
		PayMaster pay = paymentServiceImpl.findById(p.getId());
		if(pay == null) {
			throw new RuntimeException("Employee id not found - " + pay.getId());
		}
		else {
			String dataName,name;
			int dataAcc,acc;
			dataName = pay.getName();
			dataAcc = pay.getAccountno();
			name = p.getName();
			acc = p.getAccountNo();
			if(dataName.equals(name) && dataAcc == acc) {
				paymentServiceImpl.insertData(p.getUserId(), p.getPayMethod(), p.getMovieName(), p.getTheatreId(), p.getSeats(), p.getAmount(),p.getDate());
				Movie movie = movieServiceImpl.findById(p.getTheatreId());
				if (movie == null) {
					throw new RuntimeException("Employee id not found - " + p.getTheatreId());
				}
				String dataMovie,movie1;
				int sold,seat,id;
				id = movie.getId();
				dataMovie = movie.getMovie();
				movie1 = p.getMovieName();
				if(dataMovie.equals(movie1)) {
					seat = movie.getSeats() - p.getSeats();
					sold = movie.getSoldSeats() + p.getSeats();
					
					movieServiceImpl.updateSeats(id, seat, sold);
				}
				//return p.getSeats()*movie.getPrice();
				msg = "payment successfully";
			}
			else {
				msg = "payment not successfully";
			}
		}
		return msg;
	}
	
	@PutMapping("/movie/booking/cancel")
	public String updateStatus(@RequestBody CancelBooking theUpdate) {
		int dataPrice,price,dataId,newId;
		String msg;
		Payment payment = bookingCancelServiceImpl.findById(theUpdate.getPaymentId());
		if (payment == null) {
			throw new RuntimeException("Employee id not found - " + theUpdate.getPaymentId());
		}
		dataPrice = payment.getAmount();
		price = theUpdate.getAmount();
		dataId = payment.getTheatreId();
		newId = theUpdate.getTheId();
		if(dataPrice==price && dataId==newId) {
			bookingCancelServiceImpl.updateStatusC(theUpdate.getPaymentId(), "Booking cancel");
		Movie movie = movieServiceImpl.findById(payment.getTheatreId());
		if (movie == null) {
			throw new RuntimeException("Employee id not found - " + payment.getPaymentId());
		}
		int dataTid,payTid,sold,seat;
		dataTid = movie.getId();
		payTid = theUpdate.getTheId();
		if(dataTid==payTid) {
			seat = movie.getSeats() + payment.getSeats();
			sold = movie.getSoldSeats() - payment.getSeats();
			
			movieServiceImpl.updateSeats(dataTid, seat, sold);
		}
		
		msg="Successfully cancel the booking";
		
		}
		else {
			msg="Not successfully cancel the booking";
		}
		return msg;
}
	
	@GetMapping("/payment/history/{userId}")
	public List<Payment> paymentHistory(@PathVariable int userId ){
		return paymentServiceImpl.historyByUserId(userId);
		
	}
}