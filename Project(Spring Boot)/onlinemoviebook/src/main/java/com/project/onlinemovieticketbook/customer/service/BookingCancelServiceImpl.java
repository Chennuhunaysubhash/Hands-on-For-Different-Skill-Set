package com.project.onlinemovieticketbook.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinemovieticketbook.customer.entity.Payment;
import com.project.onlinemovieticketbook.customer.repository.PaymentRepository;

@Service
public class BookingCancelServiceImpl implements BookingCancelService {

	@Autowired
	private PaymentRepository paymentRepository;
	@Override
	public Payment findById(int theId) {
    Optional<Payment> result = paymentRepository.findById(theId);
		
		Payment thePayment = null;
		
		if (result.isPresent()) {
			thePayment = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find payment id - " + theId);
		}
		
		return thePayment;
	}

	@Override
	public void updateStatusC(int id, String status) {
		// TODO Auto-generated method stub
		paymentRepository.updateStatus(id, status);
	}

}
