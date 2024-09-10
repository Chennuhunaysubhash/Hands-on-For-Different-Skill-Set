package lab.exercise5;



class Userdetails{
	
	String name;
	String homeCity;
	public Userdetails(String name, String homeCity) {
		this.name = name;
		this.homeCity = homeCity;
	} 
	public void printDetail() {
		System.out.println("User Name: "+ name);
		System.out.println("Home city: "+ homeCity);
	}
}
public class Reset {
	
	public Userdetails garbageSet(Userdetails c){
		c = null;
     	return c;	
	}
	
	public static void main(String[] args) {
		Userdetails u1 = new Userdetails("hunay","Bhimavaram");
		
		u1.printDetail();
		
		try {
			Reset r = new Reset();
			u1 = r.garbageSet(u1);
		}
		catch(Exception e) {
			System.out.println("ObjectNotFoundException is occured.");
		}
		finally
        {
            if (u1 != null) {
                System.out.println("object is active");
                
            } else {
                System.out.println("object is inactive");
            }
           
        }
	}
}
