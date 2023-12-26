/*Wap in Java For Static Keyword
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
public class StaticKeyword {

    // Static variable
    static int count = 0;

    // Static method
    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        // Accessing the static variable and method
        System.out.println("Initial count: " + count);
        incrementCount(); // Calling the static method
        System.out.println("Count after increment: " + count);

        // Creating multiple objects of the class
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();

        // Accessing the static variable through objects
        obj1.count = 10; // This changes the static variable for all objects
        System.out.println("Count after modifying using obj1: " + obj1.count);
        System.out.println("Count after modifying using obj2: " + obj2.count);
    }
}
