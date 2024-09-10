package lab.exercise4m;

public class SalaryWorker extends Worker{
	
	public SalaryWorker(String name, String type, int sal) {
		super(name, type, sal);
	}
    public SalaryWorker(int r, int h) {
    	super(r,h);
    }
    public int pay()
    {
    	int weeks=hour/(24*7);
        return rate*weeks;
    }
    
}