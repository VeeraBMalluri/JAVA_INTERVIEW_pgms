package java_interview_pgms;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		// Using String concatenation approach
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to reverse : ");
		
		String word = sc.next();
		sc.close();
		
		String revword = "";
		
		/*
		for(int i=word.length(); i>0; i--)
		{
			char c = word.charAt(i-1);
			revword+=c;
			
		}*/
		
		// Using Array String 
		
		char c[] = word.toCharArray();
		
		for(int i=c.length; i>0; i--)
		{
			 revword+=c[i-1];
			
			
		}
		
		
		System.out.println("The reverse string is " +revword);
	}

}
