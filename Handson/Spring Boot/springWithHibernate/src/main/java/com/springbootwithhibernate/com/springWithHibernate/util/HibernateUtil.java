package com.springbootwithhibernate.com.springWithHibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
		.applySettings(configuration.getProperties());
		sessionFactory = configuration
		.buildSessionFactory(builder.build());
		}
		return sessionFactory;
		}
}
