package com.project.onlinemovieticketbook.customer.service;

import java.util.List;

import com.project.onlinemovieticketbook.customer.entity.Movie;

public interface MovieService {
	
	public Movie findById(int theId);
	public List<Movie> findAllMovieLoc(int id);
	public void updateSeats(int id,int seat, int sold);
	
	public void updateStatus(int id,String status);
}
