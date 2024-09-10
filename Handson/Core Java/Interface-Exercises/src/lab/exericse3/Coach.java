package lab.exericse3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coach
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		  ArrayList<String> list1 = new ArrayList<>(10);
		  ArrayList<Coaching> list = new ArrayList<>(10);
		  
		  list1.add("hunay");
	      list1.add("subhash");
	      list1.add("scott");
	      list1.add("smith");
	      list1.add("sai");
	      list1.add("amith");
	      list1.add("back");
	      list1.add("yash");
	      list1.add("virat");
		
	      System.out.println("Enter the Option to add Grade(T/F)");
	      char op = sc.next().charAt(0);
	      while(op == 'T' ||op == 't') {
	    	  System.out.println("Enter the Alhlet name: ");
	    	  String name = sc.next();
	    	  if(list1.contains(name)) {
	    		  System.out.println("Enter the Grade of alhlet: ");
	        	  String g = sc.next();
	        	 
	        	  list.add(new Coaching(name,g));
	    	  }
	    	  else {System.out.println("alhlet name not in list");}
	    	  System.out.println("Enter the Option to add Grade(T/F)");
	    	  op = sc.next().charAt(0);
	      }  
	      
				
		System.out.println("\nSorted by grade");
		
		
		GradeCompare gradecompare = new GradeCompare();
		Collections.sort(list, gradecompare);
		for (Coaching j: list)
			System.out.println(j.getName() + " " +j.getGande());
		
		
sc.close();	

		
	}
}