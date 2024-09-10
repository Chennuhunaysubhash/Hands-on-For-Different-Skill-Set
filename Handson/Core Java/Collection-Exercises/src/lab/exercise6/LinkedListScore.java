package lab.exercise6;

import java.util.Collections;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListScore {
public static void main(String[] args) {
	LinkedList<Score> li = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	String name;
	int score;
	System.out.println("You want to enter the details(T/F).");
	char op = sc.next().charAt(0);
	while(op == 'T' || op == 't') {
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the score");
		score = sc.nextInt();
		li.add(new Score(name,score));
		System.out.println("You want to enter the details(T/F).");
		op = sc.next().charAt(0);
	}
	
	
	Collections.sort(li, Collections.reverseOrder());
	int j =1;
	System.out.println("Ranks    Name      Score");
	for (Score i: li) {
		
		System.out.println(j+"   "+i.getName() + "     " +i.getScore());
		 j=j+1;
	}
	sc.close();
}
}
