package material;

public class Order {
	public static void main(String[] args) {
		Laptops lp = new Laptops(4,"laptop_id11");
		lp.conformOrder();
		Laptops lp1 = new Laptops(2,"laptop_id12");
		lp1.conformOrder();
		Accessories ac = new Accessories(6,"Accessories_id111");
		ac.conformOrder();
	}

}
