package com.project.onlinemovieticketbook.customer.entity;

public class PaymentPro {
	
	private int id;
	private String name;
	private int accountNo;
    private int userId;
	private String  payMethod;
	private String  movieName;
	private int  theatreId;
	private int   seats;
	private int  amount;
	private String   date;
	private String sta;
	
	public PaymentPro() {}

	public PaymentPro(int id, String name, int accountNo, int userId, String payMethod, String movieName, int theatreId,
			int seats, int amount, String date) {
		super();
		this.id = id;
		this.name = name;
		this.accountNo = accountNo;
		this.userId = userId;
		this.payMethod = payMethod;
		this.movieName = movieName;
		this.theatreId = theatreId;
		this.seats = seats;
		this.amount = amount;
		this.date = date;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
