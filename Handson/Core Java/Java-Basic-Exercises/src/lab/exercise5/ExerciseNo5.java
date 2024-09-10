package lab.exercise5;

import java.util.Scanner;
public class ExerciseNo5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Eggs: ");
                int num = sc.nextInt();
		int[] arr = new int[5];
		int dig;
		for(int i=0; num>=0 && i<=2;i++)
		{
			if(num>=144){
			dig = num/144;
			num = num%144;
			arr[i]=dig;	
			}
			else if(num>=12){
			dig = num/12;
			num = num%12;
			arr[i] = dig;
			}
			else{
			
			arr[i] = num;	
			}
		} 
		
		System.out.println("Your number of eggs is "+arr[0]+" gross,"+arr[1]+" dozen, and "+arr[2]);
		sc.close();
}
}