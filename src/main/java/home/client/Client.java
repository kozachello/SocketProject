package home.client;

import java.util.ArrayList;


/**
 * Created by Козак on 13.02.2017.
 */

public class Client  {

    private String username;
    private int id;
    ArrayList<String> chatlist = new ArrayList<>();

    public Client(String username) {
        this.username = username;
        chatlist.add(this.username);
    }

    public boolean usernameIsNotNull() {
        if(this.username.getBytes().length>0) {
            return true;
        } else return false;
    }

    public String getUsername() {
        return this.username;
    }

    public int checkUserId(String username) {
        id = chatlist.indexOf(username);
        return id;
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

}
