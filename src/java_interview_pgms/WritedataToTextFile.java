package java_interview_pgms;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class WritedataToTextFile {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("/Users/veerabmalluri/eclipse-workspace/JAVA_INTERVIEW_pgms/writefile.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java");
		bw.write("\nSelenium with Python");
		bw.close();

	}

}
