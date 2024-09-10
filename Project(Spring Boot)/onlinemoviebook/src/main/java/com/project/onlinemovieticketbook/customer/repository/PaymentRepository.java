package com.project.onlinemovieticketbook.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.project.onlinemovieticketbook.customer.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>
{
	
	@Modifying
    @Query(value = "insert into Payment (user,Method,Movie,Theatre,Seats,Amount,Date,status) values (:user,:payMethod,:movieName,:theatreId,:seats,:amount,:date,:sta)", nativeQuery = true)
    @Transactional
    void insertPayment(@Param("user") int userId, @Param("payMethod") String payMethod,@Param("movieName") String movieName,@Param("theatreId") int theatreId, @Param("seats") int seats, @Param("amount") int amount, @Param("date") String date, @Param("sta") String sta);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update Payment p set p.sta = :status where p.id = :id")
	int updateStatus(@Param(value = "id") int id, @Param(value = "status") String status);
	
	@Query("SELECT p FROM Payment p where p.user=:userId")
	List<Payment> historyByUserId(@Param("userId") int userId);

}
