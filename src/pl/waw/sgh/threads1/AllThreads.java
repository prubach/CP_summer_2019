package pl.waw.sgh.threads1;

public class AllThreads {

    static final int NUM_THREADS=5;

    public static void main(String[] args) {
        MyFirstThread mft1 = new MyFirstThread("Thread 1");
        Thread t1 = new Thread(mft1);
        //mft1.run();
        MyFirstThread mft2 = new MyFirstThread("Thread 2");
        Thread t2 = new Thread(mft2);
        t1.start();
        t2.start();
        //mft2.run();
    }

}
