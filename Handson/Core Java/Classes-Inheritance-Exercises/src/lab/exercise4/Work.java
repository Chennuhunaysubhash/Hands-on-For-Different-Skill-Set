package lab.exercise4;

import java.util.*;
class Worker
{
    String name;
    float rate;
	Worker(){}
    Worker(String n,float r)
    {
        name = n;
        rate = r;
    }
     
    ArrayList<Float> arrSal1  = new ArrayList<>();  
ArrayList<Float> arrSal  = new ArrayList<>();
ArrayList<String> arrName = new ArrayList<>();
ArrayList<String> wtype = new ArrayList<>();
    public void addInfo(String n,float s, String w){
    	arrName.add(n);
	arrSal.add(s);
        wtype.add(w);
	}  
    public void displayDetails(){
	System.out.println(arrName);
	System.out.println(wtype);
	System.out.println(arrSal);
	Collections.sort(arrSal);
	System.out.println(arrSal);
    }  
    public void salsort(){
    	try {
    	
    	Collections.copy(arrSal1,arrSal);
    	Collections.sort(arrSal1);
    	}catch(Exception e){
    	System.out.println(arrSal);
    	System.out.println(arrSal1);
    	}}
}
 
class DailyWorker extends Worker
{
    private int hours;
    DailyWorker(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float pay()
    {
        int days=hours/24;
        return rate*days;
    }
}
 
class SalariedWorker extends Worker
{
    private int hours;
    SalariedWorker(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float pay()
    {
        int weeks=hours/(24*7);
        return rate*weeks;
    }
}
 
class Work
{
	Scanner sc = new Scanner(System.in);
  public String workerName(){
	  String name1;
	  System.out.print("Enter Worker name: ");
	    name1 = sc.nextLine();
	    return name1;
  }
    public static void main(String[] args)
    {
        String name;
	  
        float rate;
        int time;
	float sal;
	Scanner sc = new Scanner(System.in);
	Worker w = new Worker();
	Work wr = new Work();
	
        System.out.println("Enter the Worker type(D/S): ");
        char op = sc.next().charAt(0);
        while(op == 'D' || op =='S'){
        	
	if(op == 'D'){
	
        name =  wr.workerName(); 
	System.out.print("Enter rate per day: ");
        rate = sc.nextFloat();
        System.out.print("Enter number of hours: ");
        time = sc.nextInt();
        DailyWorker dw = new DailyWorker(name,rate,time);
        sal = dw.pay(); 
	System.out.println("Salary: "+dw.pay()+"\n\n");
 	w.addInfo(name,sal,"Daily");
	}
	else{
	
		name =  wr.workerName();
        System.out.print("Enter rate per week: ");
        rate = sc.nextFloat();
        System.out.print("Enter number of hours: ");
        time = sc.nextInt();
        SalariedWorker sw = new SalariedWorker(name,rate,time);
	    sal = sw.pay();
        System.out.println("Salary: "+sw.pay());
        w.addInfo(name,sal,"Salaried");
	}
	System.out.println("Enter the Worker type(D/S) or exit(E): ");
	op = sc.next().charAt(0);
	} 
    w.displayDetails();     
    w.salsort();
    sc.close();
    }
}