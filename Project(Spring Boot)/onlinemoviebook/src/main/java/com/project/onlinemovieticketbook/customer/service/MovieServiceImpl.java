package com.project.onlinemovieticketbook.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.onlinemovieticketbook.customer.entity.Movie;
import com.project.onlinemovieticketbook.customer.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> findAllMovieLoc(int id) {
		// TODO Auto-generated method stub
		return movieRepository.findAllMovie(id);
	}

	@Override
	public void updateSeats(int id, int seat, int sold) {
		movieRepository.updateSeats(id, seat, sold);
	}

   public Movie findById(int theId) {
		
		Optional<Movie> result = movieRepository.findById(theId);
		
		Movie theMovie = null;
		
		if (result.isPresent()) {
			theMovie = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find theater id - " + theId);
		}
		
		return theMovie;

	}
   @Override
	public void updateStatus(int id, String status) {
		// TODO Auto-generated method stub
	   movieRepository.updateStatus(id, status);
	}
}
