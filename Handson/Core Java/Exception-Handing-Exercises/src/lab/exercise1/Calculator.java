package lab.exercise1;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public void add(int a,int b) {
		try {
			System.out.println("Add of two: "+ (a+b));
		}
		
		catch(ArithmeticException x) {
			System.out.println("Arithmetic exception");
		}	   
	}
	public void div(int a,int b) {
		try {
			System.out.println("Divition of two: "+ a/b);
		}
		catch(ArithmeticException x) {
			System.out.println("Arithmetic exception");	
		}
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		try {
		System.out.println("Enter the two number for addition and divition");
		System.out.print("first number: ");
		x = sc.nextInt();
		System.out.print("second number: ");
		y = sc.nextInt();
		c.add(x, y);
		c.div(x, y);
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch exception..... ");
		}
		sc.close();
	}
}
