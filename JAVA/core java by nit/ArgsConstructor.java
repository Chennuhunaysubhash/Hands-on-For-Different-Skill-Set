class ArgsConstructor
{
	int a,b;
	String c;
	short x,y;
	ArgsConstructor(short a, short b)
	{
		this.x=a;
		this.y=b;
	}
	ArgsConstructor()
	{
		this.a=110;
		this.b= 221;
	}
	ArgsConstructor(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	ArgsConstructor(String c, int b)
	{
		this.c=c;
		this.b=b;
	}
	public static void main(String args[])
	{
		ArgsConstructor obj = new ArgsConstructor(10,20);
		ArgsConstructor obj1 = new ArgsConstructor(10,22);
		ArgsConstructor obj2 = new ArgsConstructor();
		ArgsConstructor obj3 = new ArgsConstructor(155,500);
		ArgsConstructor obj4 = new ArgsConstructor("Hunay Subhash chenuu", 511);
		System.out.println("a value: "+obj.a);
		System.out.println("b value: "+obj.b);
		System.out.println("a value: "+obj1.a);
		System.out.println("b value: "+obj1.b);
		System.out.println("a value: "+obj2.a);
		System.out.println("b value: "+obj2.b);
		System.out.println("a value: "+obj3.a);
		System.out.println("b value: "+obj3.b);
		System.out.println("a value: "+obj4.c);
		System.out.println("b value: "+obj4.b);
	}
}