package com.myspring.app.beanlifecyclejava;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String message;
		
	   @PostConstruct
	   public void doSomethingFirst() {
		   System.out.println("Post construct......");
	   }
	   
	   @PreDestroy
	   public void doSomethinglist() {
		   System.out.println("Pre Destroy.......");
	   }
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   
}
