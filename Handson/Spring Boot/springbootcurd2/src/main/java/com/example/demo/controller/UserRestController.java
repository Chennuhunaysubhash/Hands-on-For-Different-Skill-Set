package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.respository.UserRepository;


@RestController
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public void save(@RequestBody User user) {
		userRepository.save(user);
	}
	@RequestMapping(value="/users", method=RequestMethod.GET)
	//@GetMapping("/users")
	//@GetMapping(value = "/product")
	public List<User> list(){
		return userRepository.findAll();
		
	}
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User get(@PathVariable("id") int id) {
		return userRepository.find(id);		
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody User user) {
		userRepository.update(id, user);
	}
	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id)
	{
		userRepository.delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.OK);
		
	}
}
