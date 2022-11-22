import java.util.Scanner;

public class PersonalInformationEntryForm 
{

   public static void main(String args[])
   {

      Scanner keyboardIn = new Scanner(System.in);

       int age;
       String firstName;
       String lastName;
       
       System.out.println("Please enter your first name:");
       firstName = keyboardIn.next();
       
       System.out.println("Please enter your surname:" );
       lastName = keyboardIn.next();
       
       System.out.println("Please enter your age:");
       age = keyboardIn.nextInt();
       
       System.out.println("Your name is : " + firstName + " " + lastName);
       System.out.println("You are: " + age + " years old. ");

       




}  // End main

}  // End class