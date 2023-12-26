/*WAP in java to add 2 numbers with a function take user input with the help of OOPS.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
Date:- 22/08/2023
*/
import java.util.Scanner;
class Addition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1,n2;  
        //Inputting 1st no.
        System.out.println("enter your 1st number ");
        n1=sc.nextInt();
        //Inputting 2nd no.
        System.out.println("enter your 2nd number ");
        n2=sc.nextInt();
        //Calling Function
        int sum=my_sum(n1,n2);
        //Printing the output
        System.out.println("Addition is "+sum);
        sc.close();
        }

        //Addition Function
        public static int my_sum(int a,int b)
        {
            int c = a+b;
            return c;
        }

}