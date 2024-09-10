package lab.execise8m;

import java.util.*;

import lab.exercise4m.DialyWorker;
import lab.exercise4m.SalaryWorker;
import lab.exercise4m.Worker;


public class Work {
	Scanner sc = new Scanner(System.in);
	public String workername() {
		String name1;
		  System.out.print("Enter Worker name: ");
		    name1 = sc.nextLine();
		    return name1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 ArrayList<Worker> list = new ArrayList<>(10);
		 HashSet<String> hashSet = new HashSet<>(10);
	        String name;
	        int rate;
	        int time;
		    int sal;
	    
	    Work wr = new Work(); 
	    System.out.println("Enter the Worker type(D/S): ");
        char op = sc.next().charAt(0);
        while(op == 'D' || op =='S')
        {	
        	if(op == 'D'){
        	
                name =  wr.workername(); 
        	    System.out.print("Enter rate per day: ");
                rate = sc.nextInt();
                System.out.print("Enter number of hours: ");
                time = sc.nextInt();
                DialyWorker dw = new DialyWorker(rate,time);
                sal = dw.pay(); 
                list.add(new Worker(name,"Daily",sal));
        	}
        	else{
        		name =  wr.workername(); 
        		System.out.print("Enter rate per day: ");
            	rate = sc.nextInt();
            	System.out.print("Enter number of hours: ");
            	time = sc.nextInt();
            	SalaryWorker sw = new SalaryWorker(rate,time);
            	sal = sw.pay(); 
            	list.add(new Worker(name,"Salaried",sal));
        	}
        		System.out.println("Enter the Worker type(D/S) or exit(E): ");
        		op = sc.next().charAt(0);
        	} 
        
		for (Worker i: list)
			hashSet.add(i.getName());
		for (String i: hashSet)
			System.out.println(i);
		
		sc.close();
	}
	
}
