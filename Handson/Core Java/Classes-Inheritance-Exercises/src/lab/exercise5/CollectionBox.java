package lab.exercise5;

import java.util.*;
class Currency
{
    int note;
    int value; 	
    int coin;
    int value1;	
	Currency(){}
    Currency(int n,int v,int c,int v1)
    {
        this.note = n;
	    this.value = v;
        this.coin = c;
 	    this.value1 = v1;
    }
    

}

class Dollar extends Currency
{       int tolDo;
		int tolCoin;
	    float tolRe;
        Dollar(int n,int v,int c,int v1){
	    super(n,v,c,v1);	
     	}
	public void compute(){
		tolDo = note*value;
		tolCoin = coin*value1;
		tolRe = (note*value*50) + (coin*value1);
        
	}
	public void print(){
	System.out.println("Dollar: "+tolDo+" cents: "+tolCoin);
	System.out.println("Amount in Rupees: "+tolRe); 
	} 
}

class Pound extends Currency
{
	int tolDo;
	int tolCoin;
	float tolRe;
        Pound(int n,int v,int c,int v1){
	    super(n,v,c,v1);	
    	}
	public void compute(){
		tolDo = note*value;
		tolCoin = coin*value1;
		tolRe = note*value*81 + coin*value1*81;
        
	}
	public void print(){
	System.out.println("Pound: "+tolDo+" pence: "+tolCoin);
	System.out.println("Amount in Rupees: "+tolRe);
	} 
}
 
class Rupee extends Currency
{       
	int ruppe;
	int paise;
	float tolRe;
	Rupee(int n,int v,int c,int v1){
	  super(n,v,c,v1);
	} 
	public void compute(){
	 ruppe = note*value;
	 paise = coin*value1;
	 tolRe = ruppe+paise;
     System.out.println(" already in rupees"); 
	}
	public void print(){
	 System.out.println("Amount in Rupees: "+tolRe);
	}      
} 

public class CollectionBox{

	public static void main(String[] args){
	int note;
	int coin;
	int value;
	int value1;
	Scanner sc = new Scanner(System.in);
	//CollectionBox cb = new CollectionBox();
        System.out.println("Enter the currency type(D/P/R): ");
        char op = sc.next().charAt(0);
        if(op == 'D' || op == 'd'){
	          System.out.println("Enter the No of Notes: ");
	          note = sc.nextInt();
	          System.out.println("Enter the Notes Value ");
	          value = sc.nextInt();
	          System.out.println("Enter the No of coins: ");  
	          coin = sc.nextInt(); 
	          System.out.println("Enter the coins Value ");
	          value1 = sc.nextInt();
	          Dollar d = new Dollar(note,value,coin,value1);
	          d.compute(); 
	          d.print();       
        }
	else if(op == 'P' || op == 'p'){
	System.out.println("Enter the No of Notes: ");
	note = sc.nextInt();
	System.out.println("Enter the Notes Value ");
	value = sc.nextInt();
	System.out.println("Enter the No of coins: ");  
	coin = sc.nextInt(); 
	System.out.println("Enter the coins Value ");
	value1 = sc.nextInt();
	Pound p = new Pound(note,value,coin,value1);
	p.compute(); 
	p.print();
	}
	else if(op == 'R' || op == 'r'){
	System.out.println("Enter the No of Notes: ");
	note = sc.nextInt();
	System.out.println("Enter the Notes Value ");
	value = sc.nextInt();
	System.out.println("Enter the No of coins: ");  
	coin = sc.nextInt(); 
	System.out.println("Enter the coins Value ");
	value1 = sc.nextInt();
	Rupee r = new Rupee(note,value,coin,value1);
	r.compute(); 
	r.print();
	}
	else{System.out.println("invalid currencise");}
        sc.close();
	}    
}