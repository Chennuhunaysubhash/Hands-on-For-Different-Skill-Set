package lab.exercise6;

import java.util.Scanner;
class ExerciseNo6  
{     
     
    public static void main(String[] args)  
    {  
        
        Scanner sc = new Scanner(System.in);  
        int number;
        int temp;
        int rem;
        int i;
        int count;
        int sum; 
         count = 0;  
         sum = 0;  
          
        System.out.print("Enter number to check: ");  
        number = sc.nextInt();  
        temp = number;  
     
        for(i = 1; i <= temp; i++)  
        {  
            if(temp%i == 0)  
            {  
                count++;      
            }  
        }  
          
         
        while(number > 0)  
        {  
            rem = number%10;  
            sum = sum*10+rem;   
            number = number/10;   
        }    
        if(temp == sum && count == 2)  
        {  
            System.out.println(temp+"P");  
        }  
        else if(temp == sum)  
        {  
            System.out.println(temp +" is a Palindrome number");  
        }
        else if(count == 2) {
	    System.out.println(temp+"P");	
	}
        else{System.out.println("number is not a palindrome and prime");} 
        
       
        }  
}  