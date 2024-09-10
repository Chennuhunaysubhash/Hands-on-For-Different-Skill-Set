package com.project.onlinemovieticketbook.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int paymentId;
	
	@Column(name="user")
	private int user;
	
	@Column(name="Method")
	private String payMethod;
	
	@Column(name="Movie")
	private String movieName;
	
	@Column(name="Theatre")
	private int theatreId;
	
	@Column(name="Seats")
	private int seats;
	
	@Column(name="Amount")
	private int amount;
	
	@Column(name="Date")
	private String date;
	
	@Column(name="status")
	private String sta;
	public Payment() {
		
	}
	public Payment(int userId, String method, String movieName, int theatreId, int seats, int amount, String date) {
		super();
		this.user = userId;
		this.payMethod = method;
		this.movieName = movieName;
		this.theatreId = theatreId;
		this.seats = seats;
		this.amount = amount;
		this.date = date;
		this.sta = "Done";
	}
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getUserId() {
		return user;
	}
	public void setUserId(int userId) {
		this.user = userId;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	
	
	
}
