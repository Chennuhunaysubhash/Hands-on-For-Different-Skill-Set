package com.project.onlinemovieticketbook.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


import com.project.onlinemovieticketbook.customer.entity.Movie;

public interface AdminRepository extends JpaRepository<Movie, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Movie u set u.price = :price where u.id = :id")
	void updatePrice(@Param(value = "id") int id, @Param(value = "price") int price);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Movie u set u.movie = :movie,u.seats= 100,u.soldSeats= 0,u.movieId=:movieId,u.distributorid=:distributorid where u.id = :id")
	void updateMovie(@Param(value = "id") int id, @Param(value = "movie") String movie,@Param(value="movieId") int movieId,@Param(value="distributorid") int distributorid);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Movie u set u.status = :status where u.id = :id")
	void updateStatus(@Param(value = "id") int id, @Param(value = "status") String status);
	

	@Query("SELECT SUM(soldSeats) FROM Movie m where m.location = :location and m.movieId =:movieId and m.distributorid=:distributorid ")
	public int soldTicketLocation(@Param("location") int location, @Param("movieId") int movieId,@Param("distributorid") int distributorid);
	
	@Query("SELECT SUM(soldSeats) FROM Movie m where m.movieId =:movieId ")
	public int soldTicketMovie(@Param("movieId") int movieId);
	
	@Query("SELECT SUM(soldSeats) FROM Movie m where m.id =:id ")
	public int soldTicketTheater(@Param("id") int id);
}
