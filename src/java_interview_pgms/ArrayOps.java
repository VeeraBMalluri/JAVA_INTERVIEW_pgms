package java_interview_pgms;

import java.util.HashSet;

public class ArrayOps {

	public static void main(String[] args) 
	{
		/*
		 *  Print the even numbers and Odd numbers in the array
		int a[] = {4,5,2,6,3,7,8,9};
		System.out.println("The even numbers are : ");
		for (int even : a)
		{
			
			if (even %2 ==0)
			{
				System.out.print(" "+ even);
			}
		}
		System.out.println("\nThe Odd numbers are : ");
		for (int odd : a)
		{
			
			if (odd %2 !=0)
			{
				System.out.print(" "+ odd);
			}
		}
		*/ 
		
		// Check Two Arrays are equal or not
		
		//int a[] = {2,5,6,4,8};
		//int b[] = {2,5,7,4,8};
		/*
		// my logic
		int i =0;
		if (a.length == b.length)
		{
			while(i<a.length)
			{
				if (a[i]== b[i]) 
				{
					i++;
					continue;
				}
				else
				{
					System.out.println(" Two arrays are not equal");
					break;
				}
				
			}
			if (i==a.length) 
			{
				System.out.println("Two arrays are equal");
			}
			
		}
		else
		{
			System.out.println(" Two arrays are not equal");
		}
		*/
		
		// another Logic 
		/*
		for (int i=0; i<a.length; i++)
		{
			if (a[i]!= b[i])
			{
				System.out.println("Two arrays are not equal");
				break;
			}
			
			if (i==a.length-1)
			{
				System.out.println("Two arrays are equal");
			}
			
		}
		*/
		
		/*
		// FIND Max and Min numbers in the array
		
		int a[] = {30,40,50,25,45,55,35};
		
		int max = a[0];
		int min = a[0];
		
		for (int i=1; i<a.length;i++)
		{
			 max = max>a[i]?max:a[i]; 
			 min = min<a[i]?min:a[i];
		}
		
		System.out.println("Max number in the array is : "+max);
		System.out.println("Min number in the array is : "+min);
		*/
		/*
		// Find duplicate numbers in array
		
		int a[] = {4,5,6,3,4,6,8,9,8};
		
		for (int i =0; i<a.length;i++)
		{
			int count = 0;
			//start the loop with index i so that duplicate elements wont print again and again
			// instead j =i, u can choose j = i+1, so that count check is not required
			for (int j =i;j<a.length;j++)
				if(a[i] == a[j])
				{
					count++;
				}
			
			if (count!=1)
			{
				System.out.print(a[i] + " ");
			}
			
		}
		
		
		*/
		
		// Find duplicate string in the String Array
		
		
		String arr[] = {"java", "C", "C++", "Python", "java", "python"};
		
		HashSet <String>langs = new HashSet<String>();
		
		Boolean Dup = false;
		for (String i :arr)
		{
			if (langs.add(i)==false)
			{
				System.out.println("Duplicate Element found "+ i);
				Dup = true;
			}
			
		}
		if (Dup == false)
		{
			System.out.println("No Duplicates Found in this array");
		}		
	}

}
