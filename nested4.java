/* WAP that showcases inheritance, interface implementation, and data display, requiring corrective measures for accuracy and proper functionality.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
*/
class OuterClass {
    protected int x1 = 10;
    static int x2 = 200;

    class InnerClass1 {
        protected int x3 = 2;
    }

    class InnerClass2 extends InnerClass1 {
        protected int x4 = 2;
    }

    interface InnerA {
        int x5 = 100;
        int x6 = x2;

        void show();
    }
}

class XClass extends OuterClass {
    void disp1() {
        System.out.println("X1 is using disp1(): " + x1);
    }
}

class InterfaceClass implements OuterClass.InnerA {
    public void show() {
        System.out.println("X5 via interface is: " + x5);
        System.out.println("X6 via interface is: " + x6);
    }
}

public class nested4 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
        OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();

        System.out.println("X1 is: " + myOuter.x1);
        System.out.println("X2 is: " + OuterClass.x2);
        System.out.println("X3 is: " + myInner1.x3);
        System.out.println("X4 is: " + myInner2.x4);
        System.out.println("Checking inner inheritance, X3 is: "+ myInner2.x3);
        XClass xc1 = new XClass();
        xc1.disp1();

        InterfaceClass ic = new InterfaceClass();
        ic.show();
    }
}
