package lab.exercise5;

public class SequentislCar {
	public static void main(String[] args) {
		
		int j = 1;
		while(j<=5) {
			Thread t1 = new Bridge(j);
			t1.start();
			try { Thread.sleep(1000);}catch(Exception ex) {}
			j++;
			
		}
		int i=1;
		while(i<=5) {
		Thread t = new Tollbooth(i);
		t.start();
		try { Thread.sleep(1000);}catch(Exception ex) {}
		i++;
		}
	}
}

