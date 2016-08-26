package com.lianxi;

/**
 * Created by Administrator on 2016/8/9.
 *
 */
public class RunLianXi2 {
    public static void main(String[] args)  {
        getApple l=new getApple();
        Thread t1=new Thread(l,"汤姆");
        Thread t2=new Thread(l,"鲍勃");
        t1.start();
        t2.start();
    }

}
