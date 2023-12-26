/*
 * Assignment:-
 * --->Write a small program where you handle an exception of your choice.(except arithmetic)
 * --->Include user input, this should create the exception.
 * --->Print the exception message to show that the exception has been caught.
 * --->Identify the exception handling keywords that you used and why.
 * --->Create the customized exception for the same code.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 *  */

import java.util.Scanner;

// Customizing Exception class
class CustomStringIndexException extends Exception {
    public CustomStringIndexException(String message) {
        super(message);
    }
}

public class ExpMyClass2 {
        // Defining Function
    static char retrieveCharacter(String str, int index) throws CustomStringIndexException {
        if (index < 0 || index >= str.length()) {
            throw new CustomStringIndexException("Customized Exception: Index is out of range.");
        }
        return str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Used for taking inputs from the user
        System.out.print("Enter a string: "); //Inputting a string
        String input = scanner.nextLine();
        System.out.print("Enter an index to retrieve a character: "); //inputting an index
        int index = scanner.nextInt(); // Read the index from the user

        try {
            char character = retrieveCharacter(input, index); // Calling the function
            System.out.println("Character at index " + index + ": " + character); // Display the retrieved character if no exception comes up
        } catch (CustomStringIndexException e) {
            System.out.println(e.getMessage()); // Comes when exception is there and then displays the customized msg
        }

        scanner.close(); 
    }

}

