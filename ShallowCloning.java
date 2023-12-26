/*Wap in Java For Shallow Cloning
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
import java.util.Scanner; // Importing Scanner class for input

class ShallowCloning implements Cloneable {
   private String name; 
   private int age;     
   
   // Constructor to initialize name and age
   public ShallowCloning(String name, int age){
      this.name = name;
      this.age = age;
   }
   
   // Method to display person's data
   public void displayData(){
      System.out.println("Name : "+this.name); 
      System.out.println("Age : "+this.age);   
   }
   
   public static void main(String[] args) throws CloneNotSupportedException {
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter your name "); 
      String name = sc.next();              
      System.out.println("Enter your age ");  
      int age = sc.nextInt();               
      
      ShallowCloning std = new ShallowCloning(name, age); // Creating an original object
      System.out.println("Original object:");         // Displaying original object label
      std.displayData();                               // Displaying original object's data
      
      System.out.println("Copied object:");           // Displaying copied object label
      ShallowCloning copiedStd = (ShallowCloning) std.clone(); // Creating a copied object using clone
      copiedStd.displayData(); 
      sc.close();                              // Displaying copied object's data
   }
}
