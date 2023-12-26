/*1. Wap in java to display Ping and Pong using two threads.
 * 2. Implement the PingPong Program using thread class extension.
 * 3. Print as follows
 *   a.) Ping : 1/20th of a second
 *   b.) Pong :1/40th of a second
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */
// Runnable class for "Ping"
class PingPongThread extends Thread{
   String message="";
   int sleepTime;
   PingPongThread(String message, int sleepTime){
       this.message=message;
       this.sleepTime=sleepTime;
   }
   public void run(){
       try{
           for(;;) {
               System.out.println(message);
               Thread.sleep(sleepTime);
           }
       }
       catch (InterruptedException e){
           return;
       }
   }

}
public class RunaableInterface{
   public static void main(String[] args)
   {
       PingPongThread ping = new PingPongThread("Ping: 1/20th " , 50);//1/20th second
       PingPongThread pong = new PingPongThread("Pong: 1/40th" , 25);//1/40th second
       ping.start();
       pong.start();
   }
}