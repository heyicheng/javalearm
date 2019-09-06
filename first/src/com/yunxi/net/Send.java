package com.yunxi.net;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String str="sdjfoaijsoidjfoiajsidjofia";
        byte[] buf=str.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
