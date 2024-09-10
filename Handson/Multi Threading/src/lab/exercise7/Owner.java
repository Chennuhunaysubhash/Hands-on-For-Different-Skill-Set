package lab.exercise7;

public class Owner implements Runnable {
	Egg e;
	public Owner(Egg e) {
		this.e = e;
		Thread t = new Thread(this,"Owner");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
		e.get();
		try { Thread.sleep(1000);}catch(Exception e) {}
		}
	}

}
