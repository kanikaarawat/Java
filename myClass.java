/*Wap in Java to handle Arithmetic Exception(Classwork)
 * 1....a=1, b=0;
 * 2....a=1, b=1;
 * 3....throw
 * 4....throws
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
*/
public class myClass {
    static float myfn(int a, int b)   //Function defined to check ArithmeticException
    {
        float i= a/b;
        return i;
    }
    public static void main(String[] args)
    {
        int a=1;
        int b=0;
        try{                         //Exception can occur in this block
            float c = myfn(a,b);     //Calling Function
            System.out.println("Value of c: " + c);    
        }
        catch(ArithmeticException e ) //Handles the uncertain condition of a try block
        {
            System.out.println(e.getMessage());  //This method(getMessage() prints only the description of the exception.
        }
        finally                   
        {
            System.out.println("Finally block executed");   //It is executed after the catch block.    
        }
        System.out.println("Remaining code");  //It is printed regardless.
    }
}




