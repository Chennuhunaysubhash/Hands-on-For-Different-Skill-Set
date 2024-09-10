class  First1
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Second obj = new Second();
		Second.fun();
		obj.funMore();
		System.out.println("");
	}
}
class Second
{
	static void fun()
	{
		System.out.println("second class in fun method");
	}
	void funMore()
	{
		System.out.println("second class in funMore method");
	}
}