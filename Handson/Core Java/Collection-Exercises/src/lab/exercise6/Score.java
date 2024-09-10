package lab.exercise6;


class Score implements Comparable<Score>
{
	
	private String name;
	private int score;
	
	@Override
	public int compareTo(Score s){
		return this.score - s.score;
		}
	

	public Score(String nm, int yr)
	{
		
		this.name = nm;
		this.score = yr;
		
	}
    public int getScore() {return score;} 
	public String getName() { return name; }
	
}