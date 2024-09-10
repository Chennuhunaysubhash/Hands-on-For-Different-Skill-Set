package lab.exercise4;

public class TimerClass extends Thread{
	double wait;
	boolean flag;
	TimerClass(double wait, boolean flag){
		this.wait = wait;
		this.flag = flag;
	}
	public void run() {
		try { 
			if(wait>20) {
				System.out.println("Better Luck Next Time");
			}	
			else if(wait<20 && flag == false) {
				System.out.println("Better Luck Next Time");
			}
			else if(wait<20 && flag == true) {
				System.out.println("Congratulations");

			}
			else {
            }
			Thread.sleep(10);
			}catch(Exception e) {}
	}
}
