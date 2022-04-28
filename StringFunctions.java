package Week2.day1;

public class StringFunctions {
public static void main(String[] args) {
	
	//string comparison
	String text0 = "Testleaf 1234";
	String text1 = " Always Ahead";
	boolean equals = text0.equals(text1);
	System.out.println(equals);
	
	//IgnoreCase
	boolean equalsIgnoreCase=text0.equalsIgnoreCase(text1);
	System.out.println(equalsIgnoreCase);
	
	//Contains - Common part of both string
	boolean contains=text0.contains(text1);
	System.out.println(contains);
	
	//Startwith
	//boolean startWith=text0.startWith("test");
	//System.out.println(startWith);//
	
	//Concat
    String concat = text0.concat(text1);
    System.out.println(concat);
    
    //charAt - prints the character for that index number
    char charAt=text0.charAt(2);
    System.out.println(charAt);
    
    //legnth
    //int length=(text1.length);
    //System.out.println(length);
    
    //toCharArray
    char[] charArray= text1.toCharArray();
    System.out.println(charArray);
    
    //split
    //String []split = text1.split(" ");
    //for (int i; i<split.length; i++)
    //{
    	//System.out.println(split[,]);
    //}
    
    //Substring
    String subString=text1.substring(4);
    System.out.println(subString);
    
    //replace
    String replace=text1.replace("A", " ");
    System.out.println(replace);
    
    //replaceAll
    //String replaceAll=text0.replaceAll("//d", " ");
    //System.out.println(repalceAll);
    
    //
    
    
    	
    
    
    
    
    
	
}
}
