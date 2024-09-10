package com.mycompany.app.Ecomapp;

import com.mycompany.app.Calculator.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	static Calculator c;
	static int r;
    public static void main( String[] args )
    {
    	callCal();
        System.out.println( "Hello World!" );
    }
    static void callCal() {
    	c = new Calculator();
    	 r = c.add(10, 20);
    	System.out.println(r);
    }
}
