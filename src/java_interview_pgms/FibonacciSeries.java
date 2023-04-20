package java_interview_pgms;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number : ");
		int Num = sc.nextInt();
		
		sc.close();
		
		int a=0;
		int b=1;
		
		int sum =0;
		System.out.print("Fibonaacci series is : " +a);
		while (sum<Num)
		{
			
			sum = a+b;
			a= b;
			b=sum;
			System.out.print(" "+a);
			
		}
		
	}

}
