package lab.exercise6;

import java.util.*;
public class Lazy2
{
	public static void main(String[] args) {
		List<String> words=Arrays.asList("egg","hello","quinoa","manideep","suresh");

		words.stream().map(String::toUpperCase).forEach(System.out::println);

		
	}

}
