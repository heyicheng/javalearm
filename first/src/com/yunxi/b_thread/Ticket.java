package com.yunxi.b_thread;
import org.junit.Test;


class SaleTicket implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
//            synchronized ("suo"){
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出了滴" + ticket + "张电影票");
                    ticket--;
                } else {
                    System.out.println("售罄");
                    break;
                }
//            }

        }
    }
}

public class Ticket {
    @Test
    public void ahsdj() {
//        System.out.println("fjsidjfi");
//        Thread taopiaopiao = new Thread(new SaleTicket(), "taopiaopiao");
//        Thread maoyan = new Thread(new SaleTicket(), "maoyan");
//        Thread meituan = new Thread(new SaleTicket(), "meituan");
//        taop iaopiao.start();
//        maoyan.start();
//        meituan.start();
    }

    public static void main(String[] args) {
        //System.out.println("fjsidjfi");
        Thread taopiaopiao = new Thread(new SaleTicket(), "taopiaopiao");
        Thread maoyan = new Thread(new SaleTicket(), "maoyan");
        Thread meituan = new Thread(new SaleTicket(), "meituan");
        maoyan.start();
        meituan.start();
        taopiaopiao.start();

    }
}


