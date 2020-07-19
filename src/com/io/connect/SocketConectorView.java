package com.io.connect;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author alsorc
 */
public class SocketConectorView {

    static SocketConectorView mySocket = null;
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;

    public SocketConectorView() throws IOException {
        
        //IP de mi servidor
        InetAddress ip = InetAddress.getByName("25.33.154.31");

        // establish the connection with server port 5056 
        this.socket = new Socket(ip, 5056);
        
        // obtaining input and out streams 
        this.dis = new DataInputStream(this.socket.getInputStream());
        this.dos = new DataOutputStream(this.socket.getOutputStream());
    }

    public static SocketConectorView getSocketConector() throws IOException {
        return new SocketConectorView();
    }
    
    
    public void sendMessage(Messages msg) throws IOException{
        this.dos.writeUTF(msg.getValue());
    }
    
    public DataInputStream getInputData(){
        return this.dis;
    }
    
}
