import java.util.Scanner;
class  ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int arm = sc.nextInt();
        int temp,temp1,count=0;
		temp = arm;
		
		int num = arm,count1 = 0,result=1;
		while(num>0){
			num = num/10;
			count1 = count1 + 1; 
		}
		//System.out.println(count1);
		while(temp>0)
		{
			temp1 = temp%10;
			int loop = count1;
			while(loop>0){
				result= result*temp1;
				loop = loop-1;
			}
			count = count + result;
			temp = temp/10;
			result = 1;
			
		}
		//System.out.println(count);
		if(count==arm)
		{
			System.out.println("the "+arm+" number is Armstrong number");
			System.out.println();
		}
		else
		{
			System.out.println("the "+arm+" number is not a Armstrong number");
			System.out.println();
		}
	}
}
