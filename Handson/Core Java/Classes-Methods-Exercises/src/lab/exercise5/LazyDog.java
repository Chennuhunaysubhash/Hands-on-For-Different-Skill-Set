package lab.exercise5;

public class LazyDog{
	public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Original string: " + str);
        String str1="and killed it";
        char ch2 = str.charAt(11);
        String str2=str+str1;
        System.out.println("12 th index character=" +ch2);
        System.out.println("String contain 'is': " + str.contains("is")); 
        System.out.println("after adding string 'and killed it': " + str2);
        String str4="The quick broen Fox jumps over the lazy Dog";
        System.out.println("comparing two strings"+  str1.equals(str4));
        String str5="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println("comparing two strings"+  str1.equals(str5));
        String replaceString=str.replaceAll("The","A");
        System.out.println(replaceString);  
        System.out.println("lower case" +str.toLowerCase());
        System.out.println("upper case" +str.toUpperCase());
        System.out.println(str.indexOf("a", 1));
        System.out.println(str.indexOf("e", 5));
        
    }
}