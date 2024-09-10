package lab.exercise7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Outstanding {
	public static void main(String[] args) {
		int[] list = {1,2,6,3,4,5,6,7,9,4};
		ArrayList<Integer> list1 = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i : list) {
		     if (!set.add(i)) {
		        // your duplicate element
		    	 list1.add(i);
		     }
		}
		System.out.println("following are employee ids:");
		for(int j: set) {
			System.out.println(j);
		}
		System.out.println("following are Outstanding Employee ids:");
		for(int i:list1) {
			System.out.println(i);
		}
	}
}
