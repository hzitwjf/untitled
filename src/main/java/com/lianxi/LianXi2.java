package com.lianxi;

/**
 * Created by Administrator on 2016/8/9.
 *
 */
public class  LianXi2 implements Runnable {
    private Integer count=100;
    @Override
    public void run() {

        if (count<=0){
            System.out.println(Thread.currentThread().getName()+"拿完了");
        }

        while (count>0) {
            /*synchronized (this) {
                    count--;
            System.out.println(Thread.currentThread().getName() + "拿苹果，还剩" + count);
            }*/
        }
    }


}
