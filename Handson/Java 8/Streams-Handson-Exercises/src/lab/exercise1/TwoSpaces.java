package lab.exercise1;

import java.util.*;
public class TwoSpaces {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apply","Cherry","dates","Manago","Oranges","Papaya");
		System.out.println(" ");
                System.out.println("without two spaces in front of each word:");
		for(String r:words)
			System.out.println(r);
		System.out.println(" ");
		System.out.println("with two spaces in front of each word:");
                words.stream().forEach(s->System.out.println("  "+s+"  "));
	}

}