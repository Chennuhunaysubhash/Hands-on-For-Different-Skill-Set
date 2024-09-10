package lab.exercise4;

import java.util.Scanner;
public class ExerciseNo4{
	
 public static double product(int nm){
    double price;
    switch(nm){
    case 1:
     price=22.50;
     break;
    case 2:
     price=44.50;
     break;
    case 3:
     price=9.98;
     break;
    default:
      price=0.0;
 
    }
  return price;
 }
 
 
   public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
   double[] price={22.98,44.50,9.98};
   System.out.println("Item#    Price");
   double total = 0;
   for(int i=0;i<price.length;i++){
  
    System.out.printf("%3d %9.2f\n",i+1,price[i]);
  
   }
   
   System.out.println("Select Item NUmber Or -1 to Quit : ");
   int select=sc.nextInt();
   while(select !=-1){
 	  System.out.println(product(select));
          total+=product(select);
          System.out.println("Select Item NUmber Or -1 to Quit : ");
          select=sc.nextInt();
   }
   System.out.println("Total Retail : "+total);
   sc.close();
  }
}