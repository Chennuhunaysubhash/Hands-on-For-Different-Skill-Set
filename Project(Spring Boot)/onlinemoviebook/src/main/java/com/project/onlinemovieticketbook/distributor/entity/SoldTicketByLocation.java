package com.project.onlinemovieticketbook.distributor.entity;

public class SoldTicketByLocation {

	private int locationId;
	
	private int movieId;

	private int distributorid;
	public SoldTicketByLocation() {}

	public SoldTicketByLocation(int locationId, int movieId,int distributorid) {
		super();
		this.locationId = locationId;
		this.movieId = movieId;
		this.distributorid = distributorid;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getDistributorid() {
		return distributorid;
	}

	public void setDistributorid(int distributorid) {
		this.distributorid = distributorid;
	}
	
	
}
