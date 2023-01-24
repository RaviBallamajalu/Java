package oOps;

import java.util.HashSet;

public class ThreadConcepts {
    public static void main(String[] args) throws InterruptedException {


        Ravi ravi
                = new Ravi();

        Ravi ravi1=new Ravi();
        Ravi ravi2=new Ravi();
        ravi1.start();
        ravi2.start();

   /*     Thread t1 = new Thread(ravi, "t1");
        Thread t2 = new Thread(ravi, "t2");
        t1.start();
        t2.start();*/
//ravi.join();


    }
}

class Ravi extends Thread {
    static int k = 1;


    public synchronized void run() {
        for (int i = 0; i < 5; i++) {

            HashSet<Integer> hashSet = new HashSet<Integer>();
            hashSet.size();
            //  hashSet.add()

            try {
                System.out.println(k + " " + Thread.currentThread());
                k++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
