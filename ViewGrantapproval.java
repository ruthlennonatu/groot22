import java.util.Scanner;

public class ViewGrantapproval {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Enter your grant id:");
        int grantId = reader.nextInt(); // Scans the next token of the input as an int.

        // sql line to revice the grant from the db to check it status
        System.out.println("SELCT * FROM Grants where id =" + grantId);

        // once finished
        reader.close();
    }

}