package com.dom4J.yunxing;

/**
 * Created by Administrator on 2016/8/9.
 * 测试实现方法
 */
public class Test {
    public static void main(String[] args) {
        Dom4jShiXian sx=new Dom4jShiXian();
        //查询所有考生的信息
        sx.cha();
        //修改考生的成绩
			 /*sx.gai();
			 sx.cha();*/
        //删除考生的信息
			 /*sx.shan();
			 sx.cha();*/
        //增加考生的信息
			 sx.zeng();
			 sx.cha();
    }
}
