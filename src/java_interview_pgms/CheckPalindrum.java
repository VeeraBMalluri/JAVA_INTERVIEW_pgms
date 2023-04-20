package java_interview_pgms;
import java.util.Scanner;

public class CheckPalindrum {

	public static void main(String[] args) 
	
	{
		
		/*
		 String  result = checkPalindrumNum();
		 System.out.println(result);
		 */
		
		String  result = CheckPalindrumword();
		System.out.println(result);
		
		
		
	}
	
	public static String checkPalindrumNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num:");
		int Num = sc.nextInt();
		sc.close(); 
		
		int Numcopy = Num;
		int revnum=0;
		
		while(Numcopy!=0)
		{
			revnum = revnum*10 + (Numcopy%10);
			Numcopy=Numcopy/10;
		}
		
		if(Num == revnum) 
		{
			return " This is a Palindrum Number";
		}
		
		else
		{
			return "This is not a Palinddrum Number ";
		}
		
	
	}
	
	public static String CheckPalindrumword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The word String: ");
		String word = sc.next();
		
		sc.close(); 
		
		StringBuffer sb = new StringBuffer(word);
		StringBuffer revword = sb.reverse();
		
		String rword = revword.toString();
		System.out.println(word + " --- " +rword);
		
		if(word.equalsIgnoreCase(rword)) 
		{
			return " This is a Palindrum word";
		}
		
		else
		{
			return "This is not a Palinddrum word";
		}
	}

}
