/* write a program to calculate HCF of two given number.*/
import java.util.Scanner;
class HcfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,i,hcf=0;
		System.out.print("Enter the first number is: ");
		a = sc.nextInt();
		System.out.print("Enter the second number is: ");
		b = sc.nextInt();
		for(i = 1; i<=a|| i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf = i;
			}
		}
		System.out.println("HCF = "+hcf);
	}
}

/*ouput: 12, 24
common factors 2,3,4,6,12
high common factor is 12
*/