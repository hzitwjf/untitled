package com.shiping;

import java.io.*;

/**
 * Created by Administrator on 2016/8/10.
 */
public class FuZhi extends Thread{
    private double leijia;
    public static double jindu;
    private String yuan;
    private String biao;
    public FuZhi(String yuan,String biao){
        this.yuan=yuan;
        this.biao=biao;
    }

    public void run(){
        //源文件
        File data=new File(yuan);
        //目标文件
        File target=new File(biao);
        //创建字符输出和输入流
        try {
            InputStream inputStream=new FileInputStream(data);
            OutputStream outputStream=new FileOutputStream(target);
            byte [] bytes=new byte[1024];
            int length=0;
            int sum=inputStream.available();
            while ((length=inputStream.read(bytes)) != -1){
                leijia=leijia+length;
                jindu=leijia/sum;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
