package lab.exercise9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Thesaurus {
	public static void main(String[] args) {
		HashMap<String, List<String>> thesaurus = new HashMap<>();
		thesaurus.put("happy", Arrays.asList("cheerful","merry","gay","jolly","pleased"));
		thesaurus.put("good", Arrays.asList("acceptable","wonderful","super","great"));
		thesaurus.put("design", Arrays.asList("layout","map","model","construction","pattern"));
		thesaurus.put("process", Arrays.asList("action","movement","system","way","case"));
		thesaurus.put("idea", Arrays.asList("plan", "aim", "clue","hint","sense"));
		Scanner sc = new Scanner(System.in); 
		List<String>  l = new ArrayList<>();
		l.add("happy");l.add("good");l.add("design");l.add("process");l.add("idea");
		System.out.println("list of wors: "+ l);
		System.out.println("you want to enter the word for searching(T/F): ");
		char op = sc.next().charAt(0);
		
		while( op == 'T'||op =='t') {
			System.out.println("Enter the word for Thesaurus searching: ");
			String word = sc.next();
			if(l.contains(word)) {
				List<String> l1 = thesaurus.get(word);
				System.out.println("The Word is: "+word);
				System.out.println("similar meaning word: ");
				for(String i:l1) {
					System.out.println("  "+i);
				}
			}
			else {
				System.out.println("word not present in the thesaurus.");
			}
			System.out.println("you want to enter the word for searching(T/F): ");
			op = sc.next().charAt(0);
		
		}
		sc.close();
	}
}
