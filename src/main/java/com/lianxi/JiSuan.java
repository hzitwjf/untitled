package com.lianxi;

/**
 * Created by Administrator on 2016/8/10.
 */
public class JiSuan implements Runnable{
    public static int one;

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            one+=i;
        }
        System.out.println(Thread.currentThread().getName()+"输出1到100的和为："+one);
    }
}
