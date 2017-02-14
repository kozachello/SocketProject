package home.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Козак on 13.02.2017.
 */
public class ServSocket {

    private static final int PORT = 19000;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Started! Waiting for connection");
            Socket socket = serverSocket.accept();
            System.out.println("Accepted! " + socket.getInetAddress());
            try (InputStream in = socket.getInputStream(); OutputStream out = socket.getOutputStream()) {
                DataInputStream din = new DataInputStream(in);
                DataOutputStream dout = new DataOutputStream(out);
                byte[] buf = new byte[32*1024];
                int readBytes = din.read(buf);
                String line = new String(buf, 0, readBytes);
                System.out.printf("Client> %s", line);
                dout.write(line.getBytes());
                dout.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }
    }
}
