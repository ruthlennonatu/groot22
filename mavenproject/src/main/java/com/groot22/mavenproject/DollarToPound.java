package com.groot22.mavenproject;
import java.text.DecimalFormat;
import java.util.Scanner;  // Import the Scanner class

public class DollarToPound {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter dollars to exchange to pound");

	    double dollarsToExchange = myObj.nextDouble(); 
	    
	    System.out.println(df.format(exchange(dollarsToExchange)));
	    
	}
	
	public static double exchange(double amount)
	{
		double pound = 0;
	    
	    //pound rate as 06/12/22
	    double rate = 0.82;
	    
	    pound = amount * rate;
	    
		return pound;
		
	}

}



