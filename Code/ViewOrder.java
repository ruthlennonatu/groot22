import java.util.*;

public class ViewOrder {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
	
		System.out.println("Enter the your #Order ID");
		int orderID = scan.nextInt();
      
      switch(orderID){
         case 1:
            System.out.println("Order #1");
            break;
         case 2:
            System.out.println("Order #2");
            break;
         case 3:
            System.out.println("Order #3");
            break;
         case 4:
            System.out.println("Order #4");
            break;
         default:
            System.out.println("Please enter valid order number");
      
      }
      
      }
      
}