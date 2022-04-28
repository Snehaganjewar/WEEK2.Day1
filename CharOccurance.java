package Week2.day2;

public class CharOccurance {
public static void main(String[] args) {
	String str = "Welcome to Chennai";
	char search='e';
	int count = 0;
	for (int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)==search)
        count++;
	}
	
	System.out.println("The character ' " +search +" ' appears "+count + " times");
}
}
