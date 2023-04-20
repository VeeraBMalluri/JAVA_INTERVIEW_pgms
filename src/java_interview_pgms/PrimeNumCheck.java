package java_interview_pgms;
import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number >0 : ");
		int Num = sc.nextInt();
		sc.close();
		
		/*
		// algorithm thought by me 
		int i = 2;
		while (i<Num)
		{
			if (Num%i == 0)
			{
				System.out.println("This Number is not a Prime Number");
				
				break;
			}
			i++;
			
		}
		
		if (i==Num || Num==1) 
		{
			System.out.println("This is a prime number");
		}
		*/
		
		int count = 0;
		
		// if count = 2 then it's prime number other wise it's not a prime number
		// increment the count for every time it's divisible and got remainder as "0"
		
		if (Num >1) {
			for (int i=1; i<=Num;i++)
			{
				if(Num%i == 0) 
				{ 
					count++;
				}
				
			}
		}
		if (count ==2) 
		{
			System.out.println("This is a Prime number");
		}
		
		else 
		{
			System.out.println("This is not a prime number");
		}

	}

}
