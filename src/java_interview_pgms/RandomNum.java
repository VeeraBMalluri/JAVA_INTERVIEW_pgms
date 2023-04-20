package java_interview_pgms;
//package org.apache.commons.lang3;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class RandomNum {

	public static void main(String[] args) 
	{
		// import the Random class from java utils package 
		//next int function allows you to provide the limit
		// if you mention 10 it provides the random numbers from 0 to 9;
		
		Random rn = new Random();
		
		int num = rn.nextInt(10);
		
		System.out.println(num);
		
		
		// NextDouble provides the decimal value also
		double decnum = rn.nextDouble(100);
		System.out.println(decnum);
		
		// by using Math class
		System.out.println(Math.random());
		
		//By using Apache common lang module
		
		String Rannum = RandomStringUtils.randomNumeric(10);
		System.out.println(Rannum);
		
		String charRan = RandomStringUtils.randomAlphabetic(6);
		System.out.println(charRan);
	}

}
