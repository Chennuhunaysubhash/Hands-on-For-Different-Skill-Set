package material;



import stock.Inventory;
public class Accessories extends Inventory {
	String accId;
    Accessories(int q,String id){
    	super(q);
    	lowOrderLevelQuantity = 5;
    	accId = id;
    	}
    public void conformOrder() {
   	 if(quantity<lowOrderLevelQuantity) {
   		 System.out.println("Request for Material");
   		 System.out.println("the following id "+accId+" Order is not conform.");
   	 } 
   	 else {
   		 System.out.println("Order is conform");
   		 System.out.println("Order id: "+accId);
   		 System.out.println("Order Quantity: "+quantity);
   	 }}
     
}
