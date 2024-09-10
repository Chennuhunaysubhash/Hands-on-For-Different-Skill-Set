package com.project.onlinemovieticketbook.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinemovieticketbook.customer.entity.Location;
import com.project.onlinemovieticketbook.customer.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Override
	public Location findById(int theId) {
		Optional<Location> result = locationRepository.findById(theId);
		
		Location theLocation = null;
		
		if (result.isPresent()) {
			theLocation = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theLocation;

	}

	@Override
	public void save(Location theLocation) {
		// TODO Auto-generated method stub
		locationRepository.save(theLocation);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		locationRepository.deleteById(theId);
	}

}
