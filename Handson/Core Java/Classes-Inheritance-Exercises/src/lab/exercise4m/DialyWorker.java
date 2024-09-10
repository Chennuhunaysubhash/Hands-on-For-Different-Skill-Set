package lab.exercise4m;

public class DialyWorker extends Worker{
	
	public DialyWorker(String name, String type, int sal) {
		super(name, type, sal);
		
	}
    public DialyWorker(int r, int h) {
    	super(r,h);
    }
    public int pay()
    {
        int days=hour/24;
        return rate*days;
    }
    
}
