/*WAP in Java to 
 * --->Create a program Simple2.java.
 *     Put it in mypack.
 * --->Create a custom Function.
 *     void disp1(), print
 *     "This is Simple."
 * --->Create Simple3.java in the same package. Call void disp1() from here.
 * --->Creatde Simple4.java in a different package.
 * --->Call void disp1() from here using package import.
 * 
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
Date of experiment: 19/09/2023
 */

//Simple2.java in mypack
package mypack;             //Package mypack creates a new directory to store Simple2 Class

public class Simple2{
    public static void disp1() {
        System.out.println("This is Simple.");
    }
        public static void main(String[] args) {
        disp1(); // Calling the disp1 method from the main function
    }

}

