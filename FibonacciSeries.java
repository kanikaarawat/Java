/*
 WAP in java for fibonacci series.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
Date:- 15/08/2023
 */


public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0, second = 1;

        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

