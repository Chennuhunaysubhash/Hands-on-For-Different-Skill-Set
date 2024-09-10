import java.util.Random;
class  RandomNumber
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		for(int i=1;i<=20;i++){
			int n = rand.nextInt(100);
			if(String.valueOf(n).length()==2)
				System.out.println(n);
		}
	}
}
