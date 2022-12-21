import java.util.*;

/**
 * Represents The System that will be used to take in customer Information.
 * Variables
 * Name
 * Grant
 * Values
 */
public class CustomerInformation {

    /**
     * Static void to implement quickly for testing
     */
    public static void main(String[] args){
        String name;
        String grant;
        String value;
        /* 
        customer will enter their:
        Name
        Grant they are applying for
        The amount they are applying for

         */
        
        
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = keyIn.next();

        System.out.println("Enter Name of Grant You are Applying for: ");
        grant = keyIn.next();

        System.out.println("Enter the Value of the grant you are applying for");
        value = keyIn.next();
        keyIn.close();//close the scanner when it is finished to reduce memory usage

        //display information back to customer
        System.out.println("Your Details Are As Follows");
        System.out.println("Customer Name: "+name );
        System.out.println("Grant Name: "+grant);
        System.out.println("Grant Value: "+value);
        
    }
}