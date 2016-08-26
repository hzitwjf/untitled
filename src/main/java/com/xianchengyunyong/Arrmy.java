package com.xianchengyunyong;

/**
 * Created by Administrator on 2016/8/8.
 * 军队线程
 * 模拟双方作战的行为！
 */
public class Arrmy implements Runnable{
    //volatile java关键字，保证了线程可以正确的读取其他线程写入的值
    //可见性
   volatile boolean keepRunning=true;
    @Override
    public void run() {
    while (keepRunning){
        for (int i = 1; i <=5 ; i++) {
            //连续进攻对方5次
            System.out.println(Thread.currentThread().getName()+"进攻了对方【"+i+"】次");
            //结束当前运行线程释放处理器资源
            Thread.yield();
            //下次轮到谁进攻了？
        }
    }
        System.out.println(Thread.currentThread().getName()+"结束战斗");
    }
}
