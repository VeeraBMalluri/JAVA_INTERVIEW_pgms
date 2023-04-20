package java_interview_pgms;

import java.util.Scanner;

public class counter {
	
	public static int numberlength(int num)
	{
		int Num = num;
		/*
		String numS = String.valueOf(Num);
		return numS.length();
		*/
		
		// by using algorithm
		int i =0;
		
		for  (i=0; Num!=0; i++) 
		{
			Num = Num/10;
			
		}
		return i;
		
	}
	
	public static int[] noOfEvenOdddigits (int num1)
	
	{
		int N1 = num1;
		int eo[] = new int[2];
		
		int even= 0;
		int odd = 0;
		int digit =0;
		
		while (N1!=0)
		{
			digit = N1%10;
			
			if (digit%2 ==0) 
			{ 
				even+=1;
			}
			else 
			{ 
				odd+=1;
			}
			
			N1= N1/10;				
		}
		eo[0] = even;
		eo[1] = odd;
		
		
		return eo;
		
	}
	
	public static int sumofdigits(int num)
	{
		int N1 = num;
		int digit = 0;
		int sum =0;	
		
		while (N1!=0) 
		{
			digit = num%10;
			sum+=digit;
			N1= N1/10;
		}
		
		return sum;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n1 = sc.nextInt();
		sc.close();
		
		//System.out.println("The length of the Number "+numberlength(n1));
		
		/*
		int evenodd[] = new int[2];
		evenodd = noOfEvenOdddigits(n1);
		System.out.println("The number of even and odd digits in Number are " + evenodd[0] + " and " + evenodd[1]);
		*/
		
		System.out.println("The sum of digits in number are " + sumofdigits(n1));

	}

}
