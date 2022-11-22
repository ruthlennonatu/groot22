package ie.atu.groot22;

import ie.atu.testers;

import java.util.Scanner;

public class ViewGrantOptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("********* Groot Grants ********");
        System.out.println("1. Icecap - $100");
        System.out.println("2. Greenland - $500");
        System.out.println("3. Rainfall - $1000");
        System.out.println("4. Heatwave - $5000");
        System.out.println("5. *POPULAR* Snowbird - $10000");
        System.out.println("*******************************");
        System.out.print("Enter an option from 1-5: ");
        int input = sc.nextInt();


        getOption(input);
    }

    static String getOption(int input){
=======
        sc.close();
        getOption(input);
    }

    public static String getOption(int input){


        switch(input){
            case 1:
            	return "Icecap grant option worth $100";
            case 2:
            	return "Greenland grant option worth $500";
            case 3:
            	return "Rainfall grant option worth $1000";
            case 4:
            	return "Heatwave grant option worth $5000";
            case 5:
            	return "Snowbird grant option worth $10000";
            default:
            	return "Thanks for using our service.";
        }
    }
}