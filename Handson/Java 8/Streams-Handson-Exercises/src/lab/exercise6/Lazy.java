package lab.exercise6;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class Lazy {
public static void main(String[] args){
		
		List<String> words=Arrays.asList("egg","hello","quinoa","manideep","suresh");
		
		Function<String, String> toUpper = s -> {
            System.out.println("Upper letters of "+" "+ s +" is "+ s.toUpperCase());
            return s.toUpperCase();
        };
        Predicate<String> lenthCheck = s -> {
            System.out.println("length less than 7 check");
            return s.length()<7;
        };

        Predicate<String> contains_N_Check = s -> {
            System.out.println("contains q check");
            return s.contains("q");
        };
        System.out.println(words.stream()
                .map(toUpper)
                .filter(lenthCheck)
                .filter(contains_N_Check)
                .findFirst()
                .orElse(null));
	}

}