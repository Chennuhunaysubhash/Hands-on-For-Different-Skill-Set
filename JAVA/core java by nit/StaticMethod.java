class  StaticMethod
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		staticMethod();
		staticMethod1(10, 50);
		int x = staticMethod2(12, 34);
		System.out.println("the value of two numbers is :"+x);
		int y = staticMethod3();
		System.out.println("the value of two numbers is :"+y);


	}
	static void staticMethod()
	{
		System.out.println("method with no arguments and return type");
		//staticMethod();
	}
	static void staticMethod1(int p, int q)
	{
		int c = p + q; 
		System.out.println("method with augment and no return type");
		System.out.println("  valus: "+c);
	}
	static int staticMethod2(int a, int b)
	{
		int c = a+b;
		System.out.println("method with arguments and return types");
		return c;
	}
	static int staticMethod3()
	{
		int a = 10, b= 20;
		int c = a + b;
		System.out.println("method with argument and no return type");
		return c;
	}
		
}
