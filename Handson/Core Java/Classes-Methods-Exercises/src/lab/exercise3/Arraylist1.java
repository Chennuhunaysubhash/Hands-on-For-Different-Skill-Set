package lab.exercise3;

import java.util.*;

class Arraylist1{
ArrayList<Integer> arrlist=new ArrayList<>();
public void insert(int i){
		arrlist.add(i);
  	}
      public void delete(int j){
		boolean an = arrlist.contains(j);
		if(an){
		int ele = arrlist.indexOf(j);
		arrlist.remove(ele);
		System.out.println(j+" element is removed");	}
		else{
		System.out.println("element does not present in arraylist");
		}
	}	
      public void findEle(int k){
		boolean ans = arrlist.contains(k);
  
        if (ans){
	    int indk = arrlist.indexOf(k);
            System.out.println("The list contains"+k+" in index "+indk);
	}	
        else
            System.out.println("The list does not contains "+k);
	}
	public void display(){
	System.out.println(arrlist);
	}
      
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Arraylist1 ob = new Arraylist1();
      
      System.out.println("1. Insert");
      System.out.println("2. Delete");
      System.out.println("3. Find");
      System.out.println("4. Display");
      System.out.println("5. Exits");
	
System.out.println("Enter the option: ");
       int op = sc.nextInt(); 
while(op<=4){

        
switch(op){
  case 1: 
	System.out.println("Enter the element into Arraylist: ");
	int i = sc.nextInt();
	ob.insert(i);
  break;
  case 2:  
	System.out.println("Remove the element: ");
	int j = sc.nextInt();
	ob.delete(j);
  break;
  case 3:  
	System.out.println("Find the Element: ");
	int k = sc.nextInt();
	ob.findEle(k);
  break;
  case 4: ob.display();
  break;
  
 }
System.out.println("Enter the option: ");
op = sc.nextInt();
}
sc.close();
}
}
