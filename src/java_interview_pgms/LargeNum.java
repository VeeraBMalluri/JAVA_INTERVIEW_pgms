package java_interview_pgms;
import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Number 3 :");
		int num3 = sc.nextInt();
		
		sc.close();
		
		int large =0;
		
		// Ternary Operator
		
		large = num1>num2?num1:num2;
		
		large = large>num3?large:num3;
		
		System.out.println("The Large number is " + large);
		

	}

}
