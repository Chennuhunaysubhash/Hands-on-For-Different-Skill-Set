package lab.exercise5;

public class Vehicle {
	int venNum;
	boolean valueSet = false;
	
	
	public  void bridge(int ven_num) {
		while(valueSet) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println(" vehicle cross  booth "+ venNum);
		this.venNum = venNum;
		valueSet = true;
		
	} 
	
}
