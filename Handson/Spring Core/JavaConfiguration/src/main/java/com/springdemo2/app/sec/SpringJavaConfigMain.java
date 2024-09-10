package com.springdemo2.app.sec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo2.app.JavaConfiguration.ApplicationConfiguration;
import com.springdemo2.app.Mainpro.Country;

public class SpringJavaConfigMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Country countryObj = (Country) appContext.getBean("countryObj");
		String countryName=countryObj.getCountryName();
		
		System.out.println("Country name: "+ countryName);
	}
}
