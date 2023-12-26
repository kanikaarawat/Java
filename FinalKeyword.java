/*Wap in Java For Final Keyword
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
public class FinalKeyword {

    // Final variable
    final int number = 42;

    // Method to display the final variable
    void displayNumber() {
        System.out.println("The final number is: " + number);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        FinalKeyword obj = new FinalKeyword();

        // Accessing and displaying the final variable
        obj.displayNumber();

        // Attempting to modify the final variable (results in a compilation error)
        // obj.number = 99; // Uncommenting this line will result in a compilation error
    }
}
