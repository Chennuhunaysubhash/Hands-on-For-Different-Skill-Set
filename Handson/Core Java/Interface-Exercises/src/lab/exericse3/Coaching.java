package lab.exericse3;



class Coaching implements Comparable<Coaching>
{
	private int id;
	private String name;
	private String grade;

	public int compareTo(Coaching m)
	{
		return this.id - m.id;
	}

	public Coaching(String nm, String yr)
	{
		
		this.name = nm;
		this.grade = yr;
		this.id = name.codePointAt(0);
	}
    public int getId() {return id;} 
	public String getName() { return name; }
	public String getGande()	 { return grade; }
}

