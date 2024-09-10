package lab.exercise5;



public class Bridge extends Thread {
	
	int i;
	public Bridge(int i) {
		
		this.i = i;
	}
	@Override
	public void run() {
			System.out.println(" vehicle cross  brige "+ i);
			try {Thread.sleep(1000);} catch(Exception e) {}
	
		
	}
}
