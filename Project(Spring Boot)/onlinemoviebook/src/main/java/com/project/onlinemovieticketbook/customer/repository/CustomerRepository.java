package com.project.onlinemovieticketbook.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlinemovieticketbook.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
