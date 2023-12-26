/*Implement the PingPong program using runnable program.
 * 2.) In 1 second, aprroximately print
 *     a.)2 ping
 *     b.)1 pong
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */

// Runnable class for "Ping"
class Ping implements Runnable {
    public void run() {
        for (int count = 0; count < 2; count++) {
            System.out.println("Ping");
            try {
                Thread.sleep(500); // Sleep for 1/2 of a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable class for "Pong"
class Pong implements Runnable {
    public void run() {
        System.out.println("Pong");
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Runable2 {
    public static void main(String[] args) {
        Ping ping = new Ping();
        Thread pingThread = new Thread(ping);

        Pong pong = new Pong();
        Thread pongThread = new Thread(pong);

        // Start the "Ping" thread
        pingThread.start();

        // Start the "Pong" thread
        pongThread.start();
    }
}