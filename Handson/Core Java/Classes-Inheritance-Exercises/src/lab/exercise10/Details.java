package lab.exercise10;

import java.util.*;

class Connection{

String username;
String password;
String url;
static int count =  0;	
	public Connection(String username, String password, String url)
	   {
			this.username = username;
			this.password = password;
			this.url = url;  
			count++;
			System.out.println(count); 
			
	   }

public void garbageSet(Connection c){
     	c=null;
        count--;
        System.out.println(count);
        System.gc();
}

}

public class Details{
public static void main(String[] args){
    ArrayList<Connection> c = new ArrayList<>(10); 	
    Connection a = new Connection("hunay","12345","https//welcome.com");
    c.add(a);
    Connection a1 = new Connection("hunay","12345","https//welcome.com");
    c.add(a1);
    Connection a2 = new Connection("hunay","12345","https//welcome.com");
    c.add(a2);
   Connection a3 = new Connection("hunay","12345","https//welcome.com");
   c.add(a3);
    a.garbageSet(a1);	 
    a.garbageSet(a2);
}
}