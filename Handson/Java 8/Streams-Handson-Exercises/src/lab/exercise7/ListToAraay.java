package lab.exercise7;



import java.util.*;
public class ListToAraay {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apply","Cherry","dates","Manago","Oranges","Papaya");
		System.out.println(" ");
        
		String[] res = words.stream().filter(e -> e.contains("a")).toArray(String[]::new);
        System.out.println(Arrays.asList(res));
	
	}

}
