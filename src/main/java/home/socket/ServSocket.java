package home.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Козак on 13.02.2017.
 */
public class ServSocket {

    private static final int PORT = 19000; // задаем порт, который наша прога будет слушать

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Started! Waiting for connection");
            Socket socket = serverSocket.accept(); // тут сервер будет висеть до то тех пор пока ктото не подключится
            System.out.println("Accepted! " + socket.getInetAddress()); // есть контакт! получаем адрес клиента
            try (InputStream in = socket.getInputStream(); OutputStream out = socket.getOutputStream()) {
                DataInputStream din = new DataInputStream(in);
                DataOutputStream dout = new DataOutputStream(out);
                byte[] buf = new byte[8*1024]; // байтовый массив для хранения пакетов любого типа данных
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
