package lab.exericse4;

public abstract class Shape {
	private double length;
	private double width;
	private double height;
	private double radius;
	private float base;
	Shape(double radius){
		this.radius = radius;
	}
	Shape(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	Shape(float base,double height)
	{
		this.base=base;
		this.height=height;
	}
	Shape(double length,double width,double height)
	{
		this.length=length;
		this.width=width;
		this.height = height;
	}
	
	
    public double getLength() {
		return length;
    	
    }
    public double getWidth() {
		return width;
    	
    }
    public double getBase() {
    	return base;
    }
    public double getHeight() {
    	return height;
    }
    public double getRadius() {
		return radius;
    	
    }
    abstract double area();
    abstract double volume(); 
	
}