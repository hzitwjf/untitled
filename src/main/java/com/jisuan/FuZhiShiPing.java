package com.jisuan;

import java.io.*;

/**
 * Created by Administrator on 2016/8/10.
 *
 */
public class FuZhiShiPing extends Thread{
            private  double  bt;// 记录每次读取的字节数
            public static double  baifenlv;  //用来记录读取的百分比

    private String datasource;
    private String target;

    public FuZhiShiPing(String datasource,String target){
        this.datasource=datasource;
        this.target=target;
    }

    public  void run(){
            //源文件
            File yuan=new  File(datasource);
		/*目标文件*/
            File biao = new File(target);
            /*//源文件
            File yuan=new  File("F:\\上课录制视频\\7.1利用反射创建对象并加载配置文件中的数据1.ASF");
		*//*目标文件*//*
            File biao = new File("D:/复制视频/7.1利用反射创建对象并加载配置文件中的数据1.ASF");*/
            /**
             * 把源文件输入到内存中
             * 内存主要是用来临时存贮数据
             * 比如电脑中调用的数据,就需要从硬盘读出,发给内存,然后内存再发给CPU
             */
            try {
            InputStream inputStream=new FileInputStream(yuan);
		/*把内存当中的文件输出到硬盘中的目标文件夹中*/
            OutputStream outputStream=new FileOutputStream(biao);
            byte [] buffer =new byte[1024];
            int length=0;
                int sum=inputStream.available();
               //long start=System.currentTimeMillis();
            while ((length=inputStream.read(buffer)) !=-1) {
                bt=bt+length;  //累加了每一次读取的字节数
                baifenlv=bt/sum;
                outputStream.write(buffer, 0, length);
            }
               // long end=System.currentTimeMillis();
                //this.one=(int)(end-start)/1000;
               // System.out.println(one);
            outputStream.close();
            inputStream.close();
        }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("出现异常，程序退出");
            }
        }
}
