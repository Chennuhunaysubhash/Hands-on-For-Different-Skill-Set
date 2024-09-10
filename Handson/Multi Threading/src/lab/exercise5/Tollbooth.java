package lab.exercise5;



public class Tollbooth extends Thread{
	
	int i;
	public Tollbooth(int i) {
		this.i = i;
	}
	@Override
	public synchronized void run() {
			System.out.println(" vehicle cross  booth "+ i);
			try {Thread.sleep(1000);} catch(Exception e) {}
		    notify();
	}
}
