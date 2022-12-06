package com.groot22.mavenproject;

import java.util.Scanner;

public class grantOptionPayment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("enter payment amount for grant");

	    int grant = myObj.nextInt(); 
	    
	    payment(grant);
	}
	
	public static int payment(int amount)
	{
		int grantoption1 = 10000;
		int grantoption2 = 20000;
		int grantoption3 = 30000;
		
		
		if(amount <  grantoption1)
		{
			System.out.print(grantoption1);
		}
		else if(amount <  grantoption2)
		{
			System.out.print(grantoption2);
		}
		else if(amount <  grantoption3)
		{
			System.out.print(grantoption3);
		}
		return amount;
	}

}
