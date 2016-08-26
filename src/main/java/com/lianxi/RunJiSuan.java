package com.lianxi;

/**
 * Created by Administrator on 2016/8/10.
 */
public class RunJiSuan {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName()+"线程启动了");
        Thread t1=new Thread(new JiSuan(),"线程1");
        Thread t2=new Thread(new JiSuan2(),"线程2");
        Thread t3=new Thread(new JiSuan3(),"线程3");

        t1.start();
        t2.start();
        t3.start();
        //调用join方法，让main方法陷入阻塞状态
        t1.join();
        t2.join();
        t3.join();
        int sum=JiSuan.one+JiSuan2.two+JiSuan3.three;
        System.out.println(Thread.currentThread().getName()+"线程输出了总和："+sum);
    }

}
