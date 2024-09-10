package com.myspring.app.beanlifecyclejava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class MainApp {
	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();
	      context.close();
	   }
}
