/*Wap in Java to handle Arithmetic Exception(Classwork)
 * 1....a=1, b=0;
 * 2....a=1, b=1;
 * 3....throw
 * 4....throws
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
*/
public class myClass3 {
    static float myfun(int a, int b) throws ArithmeticException {   // Used for exception handling without try & catch block. 
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        float i = (float) a / b;
        return i;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            float c = myfun(a, b);
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage()); //getMessage() method prints the throw msg
        }

        System.out.println("Remaining code");
    }
}
