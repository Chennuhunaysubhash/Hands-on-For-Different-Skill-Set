package com.project.onlinemovieticketbook.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.transaction.annotation.Transactional;

import com.project.onlinemovieticketbook.customer.entity.Movie;
//@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	
	@Query("SELECT u FROM Movie u WHERE u.location = :id ")
	List<Movie> findAllMovie(@Param("id") int id);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Movie u set u.seats = :seat, u.soldSeats=:sold where u.id = :id")
	int updateSeats(@Param(value = "id") int id, @Param(value = "seat") int seats,@Param(value = "sold") int sold);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Movie u set u.status = :status where u.id = :id")
	void updateStatus(@Param(value = "id") int id, @Param(value = "status") String status);
}
