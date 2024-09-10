package com.myspring.app.Insert_Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.source.internal.MetadataImpl;
import org.hibernate.service.BootstrapServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class App 
{
	static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		Configuration configuration = new Configuration().configure("hibernate/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
		.applySettings(configuration.getProperties());
		sessionFactory = configuration
		.buildSessionFactory(builder.build());
		}
		return sessionFactory;
		}
    public static void main( String[] args )
    {
    	/*ServiceRegistry ssr=new BootstrapServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta=new MetadataImpl(ssr).getMetadataBuilder().build();
    	SessionFactory factory=meta.getSessionFactoryBuilder().build();*/
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
    	Session session = factory.getCurrentSession();
    	
    	try {			
			// create a student object
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");
			Student tempStudent1 = new Student("hunay", "chennu", "paul@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			session.save(tempStudent);
			session.save(tempStudent1);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}catch(Exception e) {}
		finally {
			factory.close();
		}
    }
    
}
