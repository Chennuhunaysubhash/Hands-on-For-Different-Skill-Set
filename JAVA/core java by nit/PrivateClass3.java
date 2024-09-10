class PrivateClass3
{
	private PrivateClass3()
	{
		System.out.println("Private class 2 constructor");
	}
	private static void fun()
	{
		System.out.println("Private class 2 method fun");
	}
	public static PrivateClass3 getObject()
	{
		PrivateClass3 obj = new PrivateClass3();
		return obj;
	}
}

class  PrivateClass1
{
	public static void main(String[] args) 
	{
		PrivateClass3 obj = PrivateClass3.getObject();
		//PrivateClass3.fun();
	}
}
