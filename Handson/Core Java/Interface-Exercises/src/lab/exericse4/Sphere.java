package lab.exericse4;

public class Sphere extends Shape implements Spatial{
    
    double r;
    Sphere(double radius){
    	super(radius);
    }
	@Override
	public double volume(){
		 r = Math.pow(getRadius(), 3);
		return (4*Math.PI*r)/3;
	}


	
	@Override
	public double area(){
		r= Math.pow(getRadius(), 2);
		return 4*(Math.PI*r);
	}

	

}
