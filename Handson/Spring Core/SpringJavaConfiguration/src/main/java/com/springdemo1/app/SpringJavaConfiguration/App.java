package com.springdemo1.app.SpringJavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
         Client client1 = (Client) appContext.getBean("client");
         Client client2 = (Client) appContext.getBean("client");
         client2.doSomething("client2");
         client1.doSomething("client1");
    }
}
