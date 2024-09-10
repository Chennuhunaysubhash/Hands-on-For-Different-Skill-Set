package lab.exercise7;

public class MainThread {
	public static void main(String[] args) {
		Egg e = new Egg();
		new Hen(e);
		new Owner(e);
	}
}
