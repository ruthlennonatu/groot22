import java.util.*;

public class AdminAccess {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
      
   System.out.println("Do you have admin access(Y/N): ");
   String ans = scan.next();
   if(ans.equals("Y") || ans.equals("y")){
   System.out.println("You can now view/edit the database");
   }
   else if(ans.equals("N") || ans.equals("n")){
   System.out.println("You do not have access to the database");
   }
   else:
   {
   System.out.println("Please enter vaid option");
   }
      
      
}
}