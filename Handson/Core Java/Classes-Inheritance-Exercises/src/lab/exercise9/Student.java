package lab.exercise9;
class Student1{
	int[] a1= {1,2,3,4,5,6,7,8,9,10};

	@Override
	public int hashCode() 
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object arg0) 
	{
		return super.equals(arg0);
	}

	int [] primeeven=new int [5];
	int [] primeodd= new int [5];
				

}
public class Student{
	@Override
	public int hashCode() {

		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	public static void main(String[] args) 
	{
		Student1 student=new Student1();
		
	
		System.out.println(student.hashCode()+" ");
		
	}

}




