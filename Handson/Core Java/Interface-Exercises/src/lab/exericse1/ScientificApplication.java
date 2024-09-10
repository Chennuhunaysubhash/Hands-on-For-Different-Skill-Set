package lab.exericse1;

public class ScientificApplication implements PhysicalConstants{
	public void e(float m) {
		double result;
		
		result = m*(Math.pow(C, 2));
		System.out.println("E= "+result+" m/s");
	}
	public void f(float m1,float m2, double r) {
		double result;
		double r1;
		r1 = Math.pow(r, 2);
		result = G*(m1*m2)/r1;
		System.out.println("F= "+result+" ");
	}
	public void d(float t) {
		double result;
		result = 0.5*g*t;
		System.out.println("d= "+result);
	}
	public static void main(String[] args) {
		ScientificApplication sa = new ScientificApplication();
		sa.e(19);
		sa.f(5, 6, 2);
		sa.d(5);
	}

}
