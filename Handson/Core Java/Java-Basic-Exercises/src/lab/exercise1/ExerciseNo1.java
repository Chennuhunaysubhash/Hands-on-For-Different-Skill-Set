package lab.exercise1;

import java.util.Scanner;
public class ExerciseNo1
{
	private ExerciseNo1() {}
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of rows: "); 
 
        int rows = sc.nextInt();
         
        for (int i= rows; i>=1; i--)
        {
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=(i*2);k++)
            {   
		if((k-1)%2!=0){
                System.out.print("* ");
		}
            } 
                System.out.println("");
        }
 sc.close();
 
    }
}
