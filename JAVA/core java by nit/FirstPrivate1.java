class SecondPrivate 
{
	static int a = 10;
	private static int b = 20;

}

class FirstPrivate1
{
	public static void main(String[] args)
	{
		System.out.println("a value: "+SecondPrivate.a);
		System.out.println("b value: "+SecondPrivate.b);
	}
}