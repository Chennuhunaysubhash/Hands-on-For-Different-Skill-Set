package com.example.demo.respository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserRepository {
	private Map<Integer, User> users = new HashMap<Integer, User>();
	
	@PostConstruct
	public  void setup() {
		users.put(1, new User(1,"hunay subhash"));
		users.put(2, new User(2,"chennu durga"));
	}
	public void save(User user) {
		users.put(user.getId(), user);
	}
	
	public List<User> findAll(){
		return new ArrayList<User>(users.values());
		
	}
	
	public User find(int id) {
		return users.get(id);
		
	}
	
	public void  update(int id, User user) {
		users.put(id, user);
	}
	
	public void delete(int id) {
		users.remove(id);
	}
	
}

