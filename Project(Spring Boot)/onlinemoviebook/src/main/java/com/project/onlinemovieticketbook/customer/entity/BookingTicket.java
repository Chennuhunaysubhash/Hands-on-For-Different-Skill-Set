package com.project.onlinemovieticketbook.customer.entity;

public class BookingTicket {
	
	private int theId;
	
	private int movieId;
	
	private int noSeat;

	public BookingTicket(int theId, int movieId, int noSeat) {
		super();
		this.theId = theId;
		this.movieId = movieId;
		this.noSeat = noSeat;
	}

	public int getTheId() {
		return theId;
	}

	public void setTheId(int theId) {
		this.theId = theId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoSeat() {
		return noSeat;
	}

	public void setNoSeat(int noSeat) {
		this.noSeat = noSeat;
	}
	
	
}
