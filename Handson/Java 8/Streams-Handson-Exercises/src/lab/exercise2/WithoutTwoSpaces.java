package lab.exercise2;

import java.util.*;
public class WithoutTwoSpaces {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apply","Cherry","dates","Manago","Oranges","Papaya");
		System.out.println(" ");
		words.stream().forEach(System.out::println);
	}

}
