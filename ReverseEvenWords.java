package Week2.day1;

import java.util.Arrays;

public class ReverseEvenWords {
public static void main(String[] args) {
	
	String test = "I am a software tester";
	String arr[] = test.split(" ");
	
	for (int i = 0; i < arr.length; i++) 
	   {
		if (i % 2 == 0) 
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	   

		else 
		 {
			char arr1[] = arr[i].toCharArray();
			for (int j = (arr1.length) - 1; j >= 0; j--) {
				System.out.print(arr1[j]);
		 }
			System.out.print(" ");
		}
	
}
}
}