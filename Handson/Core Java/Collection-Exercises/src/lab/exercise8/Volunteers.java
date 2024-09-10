package lab.exercise8;


import java.util.*;
class Volunteers {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		SortedSet<Integer> ts = new TreeSet<>();
		int id;
		// Elements are added using add() method
		System.out.println("you want to add the employee ids for voluteers(T/F): ");
		char op = sc.next().charAt(0);
		while(op == 'T' || op=='t') {
			System.out.println("Empolyee id:");
			id = sc.nextInt();
			ts.add(id);
			System.out.println("you want to add the employee ids for voluteers(T/F): ");
			op = sc.next().charAt(0);
		}
		
		for(int i:ts)
			System.out.println(i);
  sc.close();
	}
	
}
