package lab.exercise4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prompt {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();   
	        String[] questions={"What is your name:","Q2","Q3","Q4","Q5","Q6"};
	        String[] answers={"hunay","Q2","Q3","Q4","Q5","Q6"};
	        boolean flag = false;
	        try {
	            while (true) {
	            	int r = random.nextInt(questions.length);
	                System.out.println("Question :" +questions[r]);
	                long then = System.currentTimeMillis();
	                String line = scanner.nextLine();
	                if(Arrays.asList(answers).indexOf(line) == r) {
	                	 flag = true;
	                }
	                else {
	                	flag = false;
	                }
	                long now = System.currentTimeMillis();
	                double wait = (now - then) / 1000d;
	               
	                Thread s = new TimerClass(wait,flag);
	                
	                s.start();
	                s.sleep(1000);
	                
	            }
	        } catch(Exception e) {
	          
	            System.out.println("System.in was closed; exiting");
	        }
	    }
}
