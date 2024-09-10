package com.project.onlinemovieticketbook.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinemovieticketbook.customer.entity.PayMaster;
import com.project.onlinemovieticketbook.customer.entity.Payment;
import com.project.onlinemovieticketbook.customer.repository.PayMasterRepository;
import com.project.onlinemovieticketbook.customer.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PayMasterRepository payMasterRepository;
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PayMaster findById(int theId) {
		Optional<PayMaster> result = payMasterRepository.findById(theId);
		
		PayMaster thePayment = null;
		
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
	public void insertData(int uid, String paym, String mn, int theId, int seat, int am, String d) {
		// TODO Auto-generated method stub
		 paymentRepository.insertPayment(uid, paym, mn, theId, seat, am, d, "done");
	}

	@Override
	public List<Payment> historyByUserId(int id) {
		// TODO Auto-generated method stub
		return paymentRepository.historyByUserId(id);
	}


}
