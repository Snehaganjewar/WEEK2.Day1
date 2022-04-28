package Week2.day1;

public class Palindrome {
public static void main(String[] args) {
	String text="madam";
	String text1 = "";
	
	int textLength=text.length();
	
	for (int i=(textLength-1); i>=0; i--)
   {
	  text1=text1+text.charAt(i);
   }
		
	if(text.toLowerCase().equals(text1.toLowerCase()))
	{
		System.out.println(text + " is a Palindrome String");
	}
	else
	{
		System.out.println(text + " is not Palindrome String");
	}
}
}
