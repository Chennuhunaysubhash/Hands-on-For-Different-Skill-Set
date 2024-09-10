package com.project.onlinemovieticketbook.admin.service;

import java.util.List;

import com.project.onlinemovieticketbook.customer.entity.Movie;


public interface AdminService {
	public List<Movie> findAll();
	public Movie findById(int theId);
	public void deleteById(int theId);
	public void save(Movie theMovie);
	public void updatePrice(int id,int price);
	public void updateMovie(int id,String movie, int movId,int disId);
	public void updateStatus(int id,String status);

}
