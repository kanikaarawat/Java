/*Wap in Java to handle Arithmetic Exception(Classwork)
 * 1....a=1, b=0;
 * 2....a=1, b=1;
 * 3....throw
 * 4....throws
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
*/
class myClass2 {
    static float myfun(int a, int b) {
        if (b == 0) {
            // Throw an ArithmeticException when dividing by zero
            throw new ArithmeticException("Division by zero is not allowed"); //Transfers control from the try block to the catch block. 
        }
        float i = (float) a / b;
        return i;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            float c = myfun(a, b);
            System.out.println("Result: " + c);   //Result will be printed when no exception is there
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());  //Catch takes the message From the new ArithmeticException
        }

        System.out.println("Remaining code");
    }
}
