package com.springbootwithhibernate.com.springWithHibernate.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.springbootwithhibernate.com.springWithHibernate.entity.Student;
import com.springbootwithhibernate.com.springWithHibernate.util.HibernateUtil;

@Repository
public class StudentRepository {
	static SessionFactory sessionFactory = null;
	
	public void displayStudent() {
		List<Student> stulist = fetchStudent();
		for(Student stu: stulist) {
			System.out.println(stu.toString());
		}
	}
	
	public Integer createStudent(Student s) {
		System.out.println("create student..");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		System.out.println("student created successfully "+s.toString());
		return s.getId();
	}
	@SuppressWarnings("unchecked")
	public List<Student> fetchStudent(){
		System.out.println("Fetch student..");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		List<Student> student1 = session.createQuery("from Student").list();
		session.close();
		System.out.println("Fetched "+student1.size()+" student");
		return student1;
	}
	
	public Student fetchStudentById(Integer id) {
		System.out.println("fetching student by id..");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Student s = (Student) session.load(Student.class, id);
		System.out.println(s.toString());
		session.close();
		return s;
	}
	
	
	public void update(Student s) {
		System.out.println("updateing student...");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student st = (Student) session.get(Student.class, s.getId());
		st.setFirstName(s.getFirstName());
		st.setEmail(s.getEmail()+".in");
		session.getTransaction().commit();
		session.close();
		System.out.println("student updted successfully"+s.toString());
	}
	
	public void deleteStudent(Integer id) {
		System.out.println("deletteing student...");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Student s = fetchStudentById(id);
		session.delete(s);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully deleted "+s.toString());
	}
	
	public void deteleAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Student ");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
}
