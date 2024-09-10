package lab.exericse4;

public  class Cude extends Shape implements Spatial  {
	
	Cude(double length,double width,double height){
		super(length,width,height);
	}
	@Override
	public double area() {
		return 2*getLength()*getWidth() + 2*getLength()*getHeight() + 2*getWidth()*getWidth();
	}

	
	public  double  volume() {
		return getLength()*getWidth()*getHeight();
	}
	
	

}
