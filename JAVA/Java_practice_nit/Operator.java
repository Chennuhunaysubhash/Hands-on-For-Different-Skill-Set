import java.util.Scanner;
class Operator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator(+,-,*,/,%)");
		char c = sc.next().charAt(0);
		if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%'){
        System.out.println("Enter the two numbers: ");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		switch(c)
		{
			case '+':
			System.out.println("Add of two numbers "+a+" and "+b+" is: "+(a+b));
			break;
			case '-':
			System.out.println("Sub of two numbers "+a+" and "+b+" is: "+(a+b));
			break;
			case '*':
			System.out.println("mul of two numbers "+a+" and "+b+" is: "+(a*b));
			break;
			case '/':
			System.out.println("Sub of two numbers "+a+" and "+b+" is: "+(a/b));
			break;
			case '%':
			System.out.println("mud of two numbers "+a+" and "+b+" is: "+(a%b));
			break;

			
		}
		}
		else
			System.out.println("in correct operation");
	}
}
