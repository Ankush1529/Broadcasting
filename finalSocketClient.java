import java.io.IOException;
import java.net.*;
import java.util.*;

public class broadcasting 
{

    public void createSocket()
    {
        createWriteThread();
    }

    public void createWriteThread() {
        Thread writeThread = new Thread() {
            public void run() {
                try {
                    int m = 500000;
                    DatagramSocket ss = new DatagramSocket();
                    while (m > 0) {
                        String sentence = "This is a message from client";
                        byte[] data = sentence.getBytes();
                        DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getByName("255.255.255.255"), 12345);
                        ss.send(sendPacket);
                        System.out.println("Message sent from client");
                        Thread.sleep(5000);
                        m -= 1;
                    }

                    ss.close();

                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (SocketException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        writeThread.setPriority(Thread.MAX_PRIORITY);
        writeThread.start();
    }
}
