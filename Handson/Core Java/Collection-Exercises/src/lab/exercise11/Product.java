package lab.exercise11;

public class Product {
String productName;
String productUnit;
int productPrice;
 public Product(String pName, int pPrice, String pUnit) {
	 this.productName = pName;
	 this.productPrice = pPrice;
	 this.productUnit = pUnit;
 }
 public String getProductName() {
	 return productName;
 }
 public int getPrice() {
	 return productPrice;
 }
 public String getUnit() {
	 return productUnit;
 }
}
