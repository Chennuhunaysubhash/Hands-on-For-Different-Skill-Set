package lab.exercise7;

import java.util.*;

abstract class DataBase{

String username;
String password;
String url;

	protected DataBase(String username, String password, String url)
	   {
			this.username = username;
			this.password = password;
			this.url = url;
	   }




}
class SqlServer extends DataBase{
	
	public SqlServer(String username, String password, String url)
	   {
			super(username, password, url);
	   }

}



class Oracle  extends DataBase
{
	 public Oracle(String username, String password, String url)
		{
			super(username, password, url);
		}


}



class MySql extends DataBase
{
	public  MySql(String username, String password, String url) 
	{
		super(username, password, url);
	}
 

}


public class Program6 {
ArrayList<Oracle> c = new ArrayList<>(10);
ArrayList<SqlServer> c1 = new ArrayList<>(10);
ArrayList<MySql> c2 = new ArrayList<>(10);
public void addinfo(int op,String username, String password, String url){

if(op == 1){
c.add(new Oracle(username, password, url));
}
else if(op == 2){
c1.add(new SqlServer(username, password, url));
}
else{
c2.add(new MySql(username, password, url));
}
}

public void displaydetails(){
System.out.println("Oracle users:");
for(Oracle i : c){
System.out.println(i.username + " " + i.password + " " + i.url);
}
System.out.println("SqlServer users:");
for(SqlServer i : c1){
System.out.println(i.username + " " + i.password + " " + i.url);
}
System.out.println("SqlServer users:");
for(MySql i : c2){
System.out.println(i.username + " " + i.password + " " + i.url);
}
}

	public static void main(String[] args) 
	{ 
		String username;
		String password;
		String url;
		int count1=0;
		int count2=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		Program6 m = new Program6();  
		System.out.println("Enter the Databse Option (oracle O),(sqlserver S),(Mysql M) and Exit E");
                char op = sc.next().charAt(0);
		while(op == 'O' || op == 'S' || op == 'M'){
		System.out.println("Enter the username: ");
		username = sc.next();
                System.out.println("password: ");
		password = sc.next();
                System.out.println("url: ");
		url = sc.next();
  		if(op == 'O' && count1<10){
		m.addinfo(1,username,password,url);
		count1 = count1+1;
		}
		else if(op == 'S' && count2<10){
		m.addinfo(2,username,password,url);
		count2 = count2+1;		
		}
		else if(op == 'M' && count<10){
		m.addinfo(3,username,password,url);
		count = count+1;
		}
		else{
		System.out.println("incorrect data option or limit over..");
		}
		System.out.println("Enter the Databse Option (oracle O),(sqlserver S),(Mysql M) and Exit E");
		op = sc.next().charAt(0);
		}
		m.displaydetails();
		sc.close();
	}

}