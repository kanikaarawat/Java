/* WAP in JAVA to calculate the factorial of an integer.Take the integer as user input. 
Create a method for calculating factorial, call it in the main function. display output as- the factorial of __ is __
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
Date:- 22nd August, 2023*/

 
import java.util.Scanner;


public class Factorial {
	 public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter an integer: ");
         int number = scanner.nextInt();
         
         long factorial = calculateFactorial(number);
         
         System.out.println("The factorial of " + number + " is " + factorial);
         scanner.close();
     }
     
     public static long calculateFactorial(int n) {
         if (n == 0 || n == 1) {
             return 1;
         }
         
         long result = 1;
         for (int i = 2; i <= n; i++) {
             result *= i;
         }
         return result;
     }
}