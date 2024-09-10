package lab.exercise3;

import java.util.Scanner;
public class ExerciseNo3{
   public static void main(String[] args){
      int income;
      char gender;	
      System.out.print("Enter Gender(M/F) : ");
      Scanner sc = new Scanner(System.in);
      
      gender = sc.next().charAt(0);
      System.out.print("Enter the income range : ");
      income = sc.nextInt();
      if(gender =='F' || gender =='f')
      {
	if(income<=190000){
		System.out.println("Your income in range. so NO tax is applicable.");
	}
	else if(income>=190001 && income<=500000){
		
		System.out.println("Your income out of range. so 10% tax is applicable.");
	}
	else if(income>=500001 && income<=800000){
		System.out.println("Your income out of range. so 20% tax is applicable.");
	}
        else{
		System.out.println("Your income out of range. so 30% tax is applicable.");
	}        
      }
      else if(gender =='M' || gender =='m')
      {
	if(income<=180000){
		System.out.println("Your income in range. so NO tax is applicable.");
	}
	else if(income>=180001 && income<=500000){
		
		System.out.println("Your income out of range. so 10% tax is applicable.");
	}
	else if(income>=500001 && income<=800000){
		System.out.println("Your income out of range. so 20% tax is applicable.");
	}
        else{
		System.out.println("Your income out of range. so 30% tax is applicable.");
	}    	
      }
	else{
		System.out.println("Invalid option");
	}
      sc.close();
   }
}