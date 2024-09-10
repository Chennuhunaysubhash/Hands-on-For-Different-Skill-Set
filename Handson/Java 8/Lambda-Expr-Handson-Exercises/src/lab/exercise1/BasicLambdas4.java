package lab.exercise1;

import java.util.ArrayList;
import java.util.List;  
public class BasicLambdas4{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<>();  
        list.add("eager");  
        list.add("eagle");  
        list.add("hunay");  
        list.add("ball");  
        list.add("apply");  
        list.add("bat");  
          
        list.forEach(  
            (n)->{
            	char c=n.charAt(0);
            	if(c == 'e') {
            		
            		System.out.println(n);
            	}
            
            	}
        );  
    }  
}

