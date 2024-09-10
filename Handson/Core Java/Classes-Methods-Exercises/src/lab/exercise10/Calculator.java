package lab.exercise10;

public class Calculator
{
	
public int add(int a, int b){
	return a+b;
}
public double add(double a, double b){
	return a+b;

}
public double add(int a, double b){
	return a+b;
}
public double add(double a, int b){
	return a+b;
}

public int sub(int a, int b){
	return a-b;
}
public double sub(double a, double b){
	return a-b;

}
public double sub(int a, double b){
	return a-b;
}
public double sub(double a, int b){
	return a-b;
}


public int mul(int a, int b){
	return a*b;
}
public double mul(double a, double b){
	return a*b;

}
public double mul(int a, double b){
	return a*b;
}
public double mul(double a, int b){
	return a*b;
}



public int div(int a, int b){
	return a/b;
}
public double div(double a, double b){
	return a/b;

}
public double div(int a, double b){
	return a/b;
}
public double div(double a, int b){
	return a/b;
}

public static void main(String[] args){
      Calculator ov = new Calculator();
	System.out.println("ADD");
	System.out.println(ov.add(1,2));
	System.out.println(ov.add(12.2,22.2));
	System.out.println(ov.add(1,22.3));
	System.out.println(ov.add(12.5,2));
	System.out.println("SUB");
	System.out.println(ov.sub(1,2));
	System.out.println(ov.sub(12.2,22.2));
	System.out.println(ov.sub(1,22.3));
	System.out.println(ov.sub(12.5,2));
	System.out.println("MUL");
	System.out.println(ov.mul(1,2));
	System.out.println(ov.mul(12.2,22.2));
	System.out.println(ov.mul(1,22.3));
	System.out.println(ov.mul(12.5,2));
	System.out.println("DIV");
	System.out.println(ov.div(1,2));
	System.out.println(ov.div(12.2,22.2));
	System.out.println(ov.div(1,22.3));
	System.out.println(ov.div(12.5,2));
}
}
