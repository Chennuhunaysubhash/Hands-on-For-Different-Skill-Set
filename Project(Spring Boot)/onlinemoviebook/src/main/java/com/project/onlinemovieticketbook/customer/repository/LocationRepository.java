package com.project.onlinemovieticketbook.customer.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.onlinemovieticketbook.customer.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {
	
	@Query("SELECT u FROM Location u WHERE u.id = :id ")
	Location findAllActiveUsers(@Param("id") int id);
}
