class PrivateClass2
{
	private PrivateClass2()
	{
		System.out.println("Private class 2 constructor");
	}
	private static void fun()
	{
		System.out.println("Private class 2 method fun");
	}
}

class  PrivateClass1
{
	public static void main(String[] args) 
	{
		PrivateClass2 obj = new PrivateClass2();// error because of Private class 
		PrivateClass2.fun();// error because of Private class
	}
}
