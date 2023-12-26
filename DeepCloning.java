/*Wap in Java For Deep Cloning
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
import java.util.Scanner;

class Contact implements Cloneable {
   private long phoneNo;
   private String email;
   private String address;

   // Setter method for phone number
   public void setPhoneNo(long phoneNo) {
      this.phoneNo = phoneNo;
   }

   // Setter method for email
   public void setEmail(String email) {
      this.email = email;
   }

   // Setter method for address
   public void setAddress(String address) {
      this.address = address;
   }

   // Constructor to initialize Contact object
   Contact(long phoneNo, String email, String address) {
      this.phoneNo = phoneNo;
      this.email = email;
      this.address = address;
   }

   // Method to display Contact information
   public void displayContact() {
      System.out.println("Phone no: " + this.phoneNo);
      System.out.println("Email: " + this.email);
      System.out.println("Address: " + this.address);
   }

   // Overriding clone method to support deep cloning
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}

public class DeepCloning implements Cloneable {
   private String name;
   private int age;
   private Contact contact;

   // Constructor to initialize DeepCloning object
   public DeepCloning(String name, int age, Contact contact) {
      this.name = name;
      this.age = age;
      this.contact = contact;
   }

   // Method to display DeepCloning data
   public void displayData() {
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      contact.displayContact();
   }

   // Overriding clone method to support deep cloning
   protected Object clone() throws CloneNotSupportedException {
      DeepCloning student = (DeepCloning) super.clone();
      student.contact = (Contact) contact.clone(); // Cloning the Contact object
      return student;
   }

   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your age: ");
      int age = sc.nextInt();

      System.out.println("############# Contact details #############");
      System.out.println("Enter your phone number: ");
      long phoneNo = sc.nextLong();
      System.out.println("Enter your Email ID: ");
      String email = sc.next();
      System.out.println("Enter your address: ");
      String address = sc.next();
      System.out.println(" ");

      // Creating an object of the class
      DeepCloning std = new DeepCloning(name, age, new Contact(phoneNo, email, address));

      // Creating a clone of the above object
      DeepCloning copiedStd = (DeepCloning) std.clone();

      // Modifying the data of the contact object in the cloned object
      copiedStd.contact.setPhoneNo(000000000);
      copiedStd.contact.setEmail("XXXXXXXXXX");
      copiedStd.contact.setAddress("XXXXXXXXXX");

      System.out.println("Contents of the copied object:");
      copiedStd.displayData();
      System.out.println(" ");

      System.out.println("Contents of the original object:");
      std.displayData();
      sc.close();
   }
}
