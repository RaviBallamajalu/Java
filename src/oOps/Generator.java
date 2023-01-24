/*
package oOps;

class Generator implements Runnable {

    private int remainder;

    Generator(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (counter <= PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
                while (counter % NO_OF_THREADS != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (counter % NO_OF_THREADS == remainder &&
                        counter <= PRINT_NUMBERS_UPTO) {
                    System.out.print(Thread.currentThread().getName()
                            + "-" + counter + "\t");
                }
                counter++;
                lock.notifyAll();
            }

        }
    }

}
*/
