class ArgsConstructor
{
	int a,b;
	ArgsConstructor()
	{
		this.a=10;
		this.b=20;
	}
	public static void main(String args[])
	{
		ArgsConstructor obj = new ArgsConstructor();
		System.out.println("a value: "+obj.a);
		System.out.println("b value: "+obj.b);
	}
}