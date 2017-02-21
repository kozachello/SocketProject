package home.client;

import java.util.ArrayList;


/**
 * Created by Козак on 13.02.2017.
 */

public class Client implements Runnable {

    private String username;
    private int id;
    private Thread t;
    ArrayList<String> chatlist = new ArrayList<>();

    public Client(String username) {
        this.username = username;
        chatlist.add(this.username);
        t = new Thread(this, username);
        if(username!=null)
        t.start();
    }

    public boolean usernameIsNotNull() {
        return true;
    }

    public String getClients() {
        for(int i=0; i<=chatlist.size(); i++) {
            return ("\n" + chatlist.get(i));
        }
        return null;
    }

    public boolean isClientThere(String username) {
        if(chatlist.contains(username)) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Client{" +
                "username='" + this.username + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}
