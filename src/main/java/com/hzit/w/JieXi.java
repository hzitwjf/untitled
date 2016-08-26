package com.hzit.w;
/**
 * Created by Administrator on 2016/8/6.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import  javax.xml.parsers.DocumentBuilderFactory;


public class JieXi {
    public static void main(String[] args) throws  Exception{
        //创建解析工厂
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        //利用工厂解析一个对象
        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        //利用解析器解析一个具体的xml文件，产生一个Document对象
        Document document=documentBuilder.parse("D:\\untitled\\src\\main\\java\\com\\hzit\\w\\scores.xml");
        Element root=document.getDocumentElement();
        System.out.println(root.getNodeName());

        //获取文档中所有的stu标签
        NodeList list=document.getElementsByTagName("stu");
        for (int i = 0; i <list.getLength() ; i++) {
            //获取元素中第i个节点
            Element item=(Element)list.item(i);
            //获取第i个stu标签下面的第一个属性名叫ID的属性
            String shu=item.getAttribute("id");
            System.out.println("ID："+shu);
            //获取第i个stu标签下面的第一个标签名叫name的节点
            Node name=item.getElementsByTagName("name").item(0);
            System.out.println("名字是："+name.getTextContent());
            //获取第i个stu标签下面的第一个标签名叫course的节点
            Node course=item.getElementsByTagName("course").item(0);
            System.out.println("科目是："+course.getTextContent());
            //获取第i个stu标签下面的第一个标签名叫score的节点
            Node score=item.getElementsByTagName("score").item(0);
            System.out.println("分数是："+score.getTextContent());

            System.out.println("************************");
        }
    }


}
