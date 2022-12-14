import java.util.Scanner;

public class ViewGrantapproval {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Customer.SQL");
            System.out.print("Enter a grant id: ");
            int custId = sc.nextInt();

            String loginQuery = "Select * from GrantStatus where CusomterID = ?";

            PreparedStatement query = conn.prepareStatement(loginQuery);

            query.setString(1, custId);

            ResultSet result = query.executeQuery();
            System.out.println(result.getStatement().toString());

            // close prepared statement
            query.close();

            result.close();

            // close connection
            conn.close();
        } catch (SQLException e) {
            // error handling & print error message
            System.out.println("Error : " + e.getMessage());
        }
    }

}