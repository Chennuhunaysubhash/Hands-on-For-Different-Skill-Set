package lab.exercise3;


interface TwoElementPredicate<T>{
	boolean betterTest(T s1, T s2);
	
}

public class BetterProcess {
	static <T>  void betterElement(T s1, T s2, TwoElementPredicate<T> t) {
		if(t.betterTest(s1, s2)) {
		System.out.println(s1);}
		else {
			System.out.println(s2);
		}
		
	}
public static void main(String[] args) {
	
	TwoElementPredicate<String> better = (s1,s2) -> {
	
	if(s1.length()>s2.length()) {
		return true;
	}
	else {
		return false;
	}
	};
	TwoElementPredicate<Integer> better1 = (s1,s2) -> {
		
		if(s1>s2){
			return true;
		}
		else {
			return false;
		}
		};
     betterElement("chennu","hunay",better);
     betterElement(11,7,better1);
}
}
