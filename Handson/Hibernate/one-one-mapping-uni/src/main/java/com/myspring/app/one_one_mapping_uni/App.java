package com.myspring.app.one_one_mapping_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "project started" );
    	
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        Instructor tempInstructor = 
				new Instructor("Chad", "Darby", "darby@luv2code.com");
		
		/*InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.luv2code.com/youtube",
						"Luv 2 code!!!");
		tempInstructor.setInstructorDetail(tempInstructorDetail);*/
		session = factory.openSession();
        Transaction tx = null;
        try {
        //tx = session.beginTransaction();
        session.beginTransaction();
        System.out.println("Saving instructor: " + tempInstructor);
		session.save(tempInstructor);	

		tx.commit();
		System.out.println("Done!");
    	} catch(Exception e) {
    		if(tx != null) {
    			tx.rollback();
    		}
    		//e.printStackTrace();
    	}
		session.close();
		
		
		factory.close();
    }
}
