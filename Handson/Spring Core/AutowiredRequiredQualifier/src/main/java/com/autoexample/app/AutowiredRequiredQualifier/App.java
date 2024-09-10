package com.autoexample.app.AutowiredRequiredQualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("ch2-beans.xml");
        Animal animal = (Animal) app.getBean("dog");
        System.out.println(animal.character());
    }
}
