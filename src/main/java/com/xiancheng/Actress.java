package com.xiancheng;

/**
 * Created by Administrator on 2016/8/8.
 * 创建演员
 */
public class Actress implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"是一个演员");
        int count=0;
        boolean keepRunning=true;
        while(keepRunning){
            System.out.println(Thread.currentThread().getName()+"登场演出了"+(++count)+"次");
            if (count==100){
                keepRunning=false;
            }
            if (count%10==0) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("出现异常，程序退出");
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+"的演出结束结束了");
    }
}
