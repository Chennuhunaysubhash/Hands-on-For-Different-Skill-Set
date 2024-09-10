package com.project.onlinemovieticketbook.customer.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie1")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="The_id")
	private int id;
	@Column(name="LocationID")
	private int location;
	@Column(name="Theatre")
	private String theatre;
	@Column(name="Movie_id")
	private int movieId;
	@Column(name="Movie")
	private String movie;
	@Column(name="Status")
	private String status;
	@Column(name="Seats")
	private int seats;
	@Column(name="Sold_Seats")
	private int soldSeats;
	@Column(name="Price")
	private int price;
	@Column(name="distributor_id")
	private int distributorid;
	
	public Movie() {
		
	}

	public Movie(int location, String theatre, int movieId, String movie, String status, int seats, int price,
			int distributorid) {
		super();
		this.location = location;
		this.theatre = theatre;
		this.movieId = movieId;
		this.movie = movie;
		this.status = status;
		this.seats = seats;
		this.price = price;
		this.distributorid = distributorid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getTheatre() {
		return theatre;
	}

	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getSoldSeats() {
		return soldSeats;
	}

	public void setSoldSeats(int soldSeats) {
		this.soldSeats = soldSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistributorid() {
		return distributorid;
	}

	public void setDistributorid(int distributorid) {
		this.distributorid = distributorid;
	}
	

}
