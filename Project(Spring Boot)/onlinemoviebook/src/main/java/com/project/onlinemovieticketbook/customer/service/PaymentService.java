package com.project.onlinemovieticketbook.customer.service;


import java.util.List;

import com.project.onlinemovieticketbook.customer.entity.PayMaster;
import com.project.onlinemovieticketbook.customer.entity.Payment;

public interface PaymentService {
	
	public PayMaster findById(int theId);
	
	
	public void insertData(int uid,String paym,String mn,int theId,int seat,int am, String date);
	
	public List<Payment> historyByUserId(int id);
	
	
}
