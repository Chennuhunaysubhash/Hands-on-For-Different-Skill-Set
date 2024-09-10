package lab.exercise4;

import java.util.*;
import java.util.stream.Collectors;
public class FilteredList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apply","Cherry","dates","Manago","Oranges","Papaya");
		
		System.out.println(words.stream().filter(e -> e.length()<4).collect(Collectors.toList()));
        System.out.println(words.stream().filter(e -> e.contains("b")).collect(Collectors.toList()));
        System.out.println(words.stream().filter(s -> (s.length() % 2) == 0).collect(Collectors.toList()));
	}

}
