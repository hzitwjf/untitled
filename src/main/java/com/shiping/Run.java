package com.shiping;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2016/8/10.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new FuZhi("","");
        thread.start();
        DecimalFormat fot=new DecimalFormat("#00.00");

        while(FuZhi.jindu<1){
            Thread.sleep(500);
            System.out.println("已复制了"+fot.format(FuZhi.jindu*100)+"%");
        }
        System.out.println("复制完毕");
    }
}
