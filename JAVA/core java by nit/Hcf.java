class Hcf 
{
	public static void main(String[] args) 
	{
		int a, b, i, hcf=0;
		a = 12;
		b = 16;
		for (i = 1; i<=a || i<=b; i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				hcf = i;
			}
		}
		System.out.println("" + hcf);
	}
}
