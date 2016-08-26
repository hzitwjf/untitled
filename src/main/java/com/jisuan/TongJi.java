package com.jisuan;

/**
 * Created by Administrator on 2016/8/10.
 */
public class TongJi extends Thread {
    private int min;
    private int max;
    public static int sum=0;

    public  TongJi(int min,int max){
        this.min=min;
        this.max=max;
    }
    public void run(){
        for (int i = min; i <=max ; i++) {
            sum+=i;
        }
        System.out.println(getName()+"输出的和为："+sum);
    }
}
