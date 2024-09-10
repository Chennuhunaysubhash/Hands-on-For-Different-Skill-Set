package com.project.onlinemovieticketbook.admin.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinemovieticketbook.customer.entity.Movie;
import com.project.onlinemovieticketbook.admin.repository.AdminRepository;



@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	@Override
	public List<Movie> findAll() {
		return adminRepository.findAll();
		
	}

	@Override
	public Movie findById(int theId) {
		Optional<Movie> result = adminRepository.findById(theId);
		
		Movie theMovie = null;
		
		if (result.isPresent()) {
			theMovie = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theMovie;
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(theId);
	}

	@Override
	public void save(Movie theMovie) {
		// TODO Auto-generated method stub
		adminRepository.save(theMovie);
	}

	@Override
	public void updatePrice(int id, int price) {
		// TODO Auto-generated method stub
		adminRepository.updatePrice(id, price);
	}

	@Override
	public void updateMovie(int id, String movie, int movId,int disId) {
		// TODO Auto-generated method stub
		adminRepository.updateMovie(id, movie, movId, disId);
	}

	@Override
	public void updateStatus(int id, String status) {
		// TODO Auto-generated method stub
		adminRepository.updateStatus(id, status);
	}


	
	
}
