package lab.exercise7;

public class Hen implements Runnable {
	Egg e;
	public Hen(Egg e) {
		this.e = e;
		Thread t = new Thread(this,"Hen");
		t.start();
	}
	@Override
	public void run() {
		int i = 1;
		while(i<=50) {
			e.put(i);
			i++;
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
	

}
