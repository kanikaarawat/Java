/*
•   Create a new database “Student”
•   Create a table “stud_rec”
•   Col1: rol no. (int)
•   Col2: name (varchar 20)
•   WAP in java to insert a record into “stud_rec”
 *
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
DATE- 5th December, 2023
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jsx2 {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/Student";  // Change the URL based on your database
        String username = "root";
        String password = "";

        // Record details
        int rolNo = 1;  // Set the rol_no
        String name = "John";  // Set the name

        // JDBC code
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");

            // SQL query to insert a record into "stud_rec"
            String insertQuery = "INSERT INTO stud_rec (rol_no, name) VALUES (" + rolNo + ", '" + name + "')";

            // Create a Statement to execute the SQL query
            try (Statement statement = connection.createStatement()) {
                // Execute the query
                int rowsAffected = statement.executeUpdate(insertQuery);

                // Display the result
                System.out.println(rowsAffected + " row(s) inserted successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close the database connection
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

