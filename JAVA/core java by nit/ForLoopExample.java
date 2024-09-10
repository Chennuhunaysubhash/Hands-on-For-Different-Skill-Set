import java.util.Scanner;
class ForLoopExample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int sum = 0, count = 0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				//sum = sum + i;
				//System.out.println(count);	
				count++;

			}
		}
		/*if(sum == n){
			System.out.println(n + "is perfect number");
		}*/
		if(count == 2){
			System.out.println(n +" is a prime number");
		}
		else{
			System.out.println(n +" is not a prime number");
		}
		//System.out.println("\n"+sum);

	}
}
