import java.sql.*;

public class DatabaseConnector{
private Statement statement;

public static void main(String[] args) {

   try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");  //

            System.out.println("Driver loaded");

            // Connect to a database - in this case testDB
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/GrootDb?serverTimezone=UTC", "root", "password");
            if (connection != null)
                System.out.println("Database connected");

            // Create a statement
            Statement statement = connection.createStatement();
            String insertQuery = "insert into Customer(CustomerID, LastName, FirstName, Email) values ('1', 'Doe', 'John', 'johndoe@gmail.com')";
            PreparedStatement preStmtInsert = connection.prepareStatement(insertQuery);
            
            preparedStatement.executeUpdate();
            String queryString = "select * from Customer";

            ResultSet rset = statement.executeQuery(queryString);
            String resultString = " ";

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Got an exception!");
        }

}


}

