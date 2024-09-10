package lab.exercise7;

public class Egg {
	int egg;
	boolean valueSet = false;
	public synchronized void put(int egg) {
		while(valueSet) {
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Hen Laid the Egg - "+ egg);
		this.egg = egg;
		valueSet = true;
		notify();
	} 
	public synchronized void get() {
		while(!valueSet)
		{
			try {wait();} catch(Exception e) {}
		}
		System.out.println("Owner gained Rs "+ egg*2);
		valueSet = false;
		notify();
	}
}
