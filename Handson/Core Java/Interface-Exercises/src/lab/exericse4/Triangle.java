package lab.exericse4;

public class Triangle extends Shape {
  
  Triangle(float base,double height){
	  super(base,height);
  }
 
@Override
public double area() {	
	return getBase()*getHeight();
}

@Override
public double volume() {
	return -1;
}

}
