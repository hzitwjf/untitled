package com.jisuan;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Created by Administrator on 2016/8/10.
 * 双线程显示
 */
public class RunFuzhi {
    public static void main(String[] args) throws InterruptedException {
        //创建文件选择框对象
        JFileChooser f=new JFileChooser();
        //显示文件选择框
        f.showOpenDialog(null);
        //获取用户选择的文件的路径
        String p1=f.getSelectedFile().getPath();

        f.showSaveDialog(null);
        String p2=f.getSelectedFile().getPath();

        Thread t=new FuZhiShiPing(p1,p2);
        t.start();
        DecimalFormat fot=new DecimalFormat("#00.00");

        while(FuZhiShiPing.baifenlv<1){
            Thread.sleep(500);
            System.out.println("已复制了"+fot.format(FuZhiShiPing.baifenlv*100)+"%");
        }
        System.out.println("复制完毕");
    }
}
