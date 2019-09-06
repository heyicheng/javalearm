package com.yunxi.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //创建udp服务socket
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] buf=new byte[1024*64];
        //创建一个数据包
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(buf,0,datagramPacket.getLength()));
        datagramSocket.close();
    }

}
