package lab.exercise6;

public class StringBuilder {
	public static void main(String[] args) {
	      String[] stringArray = {"Chennu ", " Hunay", " subhash", " scott", " smiths", " scott", " maths"};
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < stringArray.length; i++) {
	         sb.append(stringArray[i]);
	      }
	      String str = sb.toString();
	      System.out.println(str);
	   }

}