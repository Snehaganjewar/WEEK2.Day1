package Week2.day1;

public class SplitText {
public static void main(String[] args) {
	
	String text2 = "Testleaf is situated in twin towers teynampet";
	
	String [] Str =text2.split(" ");
	
	for(int i =0; i<Str.length; i++)
		
	{
		 //System.out.println(Str.length);
	     if(Str[i].startsWith("T"))
	     System.out.println(Str[i]);
	}
	
}
}
