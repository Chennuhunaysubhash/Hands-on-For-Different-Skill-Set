/*Write a program for reversed the Integer Number(Ex: 12345 ---> 54321) */
import java.util.Scanner;
class IntegerReversed  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Integer Number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int temp;
		int remainder =0;
		temp = num;
		/*main logic of program*/
		while(temp>0)
		{
			remainder = temp%10;
			reverse = reverse*10+ remainder;
			temp = temp/10;  //temp /= 10;
		}
		System.out.println(); // just for output format
		System.out.println("Reverse of Integer Number"+num+" is: "+reverse);
		System.out.println(); // just for output format

	}
}
