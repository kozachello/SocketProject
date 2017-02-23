package home.server;

/**
 * Created by Козак on 13.02.2017.
 */

public class ThreadControl implements Runnable {

    private String threadName;
    private Thread thread;

    public ThreadControl(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {

    }
}
