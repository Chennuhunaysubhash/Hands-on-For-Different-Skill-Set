package lab.exercise9;

import java.util.Scanner;

public class Formatting{
	public void generatePassword(String n){
		int nu=Integer.parseInt(n);
		int len = n.length();
		while(len>5){
		String s;
		nu = nu/5;
		s = String.valueOf(nu);
		len = s.length();
		}
		
		System.out.println("Octal "+Integer.toOctalString(nu));
		System.out.println("Hexadecimal "+Integer.toHexString(nu));
}

	public static void main(String[] args) {
		String str;
		int i;
		Formatting ob = new Formatting();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String str1 ="";
		System.out.print("\n Please Enter any String to Print =  ");
		str = sc.nextLine();
		
		for(i = 0; i < str.length(); i++)
		{
			
			int num = str.codePointAt(i);
			int reverse = 0;
			
			while(num != 0)   
			{  
			int remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
			}  
                	str1 += String.valueOf(reverse);
			
		}
             
	     ob.generatePassword(str1);	
	     sc.close();
	}
}