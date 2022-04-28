package Week2.day1;

public class StringSimpleProgram {
public static void main(String[] args) {
	String text1 = "testleaf";
	String text2 = "Testleaf is situated in twin towers teynampet";
	
	//String - "test leaf" - Print the number of e in the string e=2
	char CharAt=text1.charAt(1);
	System.out.println(CharAt);
	
	//print the words that starts 't' or 'T'
	String [] split =text2.split(" ");
	for(int i =0; i<split.length; i++)
	{
	     if(split[i].startsWith("T"))
	     System.out.println(split[i]);
	}
	
	
}
}

