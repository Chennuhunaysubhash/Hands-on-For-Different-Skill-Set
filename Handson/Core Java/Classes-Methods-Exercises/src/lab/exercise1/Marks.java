package lab.exercise1;

public class Marks
{

	private int regNo;
	private String name;
	private int marksInEng;
	private  int marksInMaths;
	private  int marksInScience;
	
	
	
	public Marks() 
		{
			super();
		}
	
	public Marks(int regNo, String name, int marksInEng, int marksInMaths, int marksInScience) 
		{
			super();
			this.regNo = regNo;
			this.name=name;
			this.marksInEng = marksInEng;
			this.marksInMaths = marksInMaths;
			this.marksInScience = marksInScience;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getMarksInEng() {
		return marksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}
	

}
