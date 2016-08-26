package com.jisuan;

/**
 * Created by Administrator on 2016/8/10.
 */
public class RunTongJi {
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new TongJi(1,100);
        Thread t2=new TongJi(101,200);
        Thread t3=new TongJi(201,300);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println(Thread.currentThread().getName()+"线程输出了："+TongJi.sum);
    }
}
