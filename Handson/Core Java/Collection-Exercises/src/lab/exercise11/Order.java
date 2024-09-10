package lab.exercise11;

public class Order extends Product {
    int quantity;
    int toPrice; 
    String pCode;
	public Order(String pName, int pPrice, String pUnit,int quantity ,int toPrice,String pCode) {
		
		super(pName, pPrice, pUnit);
		
		this.quantity = quantity;
		this.toPrice = toPrice;
		this.pCode = pCode;
	}
	public int getQuantity() {
		return quantity ;
	} 
	public int getToprice() {
		return toPrice;
	}
	public String getCode() {
		return pCode;
	}
}
