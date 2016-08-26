package com.lianxi;

/**
 * Created by Administrator on 2016/8/9.
 */
public class LianXi1 extends Thread{
    private String msg;
    public LianXi1(String name,String msg){
        super(name);
        this.msg=msg;
    }
    public void run(){
        while (true) {
            System.out.println(getName()+":"+msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
