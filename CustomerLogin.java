import java.util.*;

public class CustomerLogin{

    public static void main(String[] args){
        String email="";
        String password="";
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");
        email = sc.nextLine();
    
        System.out.println("Enter password: ");
        password = sc.nextLine();
    
        System.out.println(email);
        // check if credentials are valid
        /*
         * if username is equal to username and the password is equal to password
         * success
         * else if username is not equal to username  
         * Invalid username
         * else if password is not equal to password
         * Invalid password
         * else
         * Both invalid    
         */
    }
    
}