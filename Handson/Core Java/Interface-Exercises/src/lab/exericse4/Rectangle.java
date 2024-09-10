package lab.exericse4;

public class Rectangle extends Shape{
	
	Rectangle(double length,double width)
	{
		super(length,width);
	}

	@Override
	double area() {

		return getLength()*getWidth();
	}

	@Override
	double volume() {

		return -1;
	}
	
	

	}

