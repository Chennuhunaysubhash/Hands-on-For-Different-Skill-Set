package com.springbootwithhibernate.com.springWithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithhibernate.com.springWithHibernate.entity.Student;
import com.springbootwithhibernate.com.springWithHibernate.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stuService;
	
	@GetMapping("/student")
	public List<Student> list(){
		return stuService.getAll();
		
	}
	
	@GetMapping("/student/{id}")
	public Student get(@PathVariable int id) {
		return stuService.get(id);
		
	}
	
	@PostMapping("/student")
	public void save(@RequestBody Student stu) {
		stuService.create(stu);
	}
	
	@PutMapping("/student/{id}")
	public void update(@PathVariable("id") int id,@RequestBody Student stu) {
		Student stu1 = stuService.get(id);
		stuService.update(stu1);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id){
		stuService.delete(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE,HttpStatus.OK);
	}
}
