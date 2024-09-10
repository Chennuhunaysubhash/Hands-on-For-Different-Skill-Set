/*Two number are entered through the keyboard. write a program to find the value of one number rasied to the power of anthor.(Do not use Java built in method)*/
import java.util.Scanner;

class PowerOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Power is: ");
		int power = sc.nextInt();
		System.out.print("Enter the Base is: ");
		int base = sc.nextInt();
		System.out.println();
		int result = 1;
		for(int i =1;i<=power;i++)
		{
			result = result*base;
		}
		System.out.println(base+" power "+power+" is: "+result);
	}
}
