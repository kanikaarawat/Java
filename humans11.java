/*WAP in Java to demonstrate inheritance
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */

class Father {
    String fprop = " Car";
    void disp1(){
        System.out.println("Father has car");
    }
}
class son extends Father{
    String sprop = " Bike";
    void disp2(){
        System.out.println("Son has Bike");
    }
}
class humans11{
    public static void main(String[] args){
        son s = new son();
        System.out.println("Son has"+ s.sprop);
        System.out.println("Son has"+s.fprop);
    }
}
//Private class protects call methods of methods of using Son's class
//