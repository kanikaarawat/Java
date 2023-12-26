/* WAP in java to insert name and rollno of 3 students.
Write functions to insert info and displaying the info.
We have used 2 classes 
1) StudentDetails which when called takes the name and roll number of the students.
2) NewStudent which creates 3 objects of students and calls them
Author : Karan
Rollno. : R2142220534
SAP_ID :500105718
*/


import java.util.Scanner;

// Create a class to store student details
class StudentDetails {
    int rollno; // Variable to store roll number
    String name; // Variable to store name

    // Method to insert student record
    void insertRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter RollNo: ");
        rollno = sc.nextInt();
        sc.nextLine();
        sc.close();
    }

    // Method to display student information
    void displayInfo() {
        System.out.println(rollno + " " + name);
    }
}

public class NewStudent {
    public static void main(String args[]) {
        // Create three instances of the StudentDetails class for three students
        StudentDetails S1 = new StudentDetails();
        StudentDetails S2 = new StudentDetails();
        StudentDetails S3 = new StudentDetails();

        System.out.println("Enter Student 1 details: ");
        S1.insertRecord(); // Insert details for Student 1

        System.out.println("Enter Student 2 details: ");
        S2.insertRecord(); // Insert details for Student 2

        System.out.println("Enter Student 3 details: ");
        S3.insertRecord(); // Insert details for Student 3

        // Display details for each student
        System.out.println("Student 1 Details:");
        S1.displayInfo();

        System.out.println("Student 2 Details:");
        S2.displayInfo();

        System.out.println("Student 3 Details:");
        S3.displayInfo();
    }
}
