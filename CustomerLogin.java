import java.util.*;

public class CustomerLogin {
    public static void main(String[] args) {

        String email;
        String password;

        String testPassword = "letmein";
        String testEmail = "email@.ie";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");
        email = sc.next();

        System.out.println("Enter password: ");
        password = sc.next();

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

        if (email.equals(testEmail) & password.equals(testPassword)) {
            System.out.println("success");
        } else if (!email.equals(testEmail) & password.equals(testPassword)) {
            System.out.println("Invalid email");
        } else if (email.equals(testEmail) & !password.equals(testPassword)) {
            System.out.println("Invalid password");
        } else {
            System.out.println("both invalid");
        }
    }
}