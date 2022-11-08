public class DatabaseConnector(){
initializeDB();
}

private void initializeDB() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");  //

            System.out.println("Driver loaded");

            // Connect to a database - in this case testDB
            Connection connection = DriverManager.getConnection
                    ("(databaselocation)", "root", "password");
            if (connection != null)
                System.out.println("Database connected");

            // Create a statement
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
