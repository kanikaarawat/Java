/*
Write a program in java to establish a connection with SQL Server
in Xampp 
 *
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
DATE- 5th December, 2023
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class jdxexp{
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            if (con != null) {
                System.out.println("Successfully connected to my SQL Server...");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

