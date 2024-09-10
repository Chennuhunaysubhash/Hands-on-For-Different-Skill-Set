package lab.exercise2;

//Base Class Vehicle
class Vehicle {

String color; 
int noWheels;      
String model;   

public Vehicle(String color, int noWheels, String model) {
 
 this.color = color;
 this.noWheels = noWheels;  
 this.model = model; 
}

 public void printDetails() {

 System.out.println("Color: " + color);
 System.out.println("no wheels: " + noWheels);
 System.out.println("Model: " + model);
}

}

class Car extends Vehicle {

	String bodyStyle;
public Car(String color, int noWheels, String model, String bodyStyle) {
 super(color, noWheels, model);  
 this.bodyStyle = bodyStyle;       
}

public void carDetails() {  
 printDetails();         
 System.out.println("Body Style: " + bodyStyle);
}

}
class Truck extends Vehicle {

	String bodyStyle;
public Truck(String color, int noWheels, String model, String bodyStyle) {
 super(color, noWheels, model);  
 this.bodyStyle = bodyStyle;       
}

public void truckDetails() {  
 printDetails();         
 System.out.println("Body Style: " + bodyStyle);
}

}
class Bus extends Vehicle {

	int capacity;
public Bus(String color, int noWheels, String model, int capacity) {
 super(color, noWheels, model);  
 this.capacity = capacity;       
}

public void busDetails() {  
 printDetails();         
 System.out.println("Capacity : " + capacity);
}

}
public class Road{

public static void main(String[] args) {
 Vehicle v = new Vehicle("Black",4,"Super_x");
 Car c = new Car("Red", 4, "Elantra", "Sedan"); 
 System.out.println();
 c.carDetails();
 System.out.println();
 v.printDetails();
 Truck t = new Truck("Blue", 4, "Elantra", "Sedan"); 
 System.out.println();
 t.truckDetails();
 System.out.println();
 Bus b = new Bus("yellow", 4, "Elantra", 100); 
 b.busDetails(); 
}

}