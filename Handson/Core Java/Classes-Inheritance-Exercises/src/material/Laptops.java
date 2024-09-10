package material;


import stock.Inventory;
public class Laptops extends Inventory{
	String lpId;
	Laptops(int q,String id){
		super(q);
		lowOrderLevelQuantity = 3;
		lpId = id;
	}
     public void conformOrder() {
	 if(quantity<lowOrderLevelQuantity) {
		 System.out.println("Request for Material.");
		 System.out.println("the following id "+lpId+" Order is not conform.");
	 } 
	 else {
		 System.out.println("Order is conform.");
		 System.out.println("Order id: "+lpId);
   		 System.out.println("Order Quantity: "+quantity);
	 }
 }
}
