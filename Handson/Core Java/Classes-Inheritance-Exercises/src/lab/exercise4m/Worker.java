package lab.exercise4m;


public class Worker implements Comparable<Worker>{
	 private String name;
	 private String type;
	 private int sal;
	 int rate,hour;
	 
	@Override
	public int compareTo(Worker o) {

		return this.sal-o.sal;
	}
	public Worker() {}
	public Worker(String name,String type, int sal) {
		 this.name = name;
		 this.type = type;
		 this.sal = sal;
	 }
	public Worker(int r, int h) {
		this.rate = r;
		this.hour= h;
	}
	public String getName() {return name;}
	public String getType() {return type;}
	public int getSal() {return sal;}
}
