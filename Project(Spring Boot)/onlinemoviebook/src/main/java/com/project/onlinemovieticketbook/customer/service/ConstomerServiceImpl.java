package com.project.onlinemovieticketbook.customer.service;

import java.util.List;
//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.onlinemovieticketbook.customer.entity.Customer;
import com.project.onlinemovieticketbook.customer.entity.Location;
//import com.project.onlinemovieticketbook.customer.entity.Location;
import com.project.onlinemovieticketbook.customer.entity.Login;
import com.project.onlinemovieticketbook.customer.repository.CustomerRepository;
import com.project.onlinemovieticketbook.customer.repository.LocationRepository;

@Service
public class ConstomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private LocationRepository locationRepository;
	
	public void save(Customer theCustomer) {
		
		customerRepository.save(theCustomer);
	}
	public Customer findById(int theId) {
		
		Optional<Customer> result = customerRepository.findById(theId);
		
		Customer theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theCustomer;


	}
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String login(Login l) {
		Optional<Customer> result = customerRepository.findById(l.getId());
		String dataPassword,enterPassword,name,userName,msg;

		Customer theCustomer = null;
		if (result.isPresent()) {
			theCustomer = result.get();
			System.out.println();
			dataPassword = theCustomer.getPassword();
			enterPassword = l.getPassword();
			name = theCustomer.getName();
			userName = l.getUserName();
			/*System.out.println(dataPassword);
			System.out.println(enterPassword);
			System.out.println(name);
			System.out.println(userName);*/
			if(name.equals(userName) && dataPassword.equals(enterPassword)) {
				msg = "successfully login";
			}else {
				msg = "incorrect data";
			}
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + l.getId());
		}
		return msg;
	}
	
	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}
	@Override
	public Location findLocation(int id) {
		// TODO Auto-generated method stub
		return locationRepository.findAllActiveUsers(id);
	}

}
