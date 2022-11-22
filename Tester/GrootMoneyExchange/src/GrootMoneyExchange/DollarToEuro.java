package GrootMoneyExchange;
import java.text.DecimalFormat;
import java.util.Scanner;  // Import the Scanner class

public class DollarToEuro {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter dollars to exchange to euro");

	    double dollarsToExchange = myObj.nextDouble(); 
	    
	    System.out.println(df.format(exchange(dollarsToExchange)));
	    
	}
	
	public static double exchange(double amount)
	{
		double euro = 0;
	    
	    //dollar rate as 15/11/22
	    double rate = 0.97;
	    
	    euro = amount * rate;
	    
		return euro;
		
	}

}
