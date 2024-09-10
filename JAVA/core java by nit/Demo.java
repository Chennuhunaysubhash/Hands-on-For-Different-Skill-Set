class Demo 
{
	static Demo obj = new Demo();// local object so only used in class
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo.obj.m1();
	}
	void m1()
	{
		System.out.println("m1......");
		this.m2();
	}
	void m2()
	{
		System.out.println("m2.....");
	}
}
