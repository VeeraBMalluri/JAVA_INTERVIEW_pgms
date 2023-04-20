package java_interview_pgms;

import java.util.Arrays;

public class RmvJunkChar {

	public static void main(String[] args) 
	{
		/*
		String a = " #$%&#()~ Hi This is Veera";
		// Removes all characters expect a-z, A-z, 0-9
		a= a.replaceAll("[^a-zA-Z0-9]", "");
		
		// to replace spaces use "\\s" which matches the space char
		//a.replaceAll("\\s", "")
		System.out.println(a);
		*/
		
		/*
		//Count no of Words in Sentence
		
		String a = "Java is an Object Oriented Programming Language";
		
		String word[] = a.split(" ");
		
		System.out.println(word.length);
		*/
		
		
		// Reverse the each word in the sentence
		
		String a = "Java is an Object Oriented Programming Language";
		
		String word[] = a.split(" ");
		
		System.out.println(Arrays.toString(word));
		String revword = "";
		for (int i =0; i<word.length;i++)
		{
			String wrd = word[i];
			//System.out.println(wrd);
			char c[] = wrd.toCharArray();
			String revwrd ="";
			for(int j=c.length; j>0; j--)
			{
				 revwrd+=c[j-1]; 
				
			}
			//System.out.println(revwrd);
			revword+=revwrd+" "; 
			
		}
		
		System.out.println(revword);
	}


}
