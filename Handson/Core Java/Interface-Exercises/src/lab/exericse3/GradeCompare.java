package lab.exericse3;



import java.util.Comparator;

class GradeCompare implements Comparator<Coaching>
{
	public int compare(Coaching m1, Coaching m2)
	{
		return m1.getGande().compareTo(m2.getGande());
	}
}
