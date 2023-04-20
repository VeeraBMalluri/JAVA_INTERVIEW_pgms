package java_interview_pgms;

public class SumofArrayEle {

	public static void main(String[] args) 
	{
		int a[] = {5, 6,4,7,8};
		
		int sum = 0;
		
		/*
		// basic For loop
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("The sum of elements in the array is " + sum);
		*/
		
		// Enhanced For loop also called as For Each loop
		
		for (int el_value : a)
		{
			sum = sum+el_value;
		}
		
		System.out.println("The sum of elements in the array is " + sum);
	}

}
