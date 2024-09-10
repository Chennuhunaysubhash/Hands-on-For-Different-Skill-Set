/*write a program that reads a set of integers, and then print the sum of the even and odd integer(sum of the even numbers and odd numbers)*/
import java.util.Scanner;
class SumOfEvenAndOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number;
		char choice;
		int evenSum = 0, oddSum = 0;
		do
		{
			System.out.print("Enter the Number: ");
			number = sc.nextInt();
			if(number%2==0){
				evenSum = evenSum+number;
			}
			else{
				oddSum = oddSum+number; 
			}
			System.out.print("Do you want to continue y/n? :");
			choice = sc.next().charAt(0);
		}
		while (choice=='y'||choice=='Y');

		System.out.println("Sum of the even numbers: "+evenSum);
		System.out.println("Sum of the odd numbers: "+oddSum);
	}
}
