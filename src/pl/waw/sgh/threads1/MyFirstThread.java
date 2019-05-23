package pl.waw.sgh.threads1;

public class MyFirstThread implements Runnable {

    private String name;
    private int iterator;

    private Thread prevThread;

    public MyFirstThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (iterator<10) {
            iterator++;
            System.out.println(name + " it=" + iterator);
        }
    }
}
