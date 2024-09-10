package lab.exercise6;
import java.util.*;


public class Employee {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> list=new ArrayList<>();
    	ArrayList<Integer> list1=new ArrayList<>();
    	
    	System.out.println("Employee details T/F: ");
    	char op = sc.next().charAt(0);
    	
    	while(op == 'T' || op == 't') {
    		System.out.println("Enter the employee name: ");
    		String name = sc.next();
    		System.out.println("Enter the age: ");
    		int age = sc.nextInt();
    		
    		try {
    			if(list.contains(name)) {
    				 throw new NameAlreadyException("Name already Exits.");
    			}
    			else if(age < 18 || age >60) {
    				 throw new AgeException("Invalid age");
    			}
    			else {
    				list.add(name);
    				list1.add(age);
    			}}
    			catch (NameAlreadyException a) {
    				   System.out.println(a);
    	    	  }
    			catch (AgeException a) {
    				   System.out.println(a);
    				  }
    		System.out.println("Employee details T/F: ");
         op = sc.next().charAt(0);
    	}
    	sc.close();
    }
}
