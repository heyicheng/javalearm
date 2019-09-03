package com.yunxi.a_thread;

import org.junit.Test;

//自定义线程类,继承方式
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread中的线程");
        }
    }
}

//接口方式,此种方式创建线程最好，
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Runnable中的线程");
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            System.out.println("main中的线程");
        }
        MyThread myThread = new MyThread();
        myThread.start();
        //
        Thread thread = new Thread(new MyThread2());
        thread.start();


    }
    @Test
    public void demo(){

    }

}
