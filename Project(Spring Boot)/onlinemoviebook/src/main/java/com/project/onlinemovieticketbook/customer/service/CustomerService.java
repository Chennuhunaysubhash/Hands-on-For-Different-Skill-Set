package com.project.onlinemovieticketbook.customer.service;

import java.util.List;

//import java.util.List;

//import java.util.List;

import com.project.onlinemovieticketbook.customer.entity.Customer;
import com.project.onlinemovieticketbook.customer.entity.Location;
import com.project.onlinemovieticketbook.customer.entity.Login;



public interface CustomerService {
	
	//public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void save(Customer theCustomer);
	
	public void deleteById(int theId);
	
	public String login(Login l);
	
	public List<Location> findAll();
	
	public Location findLocation(int id);
}
