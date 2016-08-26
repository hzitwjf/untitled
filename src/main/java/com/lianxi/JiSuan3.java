package com.lianxi;

/**
 * Created by Administrator on 2016/8/10.
 */
public class JiSuan3 implements Runnable {
    public static int three;

    @Override
    public void run() {

        for (int k = 201; k <=300 ; k++) {
            three+=k;
        }
        System.out.println(Thread.currentThread().getName()+"输出201到300的和为："+three);
    }
}
