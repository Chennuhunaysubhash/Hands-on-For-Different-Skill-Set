package com.myspring.app.Hibernate_test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        List<Student> ths = session.createQuery("from Student s where s.id = 2").list();
        displayStudent(ths);
        //session.save(st);
        tx.commit();
        //session.close();
        //session = factory.getCurrentSession();
        //update based on the primary ket like id
        /*Student mystudent = session.get(Student.class, 1);
        mystudent.setName("Subhash");
        tx.commit();*/
        session.close();
        /*session = factory.openSession();
        session.beginTransaction();
        session.createQuery("update Student set email = 'abc@gmail.com'").executeUpdate();
        session.getTransaction().commit();*/
        System.out.println(factory);
        System.out.println(factory.isClosed());
    }

	private static void displayStudent(List<Student> ths) {
		for(Student i: ths) {
        	System.out.println(i);
        }
	}
}
