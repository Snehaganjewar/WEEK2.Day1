package Week2.day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1="stops";
	String text2="potss";
	//check if length is same 
	if (text1.length() == text2.length())
	{
		//covert string array to char arrat
		char[] charArray1=text1.toCharArray();
		char[] charArray2=text2.toCharArray();
		
		//sort char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		//check if both arrays have same value
		boolean result = Arrays.equals(charArray1, charArray2);
		
		if (result)
		{
			System.out.println(text1 + " and " + text2 + " are Anagram");
		}
		else 
		{
			System.out.println(text1 + "and" + text2 + "are not Anagram");
		}
		//else
		{
			//System.out.println(text1 + "and" + text2 + "are not Anagram");
		}
	}			
	
}
}
