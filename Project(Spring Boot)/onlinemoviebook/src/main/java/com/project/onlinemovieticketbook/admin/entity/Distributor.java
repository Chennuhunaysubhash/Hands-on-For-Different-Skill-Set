package com.project.onlinemovieticketbook.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distributor1")
public class Distributor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Password")
	private String password;
	@Column(name="Movie")
	private String movie;
	@Column(name="Movie_id")
	private int movieId;
	
	public Distributor() {
		
	}

	public Distributor(String name, String password, String movie,int movieId) {
		super();
		this.name = name;
		this.password = password;
		this.movie = movie;
		this.movieId = movieId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	
}
