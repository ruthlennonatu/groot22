import java.util.*;

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

        switch(input){
            case 1: 
                System.out.println("Icecap grant option worth $100");
                break;
            case 2: 
                System.out.println("Greenland grant option worth $500"); 
                break;
            case 3: 
                System.out.println("Rainfall grant option worth $1000"); 
                break;
            case 4: 
                System.out.println("Heatwave grant option worth $5000"); 
                break;
            case 5: 
                System.out.println("Snowbird grant option worth $10000");
                break;
            default:
                System.out.println("Thanks for using our service.");
                break;
        }
    }
}