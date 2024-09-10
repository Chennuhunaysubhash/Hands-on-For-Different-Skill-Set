package com.springbootwithhibernate.com.springWithHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithhibernate.com.springWithHibernate.entity.Student;
import com.springbootwithhibernate.com.springWithHibernate.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
  private StudentRepository stuRepo;
  
  public List<Student> getAll(){
	return stuRepo.fetchStudent();
	  
  }
  
  public Student get(int id) {
	return stuRepo.fetchStudentById(id);
	  
  }
  
  public void create(Student stu) {
	  stuRepo.createStudent(stu);
  }
  
  public void update(Student stu) {
	  stuRepo.update(stu);
  }
  
  public void delete(int id) {
	  stuRepo.deleteStudent(id);
  }
}
