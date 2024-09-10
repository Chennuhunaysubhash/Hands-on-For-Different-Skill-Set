package lab.exercise3;

import java.util.*;
import java.util.stream.Collectors;
public class TransformedList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apply","Cherry","dates","Manago","Oranges","Papaya");
		
		System.out.println(words.stream().map(e->e+"!").collect(Collectors.toList()));
        System.out.println(words.stream().map(e->e.replace("i", "eye")).collect(Collectors.toList()));
        System.out.println(words.stream().map(String::toUpperCase).collect(Collectors.toList()));
	}

}
