package java_interview_pgms;
import java.util.Scanner;


public class RevNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		// reverse algorithm
		
		int revnum = 0;
		
		while(num!= 0)
		{
			revnum = revnum*10 + (num%10);
			num = num/10;
			
		}
		
		
		// String doesn't have the reverse method
		// By using StringBuffer  we can reverse the string by using reverse method by converting the integer to string
		
		
		/*
		StringBuffer numr = new StringBuffer(String.valueOf(num));
		
		StringBuffer revnum = numr.reverse(); */
		
		
		// 3rd method is by using string builder
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder revnum = sb.reverse(); */
		
		System.out.println("The Reverse NUmber is " + revnum );
	}

}
