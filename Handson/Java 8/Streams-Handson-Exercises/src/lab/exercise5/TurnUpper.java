package lab.exercise5;

import java.util.*;
public class TurnUpper {
public static void main(String[] args){
		
		List<String> words=Arrays.asList("egg","hello","quinoa","manideep","suresh");
		
		 words.stream().map(String::toUpperCase).filter(String->String.length()<4 && String.contains("E")).forEach(System.out::println);  
		 
		 words.stream().map(String::toUpperCase).filter(String->String.length()>4 && String.contains("Q")).forEach(System.out::println); 
	}

}