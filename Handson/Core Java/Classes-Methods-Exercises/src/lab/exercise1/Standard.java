package lab.exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Standard {
	
	int n=5;
	
	ArrayList<Marks> al=new ArrayList<Marks>();
	Marks marks=new Marks();
	
	Scanner scanner=new Scanner(System.in);
	
	public void setDetails()
	{
		
		
		System.out.println("Enter the size of Array");
		int si=scanner.nextInt();
		
		for(int i=0;i<si;i++)
		{
			System.out.println("Enter  regNo");
			int roll=scanner.nextInt();
			System.out.println("Enter  Name");
			String nam=scanner.next();
			System.out.println("Enter Marks in English");
			int english=scanner.nextInt();
			System.out.println("Enter Marks in  Maths");
			int maths=scanner.nextInt();
			System.out.println("Enter Marks in Science");
			int science=scanner.nextInt();
			
			Marks m=new Marks(roll, nam, english, maths, science);
		al.add(m);
			System.out.println(al.add(m));
			
	
		}
		
	}
	
	public void sort(int[] ar)
	{
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}	
		}
	}
	public void asseOfRegNo()
	{
		
		Iterator<Marks> iterator=al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getRegNo());
			System.out.println(iterator.next().getName());
			System.out.println(iterator.next().getMarksInEng());
			System.out.println(iterator.next().getMarksInMaths());
			System.out.println(iterator.next().getMarksInScience());
		}
		
		
	}
	
	

}
