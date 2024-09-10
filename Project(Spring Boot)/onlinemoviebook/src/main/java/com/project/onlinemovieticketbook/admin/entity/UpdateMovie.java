package com.project.onlinemovieticketbook.admin.entity;

public class UpdateMovie {
	
	private int id;
	
	private String movieName;
	
	private int movieId;
	
	private int distributorId;
	
	
	

	public UpdateMovie() {
		
	}

	public UpdateMovie(int id, String movieName, int movieId, int distributorId) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieId = movieId;
		this.distributorId = distributorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}
	
	
}
