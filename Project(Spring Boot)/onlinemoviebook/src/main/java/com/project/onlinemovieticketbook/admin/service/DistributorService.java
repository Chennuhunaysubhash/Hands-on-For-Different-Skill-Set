package com.project.onlinemovieticketbook.admin.service;

import java.util.List;

//import com.project.onlinemovieticketbook.admin.entity.Admin;
import com.project.onlinemovieticketbook.admin.entity.Distributor;
import com.project.onlinemovieticketbook.distributor.entity.DistributorLogin;



public interface DistributorService {
	
	public List<Distributor> findAll();
	public Distributor findById(int theId);
	//public String login(Login l);
	public void deleteById(int theId);
	
	
	public void save(Distributor theDistributor);
	
  
	
	public String login(DistributorLogin l);
	
	public int soldTicketLoc(int locId,int movId,int disId);
	
	public int soldTicketMovie(int movId);
	
	public int soldTicketTheater(int id);
	
}
