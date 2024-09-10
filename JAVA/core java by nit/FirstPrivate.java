class  FirstPrivate
{
	private static int a = 10;
	private FirstPrivate()
	{
		System.out.println("Object Created");
	}
	public static void main(String[] args) 
	{
		System.out.println("a val:" + FirstPrivate.a);
		FirstPrivate obj = new FirstPrivate();
		obj.fun();
	}
	private void fun()
	{
		System.out.println("Private fun...");
	}
}
