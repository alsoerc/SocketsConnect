package com.io.connect.Sensor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author alsorc
 */
public class SocketConectorSensor {

    private static SocketConectorSensor mySocket = null;
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;

    private SocketConectorSensor() throws IOException {
        
        //IP de mi servidor
        InetAddress ip = InetAddress.getByName("192.168.0.108");

        // establish the connection with server port 5056 
        this.socket = new Socket(ip, 5056);
        
        // obtaining input and out streams 
        this.dis = new DataInputStream(this.socket.getInputStream());
        this.dos = new DataOutputStream(this.socket.getOutputStream());
    }

    public static SocketConectorSensor getSocketConector() throws IOException {
        if (mySocket == null) {
            mySocket = new SocketConectorSensor();
        }
        return mySocket;
    }
    
    
    public void sendMessage(MessageResponse msg) throws IOException{
        this.dos.writeUTF(msg.getValue());
    }
    
    public void sendStatus(String status) throws IOException{
        this.dos.writeUTF(status);
    }
    
    public DataInputStream getInputData(){
        return this.dis;
    }

}