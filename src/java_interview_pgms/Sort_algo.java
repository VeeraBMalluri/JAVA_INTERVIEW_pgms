package java_interview_pgms;

import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.lang3.ArrayUtils;

public class Sort_algo {

	public static void main(String[] args) 
	{
		int a[] = {2,5,3,6,4,9,8,1};
		/*
		//Bubble sort
		int count= 0;
		
		for(int i=0; i<a.length-1; i++)
		{
			
			
			
			for (int j=0; j<a.length-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					int c = a[j];
					a[j] = a[j+1];
					a[j+1]= c;
					
				}
			}
			for(int k :a)
			{
				System.out.print(k +" ");
			}
			count++;
			System.out.println("Round"+count);
		}
		*/
		// Sorting By using built in function
		System.out.println("Array elements before sort"+ Arrays.toString(a));
		//Arrays.parallelSort(a);
		//Arrays.sort(a)  --> will sort the numbers in ascending order
		
		// If you want sort the numbers in reverse order we have to Collections.reverseOrder() functions
		// And it will not work on primitive data types
		Integer arr[]  = ArrayUtils.toObject(a);
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array elements after sort"+ Arrays.toString(arr));
		
		/*
		x	
		for(int i=0; i<a.length; i++)
		{
			for(int k :a)
			{
				System.out.print(k +" ");
			}
			count++;
			
			System.out.println("Round"+count);
			for (int j=i+1; j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					int c = a[i];
					a[i] = a[j];
					a[j]= c;
					
				}
			}
				
		}*/

	}

}
