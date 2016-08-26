package com.xianchengyunyong;

/**
 * Created by Administrator on 2016/8/8.
 * 隋唐演义的舞台演出
 */
public class Stage extends Thread{
    public void run(){
        System.out.println("欢迎观看隋唐演义大戏");
        //让观众安静片刻
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("大幕徐徐拉开");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("话说隋朝末年，隋军于农民起义军杀得天混地暗，乱世之年，百姓又该何去何从");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Arrmy suiTang=new Arrmy();
        Arrmy nongMin=new Arrmy();
        //使用Runnable接口创建线程
        Thread arrmySuiTang=new Thread(suiTang,"隋唐军队");
        Thread arrmyNongMin=new Thread(nongMin,"农民起义军");
        //启动线程让军队开始作战
        arrmySuiTang.start();
        arrmyNongMin.start();
        //舞台线程休眠100毫秒，大家专心观看厮杀
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("|舞台正在重修，请耐心等待");
            e.printStackTrace();
        }
        System.out.println("双方激战正酣，半路杀出个程咬金");
        Thread cheng=new KeyPeople();
        cheng.setName("程咬金");
        System.out.println("程咬金的理想就是结束战争，是百姓安居乐业");
        //收兵
        //停止线程
       suiTang.keepRunning=false;
        nongMin.keepRunning=false;
     /*    try {
            arrmyNongMin.join();
        } catch (InterruptedException e) {
            System.out.println("江东弟子今犹在，肯为君王卷土来");
            e.printStackTrace();
        }*/
        //主线程休眠2秒
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //历史舞台留给程咬金
        cheng.start();
        try {
            cheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("战争结束，百姓安居乐业，程咬金实现了他的人生理想");
        System.out.println("演出完毕，谢谢观看隋唐演义大戏");
    }
    public static void main(String[] args) {

        new Stage().start();
    }
}
