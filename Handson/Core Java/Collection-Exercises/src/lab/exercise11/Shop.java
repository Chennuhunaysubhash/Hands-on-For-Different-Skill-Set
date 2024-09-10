package lab.exercise11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		 HashMap<String, Product> hash = new HashMap<>();
		 ArrayList<Order> order = new ArrayList<>();
		 ArrayList<String> code = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 Product p1 = new Product("Banana",10,"Dz");
		 Product p2 = new Product("Sugar ",20,"Kg");
		 Product p3 = new Product("Apply ",15,"Dz");
		 Product p4 = new Product("Rice  ",30,"Kg");
		 Product p5 = new Product("Tomato",25,"Kg");
		 hash.put("pro_1", p1);
		 hash.put("pro_2", p2);
		 hash.put("pro_3", p3);
		 hash.put("pro_4", p4);
		 hash.put("pro_5", p5);
		 code.add("pro_1");
		 code.add("pro_2");
		 code.add("pro_3");
		 code.add("pro_4");
		 code.add("pro_5");
		 System.out.println("Product Code      Product Name");
		 System.out.println("pro_1             Banana");
		 System.out.println("pro_2             Sugar");
		 System.out.println("pro_3             Apply");
		 System.out.println("pro_4             Rice");
		 System.out.println("pro_5             Tomato");
		 System.out.println("you want add product(T/F)");
		 char op = sc.next().charAt(0);
		 String pCode;
		 int q;
		 int toQ;
		 int totalSum = 0;
		 while(op == 't'||op =='T') {
			 System.out.println("Enter the Product code: ");
			 pCode = sc.next();
			 if(code.contains(pCode)) {
			 Product p = (Product)hash.get(pCode);
			 System.out.println("Enter the quantity: ");
			 q = sc.nextInt();
			 toQ = q*p.getPrice();
			 totalSum = totalSum + toQ;
			 order.add(new Order(p.getProductName(),p.getPrice(),p.getUnit(),q,toQ,pCode));
			 }
			 else {
				 System.out.println("Product code is not present and please enter correct one.");
			 }
			 System.out.println("you want add product(T/F)");
			 op = sc.next().charAt(0);
		 }
		 System.out.println("---------------------------------SHOPING BILL--------------------------------");
		 System.out.println("Product code      Produt Name      Price      Unit      Quantity       Amount");
		 for(Order i: order) {
		 System.out.println(i.getCode()+"              "+i.getProductName()+"            "+i.getPrice()+"        "+i.getUnit()+"          "+i.getQuantity()+"             "+i.getToprice());
			 
		 }
		 System.out.println("-----------------------------------------------------------------------------");
		 System.out.println("                                                          Total Amount: "+totalSum);
		 System.out.println("-----------------------------------------------------------------------------");
		 sc.close();
	}
}
