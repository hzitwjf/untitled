package com.lianxi;

/**
 * Created by Administrator on 2016/8/10.
 */
public class JiSuan2 implements Runnable {
    public static int two=0;

    @Override
    public void run() {
        for (int j = 101; j <=200 ; j++) {
            two+=j;
        }
        System.out.println(Thread.currentThread().getName()+"输出101到200的和为："+two);
    }
}
