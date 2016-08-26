package com.hzit.day2;


import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/8/7.
 * 将java文件中的数据用xml的样式打印输出在控制台上
 */
public class Test {
    public static void main(String[] args) {
        WeUiTxt wt=new WeUiTxt();
        wt.setToUserName("嘉文");
        wt.setFromUserName("盖伦");
        wt.setCreateTime("16:53 2016/8/7");
        wt.setMsgType("text");
        wt.setContent("打野速来支援");
        wt.setMsgId("LOL上路Gank");
        try {
            printObjectToWeUiTxt(wt);
            /*printObject(wt);*/
        } catch (IllegalAccessException e) {
            System.out.println("没有获取到对象");
            e.printStackTrace();
        }
    }
/*    public static void printObject(WeUiTxt wt){
        System.out.println(wt.getToUserName()+"\t"+wt.getFromUserName()+"\t"+wt.getCreateTime()+
                "\t"+wt.getMsgType()+"\t"+wt.getContent()+"\t"+wt.getMsgId());
    }*/
    public static void printObjectToWeUiTxt(WeUiTxt wt) throws IllegalAccessException {
        //通过传进来的xml对象获取该对象所属的Class类
        Class c=wt.getClass();
        Field [] f=c.getDeclaredFields();
        System.out.println("<xml>");
        for (Field field : f) {
            Xmlnode x=field.getAnnotation(Xmlnode.class);
            field.setAccessible(true);
            System.out.print("<" + x.shuxing() + ">");
            System.out.print(field.get(wt));
            System.out.println("</"+x.shuxing()+">");
        }
        System.out.println("</xml>");
    }
}

