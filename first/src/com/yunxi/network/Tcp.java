package com.yunxi.network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Tcp {
    public static void main(String[] args) throws IOException {
        // 客户端创建socket服务
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //获取输出流对象
        OutputStream outputStream = socket.getOutputStream();
    }
}
