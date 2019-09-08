package com.yunxi.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] buf = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(buf,0,datagramPacket.getLength()));
        datagramSocket.close();

    }
}
