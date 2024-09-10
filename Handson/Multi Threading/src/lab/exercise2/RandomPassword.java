package lab.exercise2;
import java.util.Scanner;
import java.util.Random;
class PasswordMain extends Thread {
	Random random;
	String str;
	 public PasswordMain(String str) {
	    this.random = new Random();   
		this.str = str;
	}
	@Override
	public void run() {

		
		int x = random.nextInt(9999); 
		String passCode = str +String.valueOf(x);
		try { 
			System.out.println("password :"+passCode);
			Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		
	}

}
public class RandomPassword {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Waiting for user input: ");
                String str = scanner.nextLine();
                Thread s = new PasswordMain(str);
                s.start();
                try{Thread.sleep(1000);
			    }catch(Exception e) {}
                
            }
        } catch(Exception e) {
            // System.in has been closed
            System.out.println("System.in was closed; exiting");
        }
        
    }
}
