package lab.exericse4;



public class MainShape {
	public static void main(String[] args) {
	
		Shape t = new Triangle(11,12);
		Shape r =  new Rectangle(10,23); 
		Shape c = new Cude(10,11,20);
		Shape s = new Sphere(20);
		/*shap.add(t);
		shap.add(r);
		shap.add(c);
		shap.add(s);*/
		Shape[] shape = {t,r,c,s,t};
		for(int i = 0;i<shape.length;i++) {
			if(shape[i].volume() == -1) {
			 System.out.println("Area: "+shape[i].area());
			}
			else {
				System.out.println("Area: "+shape[i].area());
				System.out.println("Volume: "+shape[i].volume());
			}
		}
		}
	} 
	

