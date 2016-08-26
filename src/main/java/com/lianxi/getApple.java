package com.lianxi;

/**
 * Created by Administrator on 2016/8/10.
 *
 */
public class getApple implements Runnable{

        private Integer count=100;
        @Override
        public void run() {

            /*if (count<=0){
                System.out.println(Thread.currentThread().getName()+"拿完了");
            }*/

            while (count>0) {
            lock();
            }
        }
        private synchronized void lock() {
            count--;
            if (count >= 0) {
                System.out.println(Thread.currentThread().getName() + "拿苹果，还剩" + count);
            }else{
                System.out.println(Thread.currentThread().getName()+"没有苹果了");
        }
            Thread.yield();
    }

}
