import java.util.Scanner;
class  ArrayExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] =new int[5];
        System.out.println("Enter the numbers: "); 
		int sum =0;
        for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
		System.out.println("numbers are print");
		for(int j = 0;j<5;j++){
			System.out.print(arr[j]);
		}
		System.out.println("sum is:"+sum);
	}
}
