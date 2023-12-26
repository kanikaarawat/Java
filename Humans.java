/* 
WAP in JAVA to demonstrate inheritance.Take the integer as user input. 
Create a method for calculating factorial, call it in the main function. 
Display output as- the factorial of __ is __
1) private->protected-> call methods of father using sons object
2) add grandfather->father extends grandfather->s.gprop

Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
12/09/2023
 */

class Grandfather {
    private String gprop = "House";
    
    private void disp3() {
        System.out.println("Grandfather has a house");
    }
}

class Father extends Grandfather {
    protected String fprop = "Car";
    
    protected void disp1() {
        System.out.println("Father has a car");
    }
}

class Son extends Father {
    private String sprop = "Bike";
    
    private void disp2() {
        System.out.println("Son has a bike");
    }
    
    public void callFatherMethods() {
        super.disp1(); // Calling the protected method of the father class
    }
}

class Humans {
    public static void main(String args[]) {
        Son s = new Son();
//        System.out.println("Son has " + s.sprop);// This will not work due to private access
        System.out.println("Son has " + s.fprop); // This will work as fprop is protected
        
        s.callFatherMethods(); // Calling the protected method of the father class through the son's object
        }
}