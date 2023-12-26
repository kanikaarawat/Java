/* WAP in java fibonacci variation to print the output
 the fibonacci series till 70 and add * if the numbver is even is:
		 display:
		 1:1
		 2:1 
		 3:2*
		 4:3
		 5:5
		 6:8*.....

Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
Date:- 15/08/2023
 */
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series:");
            printFibonacciSeries(n);
        }
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": " + firstTerm);

            // Check if the term is even and add an asterisk
            if (firstTerm % 2 == 0) {
                System.out.print("*");
            }

            System.out.println();

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
	
	}
