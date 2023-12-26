/*
 * author@ Akash Chauhan
  sap id = 500105955
  roll no =R2142220223

 * Write a program in Java to find if a given number is prime or not. Take input from the user.  

Print statements: Number is prime or Number is not prime.
 * 
 */




public class prime {
    // user input and check if a number is prime or not
    public static void main(String[] args) {
        int a;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        sc.close();
        int flag = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}