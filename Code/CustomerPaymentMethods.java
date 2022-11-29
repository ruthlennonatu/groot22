package groot22;

import java.util.*;

public class CustomerPaymentMethods {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("****Please choose a payment method****");
		System.out.println("1. Credit Card");
		System.out.println("2. PayPal");
		System.out.println("3. Mobile Phone Billing");
		System.out.println("***************");
		System.out.print("Choose an option 1-3");
		int input = sc.nextInt();
		
		getPaymentOptions(input);
	}
	
	static void getPaymentOptions(int input)
	{
		switch(input)
		{
		case 1:
			System.out.println("Credit Card Payment Selected");
			break;
		case 2:
			System.out.println("Paypal Payment Selected");
			break;
		case 3:
			System.out.println("Mobile Phone Billing Selected");
			break;
		default:
			System.out.println("Payment method received");
			break;
		}
	}
}
