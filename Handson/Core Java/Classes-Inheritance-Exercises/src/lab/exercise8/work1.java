package lab.exercise8;



import java.util.*;
class Worker1
{
    String name;
    float rate;
	Worker1(){}
    Worker1(String n,float r)
    {
        name = n;
        rate = r;
    }
     
    
HashSet<Float> arrSal  = new HashSet<>();
HashSet<String> arrName = new HashSet<>();
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
	
    }  
  
}
 
class DailyWorker1 extends Worker
{
    private int hours;
    DailyWorker1(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float comPay()
    {
        int days=hours/24;
        return rate*days;
    }
}
 
class SalariedWorker1 extends Worker
{
    private int hours;
    SalariedWorker1(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float comPay()
    {
        int weeks=hours/(24*7);
        return rate*weeks;
    }
}
 
class Work1
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
	Worker1 w = new Worker1();
	Work1 wr = new Work1();
	
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
        sal = dw.comPay(); 
	System.out.println("Salary: "+dw.comPay()+"\n\n");
 	w.addInfo(name,sal,"Daily");
	}
	else{
	
		name =  wr.workerName();
        System.out.print("Enter rate per week: ");
        rate = sc.nextFloat();
        System.out.print("Enter number of hours: ");
        time = sc.nextInt();
        SalariedWorker sw = new SalariedWorker(name,rate,time);
	    sal = sw.comPay();
        System.out.println("Salary: "+sw.comPay());
        w.addInfo(name,sal,"Salaried");
	}
	System.out.println("Enter the Worker type(D/S) or exit(E): ");
	op = sc.next().charAt(0);
	} 
    w.displayDetails();  
  	
    sc.close();
    }
}
