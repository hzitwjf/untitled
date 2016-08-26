package com.dom4J.yunxing;

/**
 * Created by Administrator on 2016/8/9.
 * 实现dom4j接口
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jShiXian implements Dom4jFace {
    private Document document;
    private final String URL="D:/eclipse_project/weui/src/com/xml/scores.xml";
    private Scanner input=new Scanner(System.in);

    public Dom4jShiXian() {
        SAXReader sr=new SAXReader();
        try {
            document=sr.read(URL);
        } catch (DocumentException e) {
            System.out.println("没有找到对象");
            e.printStackTrace();
        }
    }

    @Override
    public void cha() {
        System.err.println("*****************查询所有考生信息*****************");
        //获取文档的根节点
        Element e=document.getRootElement();
        //获取根节点下所有stu的标签
        List<Element> list=e.elements();
        System.out.println("考号\t考生姓名\t考试科目\t考试成绩");
        for(Element el : list){
            String name=el.elementText("name");//获取stu标签下一个叫name的子标签
            String course=el.elementText("course");//获取stu标签下一个叫course的子标签
            String score=el.elementText("score");//获取stu标签下一个叫score的子标签
            //获取stu这个标签的属性
            String id=el.attributeValue("id");
            System.out.println(id+"\t"+name+"\t\t"+course+"\t\t"+score);
        }
    }

    @Override
    public void gai() {
        System.err.println("*****************修改信息*****************");
        System.out.println("请输入要修改的考号");
        String stuno=input.nextLine();
        System.out.println("请输入新的考试分数");
        String num=input.nextLine();
        List<Element> list=document.getRootElement().elements("stu");//获取根节点下stu的标签
        for(Element el : list){
            String id=el.attributeValue("id");//获取stu这个标签的属性
            if(id.equals(stuno)){
                el.element("score").setText(num);
                System.out.println("修改成功");
                save();
                return;
            }
        }
        System.out.println("没有找到该考生的信息");
    }

    @Override
    public void shan() {
        System.err.println("*****************删除考生信息*****************");
        System.out.println("请输入要删除的考号");
        String stuno=input.nextLine();
        List<Element> list=document.getRootElement().elements("stu");//获取根节点下stu的标签
        for(Element el : list){
            //获取所有的stu标签下的属性
            String id=el.attributeValue("id");
            if(id.equals(stuno)){
                document.getRootElement().remove(el);
                System.out.println("删除成功");
                save();
                return;
            }
        }
        System.out.println("没有找到该考生的信息");
    }

    @Override
    public void zeng() {
        System.err.println("*****************新增考生信息*****************");
        System.out.println("请输入考生编号");
        String id= input.nextLine();
        System.out.println("请输入考生姓名");
        String name=input.nextLine();
        System.out.println("请输入考试科目");
        String course=input.nextLine();
        System.out.println("请输入考试分数");
        String score=input.nextLine();
        //在根节点下新增stu节点
        Element student=document.getRootElement().addElement("stu");
        //在新增的stu节点下添加属性
        student.addAttribute("id", id);
        //在新增的stu节点下新增name这个子节点
        student.addElement("name").setText(name);
        //在新增的stu节点下新增course这个子节点
        student.addElement("course").setText(course);
        //在新增的stu节点下新增score这个子节点
        student.addElement("score").setText(score);
        System.out.println("新增考生信息成功");
        save();
    }
    private void save(){
        OutputFormat format=OutputFormat.createPrettyPrint();
        try {
            XMLWriter writer=new XMLWriter(new FileWriter(URL),format);
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            System.err.println("没有找到文件地址，请确认地址是否有误");
            e.printStackTrace();
        }

    }
}
