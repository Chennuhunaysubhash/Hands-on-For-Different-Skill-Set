package com.project.onlinemovieticketbook.customer.entity;

//This class is used to take data in json format for movie ticket booking canceling.

public class CancelBooking {
	
	private int paymentId;
	
	private int amount;
	
	private int theId;

	public CancelBooking(int paymentId, int amount,int theId) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.theId = theId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int price) {
		this.amount = price;
	}

	public int getTheId() {
		return theId;
	}

	public void setTheId(int theId) {
		this.theId = theId;
	}
	
	
}
