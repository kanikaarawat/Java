/*1.) WAP in Java for generating two threads one for printing even nos. and the other for printing ood nos.
 * 2.) Stopping no at 50
 * 3.) The two threads should be synchronized
 * 
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
class num_print {


    public synchronized void printNumbers(int n, int limit) throws InterruptedException {
        while (n <= limit) {
            System.out.println(Thread.currentThread().getName() + ": " + n);
            n+=2;
            try{
                Thread.sleep(50);
            }catch(Exception e){System.out.println(e);}
        }
    }
}
class MyThread11 extends Thread {
    num_print t;

    MyThread11(num_print t) {
        this.t = t;

    }

    public void run() {
        try {
            t.printNumbers(2, 20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class MyThread21 extends Thread {
    num_print t;

    MyThread21(num_print t) {
        this.t = t;
    }

    public void run() {
        try {
            t.printNumbers(1,20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Runnable3 {
    public static void main(String[] args) {
        num_print np = new num_print();
        MyThread11 t1 = new MyThread11(np);
        MyThread21 t2 = new MyThread21(np);
        t1.setName("even");
        t2.setName("odd");
        t2.start();
        t1.start();
 }
}