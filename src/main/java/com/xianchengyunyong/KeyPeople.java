package com.xianchengyunyong;

/**
 * Created by Administrator on 2016/8/9.
 */
public class KeyPeople extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始战斗");
        for (int i = 1; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"左突又杀，攻击隋军....");
        }
        System.out.println(Thread.currentThread().getName()+"结束战斗");
    }
}
