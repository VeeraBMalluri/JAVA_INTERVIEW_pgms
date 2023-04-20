package java_interview_pgms;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class ReadDataFromTxt {

	public static void main(String[] args) throws IOException 
	{
		// Approach 1 Using File Reader and BufferedReader
		/*
		FileReader file1 = new FileReader("/Users/veerabmalluri/eclipse-workspace/JAVA_INTERVIEW_pgms/Readfile.txt");
		
		BufferedReader br = new BufferedReader(file1);
		
		String line = "";
		
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		*/
		
		//Approach 2 Using File and Scanner
		
		File file = new File("/Users/veerabmalluri/eclipse-workspace/JAVA_INTERVIEW_pgms/Readfile.txt");
		
		Scanner sc = new Scanner(file);
		
		/*
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		*/
		
		//Approach 3 : With out using while loop
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
