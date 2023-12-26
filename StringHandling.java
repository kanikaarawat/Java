/*Wap in Java to demonstarte String Handling and Wrapper Class Handling. S1, S2 (Classwork)
 * Initialize:- 
 *              String 3 in primitive style, String Style
 *              String 4 in primitive style, StringBuilder type
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */

import java.lang.String;
public class StringHandling {
      public static void main(String args[])
      {
        String S1 = new String("STRING 1");
        StringBuffer S2= new StringBuffer("STRING 2");
        String S3 = "STRING 3"; // Creating a string in primitive style
        StringBuilder S4 = new StringBuilder("STRING 4"); // Creating a string in primitive style with StringBuilder type
        System.out.println("First String: "+ S1);
        System.out.println("Second String: " + S2);
        System.out.println("Third String: "+ S3);
        System.out.println("Fourth String: " + S4);
        System.out.println("Lowercase of S1: " + S1.toLowerCase()); //toLowerCase():- convert all the characters in a String to lowercase. 
        System.out.println("Lowercase of S2: " + S2.toString().toLowerCase());  //convert the StringBuffer to a String 
        System.out.println("Lowercase of S1: " + S3.toLowerCase());    
        System.out.println("Lowercase of S1: " + S4.toString().toLowerCase());  //convert the StringBuilder to a String
      }   
}
