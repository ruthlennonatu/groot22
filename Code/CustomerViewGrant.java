import ie.atu.groot22.*;
import java.util.*;

public class CustomerViewGrant{
      
      public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("****Please Enter your Grant ID to view****");
		System.out.println("***************");
		int grantID = sc.nextInt();
		
		getGrant(grantID);
	}
   
   public static void getGrant(int grantID)
   {
      System.out.println("Your grant info is as follows: ");
   }

}}