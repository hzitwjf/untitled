package com.xiancheng;

/**
 * Created by Administrator on 2016/8/8.
 * 演员轮流演出
 */
public class RunActor {
    public static void main(String[] args) {
        Thread actor=new Actor();
        actor.setName("Mr.Thread");
        actor.start();
        Thread actressThread=new Thread(new Actress(),"Ms.Runnable");
        actressThread.start();
    }
}
