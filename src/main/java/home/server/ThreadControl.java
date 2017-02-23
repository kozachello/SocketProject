package home.server;

import home.socket.ClientSocket;

import java.io.IOException;

/**
 * Created by Козак on 13.02.2017.
 */

public class ThreadControl implements Runnable {

    private String threadName;
    private Thread thread;
    private ClientSocket user;

    public ThreadControl(String threadName) {
        this.threadName = threadName;
        user = new ClientSocket(threadName);
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void run() {
        try {
            user.main(user.getSocketUser());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
