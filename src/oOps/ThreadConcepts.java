package oOps;

public class ThreadConcepts {
    public static void main(String[] args) throws InterruptedException {

        Ravi  ravi
                =new Ravi();
        Ravi  ravi1=new Ravi();
        ravi.start();
        ravi.join();
        ravi1.start();



    }
}
class Ravi extends Thread{
    public synchronized void  run() {
        for(int i=0;i<5;i++){

            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
