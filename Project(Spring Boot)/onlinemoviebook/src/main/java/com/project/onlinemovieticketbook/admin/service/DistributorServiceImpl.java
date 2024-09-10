package com.project.onlinemovieticketbook.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinemovieticketbook.admin.entity.Distributor;

import com.project.onlinemovieticketbook.distributor.entity.DistributorLogin;
import com.project.onlinemovieticketbook.admin.repository.AdminRepository;
import com.project.onlinemovieticketbook.admin.repository.DistributorRepository;

@Service
public class DistributorServiceImpl implements DistributorService {
    
	@Autowired
	private DistributorRepository distributorRepository;
	
	@Autowired
	private AdminRepository AdminRepository;
	
	@Override
	public List<Distributor> findAll() {
		// TODO Auto-generated method stub
		return distributorRepository.findAll();
	}

	@Override
	public Distributor findById(int theId) {
		Optional<Distributor> result = distributorRepository.findById(theId);
		
		Distributor theDistributor = null;
		
		if (result.isPresent()) {
			theDistributor = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return theDistributor;
	}
	
	
	@Override
	public void deleteById(int theId) {
		distributorRepository.deleteById(theId);
	}


	@Override
	public void save(Distributor theDistributor) {
		distributorRepository.save(theDistributor);
	}
	@Override
	public String login(DistributorLogin l) {
		Optional<Distributor> result = distributorRepository.findById(l.getId());
		String dataPassword,enterPassword,name,userName,msg;

		Distributor theDistributor = null;
		if (result.isPresent()) {
			theDistributor = result.get();
			System.out.println();
			dataPassword = theDistributor.getPassword();
			enterPassword = l.getPassword();
			name = theDistributor.getName();
			userName = l.getDistributor();
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
			throw new RuntimeException("Did not find the Distributor id - " + l.getId());
		}
		return msg;
	}

	@Override
	public int soldTicketLoc(int locId, int movId,int disId) {
		// TODO Auto-generated method stub
		return AdminRepository.soldTicketLocation(locId, movId,disId);
	}

	@Override
	public int soldTicketMovie(int movId) {
		// TODO Auto-generated method stub
		return AdminRepository.soldTicketMovie(movId) ;
	}

	@Override
	public int soldTicketTheater(int id) {
		// TODO Auto-generated method stub
		return AdminRepository.soldTicketTheater(id);
	}

	

}
