package lab.exercise1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;
public class Coordinator {
	
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("You went to add Participants(T/F): ");
	char op = sc.next().charAt(0);
	while(op=='T' || op=='t') {
		System.out.println("Enter the name of participant: ");
		String name = sc.next();
		list.add(name);
		System.out.println("You went to add Participants(T/F): ");
		op = sc.next().charAt(0);
	}
	System.out.println("If you want delete Participants(T/F) :");
	char op1 = sc.next().charAt(0);
	while(op1=='T' || op1=='t') {
		System.out.println("Enter the name of participant: ");
		String name = sc.next();
		if(list.contains(name)) {
		list.remove(name);
		}
		else {
			System.out.println("Participant is not in list");
		}
		System.out.println("If you want delete Participants(T/F) :");
		 op1 = sc.next().charAt(0);
	}
	Collections.sort(list);
	int groupSize = 5;
    AtomicInteger counter = new AtomicInteger();
    final Collection<List<String>> partitionedList = 
                    list.stream().collect(Collectors.groupingBy(i -> counter.getAndIncrement() / groupSize))
                        .values();
    int j = 1;
    for(List<String> subList : partitionedList) {
    	
    	System.out.println("Group "+j+": seminar room");
    	System.out.println(" ");
    	for(String i : subList) {
    		
    		
    		System.out.println(i);
    		
    	}
       
		j=j+1;
}
    sc.close();
}
}

