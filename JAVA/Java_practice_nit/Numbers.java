//import java.util.Scanner;
//import java.util.Random;
class Numbers 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the limit: ");
		int n = sc.nextInt();
		java.util.Random rand = new java.util.Random();
		for(int i = 1;i<=n;i++)
		{
			int num = rand.nextInt(100);
			System.out.println(num);
		}
	}
}
