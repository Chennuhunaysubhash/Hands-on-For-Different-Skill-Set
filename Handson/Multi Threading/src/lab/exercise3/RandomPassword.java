package lab.exercise3;
import java.util.Scanner;
import java.util.Random;
class PasswordMain1 implements Runnable {
	Random random;
	String str;
	Thread p;
	 public PasswordMain1(String str) {
	    this.random = new Random();   
		this.str = str;
		p = new Thread(this);
		p.start();
	}
	@Override
	public void run() {

		
		int x = random.nextInt(9999); 
		String passCode = str +String.valueOf(x);
		try { 
			System.out.println("Password :"+passCode);
			Thread.sleep(1000);
			}catch(Exception e) {}
		
	}}

public class RandomPassword {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            while (true) {
	                System.out.println("Waiting for user input: ");
	                String str = scanner.nextLine();
	                Runnable s = new PasswordMain1(str);
	                try{Thread.sleep(500);
				    }catch(Exception e) {}
	                
	            }
	        } catch(Exception e) {
	            // System.in has been closed
	            System.out.println("System.in was closed; exiting");
	        }
	    }
}
