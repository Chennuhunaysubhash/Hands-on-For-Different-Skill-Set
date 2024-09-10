package lab.exercise11;


public class AppUser{
String user;
String password;
String database;
String profile;
{
database = "https://www.javatpoint.com/java-constructor";
profile = "main_file.doc";
}
 public AppUser(String u,String p){
 user = u;
 password = p;
}
public void display(){
System.out.println("Database url : " + database);
System.out.println("Property file name  : " + profile);
System.out.println("user : "+user);
System.out.println("Password: " +password);

}
 public static void main(String[] args){
 
 AppUser i = new AppUser("scott", "scott@123");
 
 AppUser j = new AppUser("smith", "smith@234");
 i.display();

 j.display();
}
}