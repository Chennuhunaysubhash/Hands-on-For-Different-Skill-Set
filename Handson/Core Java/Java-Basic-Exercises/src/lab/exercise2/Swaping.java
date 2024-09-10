package lab.exercise2;

import java.util.Scanner;

class Swaping{

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter number of x: ");
	int x = sc.nextInt();
	System.out.print("Enter number of y: ");
        int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
    System.out.println("After swaping:"
						+ " x = " + x + ", y = " + y);
		sc.close();
	}
}


