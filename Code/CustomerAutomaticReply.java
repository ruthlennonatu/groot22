import groot22.Code.CustomerInformation;

public class CustomerAutomaticReply{
	
	static void grantDeniedResponse() 
	{
		String customer = CustomerInformation.getName();
      System.out.println("Dear "+ customer);
      System.out.println("We regret to inform you you have not qualified for a groot22 grant")
      System.out.println("Regards, groot22");
	}
}