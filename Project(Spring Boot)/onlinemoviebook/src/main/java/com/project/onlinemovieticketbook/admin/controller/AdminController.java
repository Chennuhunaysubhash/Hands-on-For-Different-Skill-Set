

package com.project.onlinemovieticketbook.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.onlinemovieticketbook.admin.entity.Distributor;
import com.project.onlinemovieticketbook.customer.entity.Location;
import com.project.onlinemovieticketbook.customer.entity.Movie;
import com.project.onlinemovieticketbook.admin.entity.UpdateMovie;
import com.project.onlinemovieticketbook.admin.entity.UpdatePrice;
import com.project.onlinemovieticketbook.admin.entity.UpdateStatus;
import com.project.onlinemovieticketbook.admin.service.AdminServiceImpl;
import com.project.onlinemovieticketbook.admin.service.DistributorServiceImpl;
import com.project.onlinemovieticketbook.admin.service.LocationServiceImpl;


@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private LocationServiceImpl locationServiceImpl;
	
	@Autowired
	private DistributorServiceImpl distributorServiceImpl;
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	
	
	@GetMapping("/location")
	public List<Location> findAllLocation() {
		return locationServiceImpl.findAll();	
	}
	
	@GetMapping("/location/{locId}")
 	public Location getLocation(@PathVariable int locId) {
		
		Location theLocation = locationServiceImpl.findById(locId);
		
		if (theLocation == null) {
			throw new RuntimeException("Employee id not found - " + locId);
		}	
		return theLocation;
	}
	
	@PostMapping("/location")
	public Location addLocation(@RequestBody Location l) {
		l.setId(0);
		locationServiceImpl.save(l);
		return l;
	} 
	
	@DeleteMapping("/location/delete/{locId}")
	public String deleteLocation(@PathVariable int locId) {
		
		Location tempLocation = locationServiceImpl.findById(locId);
		
		// throw exception if null
		
		if (tempLocation == null) {
			throw new RuntimeException("Employee id not found - " + locId);
		}
		
		locationServiceImpl.deleteById(locId);
		
		return "Deleted location id - " + locId;
		
	}
	
	/*the following code about Distributor related things...*/
	
	@GetMapping("/distributor")
	public List<Distributor> findAllDistributor() {
		return distributorServiceImpl.findAll();	
	}
	
	@GetMapping("/distributor/{disId}")
	public Distributor getDistributor(@PathVariable int disId) {
	
	Distributor theDistributor = distributorServiceImpl.findById(disId);
	
	if (theDistributor == null) {
		throw new RuntimeException("Distributor id not found - " + disId);
	}
	
	return theDistributor;
	}
	
	@PostMapping("/add/distributor")
	public Distributor addDistributor(@RequestBody Distributor d) {
		d.setId(0);
		distributorServiceImpl.save(d);
		return d;
	} 
	
	@DeleteMapping("/delete/distributor/{disId}")
	public String deleteDistributor(@PathVariable int disId) {
		
		Distributor tempDistributor = distributorServiceImpl.findById(disId);
		
		// throw exception if null
		
		if (tempDistributor == null) {
			throw new RuntimeException("Distributor id not found - " + disId);
		}
		
		distributorServiceImpl.deleteById(disId);
		
		return "Deleted Distributor id - " + disId;
	}
	/*the following code about Movie related things...*/
	
	@GetMapping("/theater")
	public List<Movie> findAllMovie() {
		return adminServiceImpl.findAll();
	}
	
	@GetMapping("/theater/{locId}")
 	public Movie getMovie(@PathVariable int locId) {
		
		Movie theMovie = adminServiceImpl.findById(locId);
		
		if (theMovie == null) {
			throw new RuntimeException("Theater id not found - " + locId);
		}	
		return theMovie;
	}
	
	@PostMapping("/add/theater")
	public Movie addTheater(@RequestBody Movie d) {
		d.setId(0);
		adminServiceImpl.save(d);
		return d;
	} 
	
	@DeleteMapping("/theater/delete/{disId}")
	public String deleteTheater(@PathVariable int disId) {
		
		Movie tempMovie = adminServiceImpl.findById(disId);
		
		// throw exception if null
		
		if (tempMovie == null) {
			throw new RuntimeException("Distributor id not found - " + disId);
		}
		
		adminServiceImpl.deleteById(disId);
		
		return "Deleted theater id - " + disId;
	}
	
	@PutMapping("/update/price")
	public String updateEmail(@RequestBody UpdatePrice theUpdate) {
		
		Movie tempMovie = adminServiceImpl.findById(theUpdate.getId());
		
		// throw exception if null
		
		if (tempMovie == null) {
			throw new RuntimeException("Theater id not found - " + theUpdate.getId());
		}
		int a = theUpdate.getId();
		int b = theUpdate.getPrice();
		adminServiceImpl.updatePrice(a,b);
		return "Successfully Update The Movie Price In The Following Theater "+tempMovie.getTheatre();
	}
	
	@PostMapping("/update/movie/name")
	public String updateMovie(@RequestBody UpdateMovie theMovie) {
		Movie tempMovie = adminServiceImpl.findById(theMovie.getId());
		
		// throw exception if null
		
		if (tempMovie == null) {
			throw new RuntimeException("Theater id not found - " + theMovie.getId());
		}
		
		adminServiceImpl.updateMovie(theMovie.getId(), theMovie.getMovieName(),theMovie.getMovieId(),theMovie.getDistributorId());
		return "Successfully Update The Movie In The Following Theater "+tempMovie.getTheatre()+" With The Following Movie "+theMovie.getMovieName();
	}
	
	@PostMapping("/update/movie/status")
	public String updateStatus(@RequestBody UpdateStatus theStatus) {
		
		Movie tempMovie = adminServiceImpl.findById(theStatus.getId());
		
		// throw exception if null
		
		if (tempMovie == null) {
			throw new RuntimeException("Theater id not found - " + theStatus.getId());
		}
		adminServiceImpl.updateStatus(theStatus.getId(), theStatus.getStatus());
		
		return "Successfully Update The Theater Status In The Following Theater "+tempMovie.getTheatre();
	}
}

