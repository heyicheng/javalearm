package com.yunxi.network;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Send {
    public static void main(String[] args) throws IOException {

        DatagramSocket datagramSocket = new DatagramSocket();
        String str="sijdfioajio ";



        byte[] buf=str.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(),8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
    @Test
    public void sjdfja() throws UnknownHostException {
//        InetAddress localHost = InetAddress.getLocalHost();
//        InetAddress byName = InetAddress.getByName("www.sina.com.cn");
//        System.out.println(localHost);
//        System.out.println(byName);
        System.out.println(
        );
    }
}



