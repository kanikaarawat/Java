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

public class ExpMyClass {
        static char retrieveCharacter(String str, int index) {  //Defining A Function
        return str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //Used To get Input from The User

        System.out.print("Enter a string: ");      //Getting Input
        String input = scanner.nextLine();

        System.out.print("Enter an index to retrieve a character: ");   //Getting index for the string
        int index = scanner.nextInt();

        try {
            char character = retrieveCharacter(input, index);      // Calling Function
            System.out.println("Character at index " + index + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {      //To indicate that an index is either negative or greater than the size of the string.
            System.out.println("Built-in Exception: Index is out of range.");
        }

        scanner.close();
    }

}
