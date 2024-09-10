package lab.exericse2;

import java.util.Comparator;



class NameCompare implements Comparator<Coaching>
{
	public int compare(Coaching m1, Coaching m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}
