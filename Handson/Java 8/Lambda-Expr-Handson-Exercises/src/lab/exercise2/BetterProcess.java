package lab.exercise2;


interface TwoStringPredicate{
	boolean betterTest(String s1, String s2);
	
}

public class BetterProcess {
	static String  betterString(String s1, String s2, TwoStringPredicate t) {
		if(t.betterTest(s1, s2)) {
		return s1;}
		else {
			return s2;
		}
		
	}
public static void main(String[] args) {
	
	TwoStringPredicate better = (s1,s2) -> {
	
	if(s1.length()>s2.length()) {
		return true;
	}
	else {
		return false;
	}
	};
	System.out.println(betterString("chennu","hunay",better));
}
}
