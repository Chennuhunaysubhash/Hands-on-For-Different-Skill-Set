package com.project.onlinemovieticketbook.distributor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlinemovieticketbook.admin.entity.Distributor;
import com.project.onlinemovieticketbook.distributor.entity.DistributorLogin;
import com.project.onlinemovieticketbook.customer.entity.Movie;
import com.project.onlinemovieticketbook.distributor.entity.SoldTicketByLocation;
import com.project.onlinemovieticketbook.admin.service.DistributorServiceImpl;
import com.project.onlinemovieticketbook.customer.service.MovieServiceImpl;

@RestController
@RequestMapping("/distributor")
public class DistributorController {
	
	@Autowired
	private DistributorServiceImpl distributorServiceImpl;
	
	@Autowired
	private MovieServiceImpl movieServiceImpl;
	
	@GetMapping("/{distributorId}")
	public Distributor getDistributor(@PathVariable int distributorId) {
		
		Distributor theDistributor = distributorServiceImpl.findById(distributorId);
		
		if (theDistributor == null) {
			throw new RuntimeException("the distributor id not found - " + distributorId);
		}
		
		return theDistributor;
	}
	
	@PostMapping("/login")
	public String login(@RequestBody DistributorLogin l) {
		return distributorServiceImpl.login(l);
	}
	
	@PostMapping("/location/sold/ticket")
	public String soldTicket(@RequestBody SoldTicketByLocation s) {
		return "Total number of  tickets "+distributorServiceImpl.soldTicketLoc(s.getLocationId(), s.getMovieId(),s.getDistributorid());
		
	}
	
	@GetMapping("/movie/sold/ticket/{movieId}")
	public String totalTicket(@PathVariable int movieId) {
		return "Total number of  tickets "+distributorServiceImpl.soldTicketMovie(movieId);
		
	}
	
	@GetMapping("/theater/sold/ticket/{theId}")
	public String theaterSoldTicket(@PathVariable int theId) {
		
		Movie theDistributor = movieServiceImpl.findById(theId);
		
		if (theDistributor == null) {
			throw new RuntimeException("the theater id not found - " + theId);
		}
		
		return "Number of tickets sold in the "+theDistributor.getMovie()+" is "+distributorServiceImpl.soldTicketTheater(theId)+" and collection "+distributorServiceImpl.soldTicketTheater(theId)*theDistributor.getPrice();  
		
	}
}
