package com.project.onlinemovieticketbook.admin.service;

import java.util.List;

import com.project.onlinemovieticketbook.customer.entity.Location;



public interface LocationService {
	public List<Location> findAll();
	
	public Location findById(int theId);
	
	public void save(Location theLocation);
	
	public void deleteById(int theId);
}
