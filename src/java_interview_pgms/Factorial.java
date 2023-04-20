package java_interview_pgms;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num ");
		int num = sc.nextInt();
		sc.close();
		
		long fact = 1;
		
		while(num!=0) 
		{
			fact= num*fact;
			
			num--;
		}
		System.out.println( "Factorial of Number is " + fact );

	}

}
