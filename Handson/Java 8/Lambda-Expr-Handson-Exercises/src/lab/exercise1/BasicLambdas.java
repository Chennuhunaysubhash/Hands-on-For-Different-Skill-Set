package lab.exercise1;

import java.util.Arrays;


public class BasicLambdas {
	public static void main(String[] args) {
		String[] s= {"virtusa","company","salary","rules","dreams"};
		
		System.out.println("Sorting according to their length");
		Arrays.sort(s, (a, b)->Integer.compare(a.length(), b.length()));
		System.out.println(Arrays.toString(s));
		System.out.println();
		
		System.out.println("Sorting according to their reverse length");
		Arrays.sort(s, (a, b)->Integer.compare(b.length(), a.length()));
		System.out.println(Arrays.toString(s));
		System.out.println();
		
		System.out.println("sorting according to their alphabetical order");
		Arrays.sort(s,(p1, p2) -> p1.compareTo(p2));
		System.out.println(Arrays.toString(s));
		System.out.println();
		
	}

}