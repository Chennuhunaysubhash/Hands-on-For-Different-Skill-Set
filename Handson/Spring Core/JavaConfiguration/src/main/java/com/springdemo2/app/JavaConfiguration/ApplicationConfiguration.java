package com.springdemo2.app.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springdemo2.app.Mainpro.Country;

@Configuration
 public class ApplicationConfiguration{
	 @Bean(name="countryObj")
	 public Country getCountry() {
		 return new Country("India");
	 }
 }

