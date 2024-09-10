package com.project.onlinemovieticketbook.customer.service;

import com.project.onlinemovieticketbook.customer.entity.Payment;

public interface BookingCancelService {
	public Payment findById(int theId);
	public void updateStatusC(int id,String status);
}
