package com.hzit.w;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.util.*;

/**
 * Created by Administrator on 2016/8/6.
 */

public class FangFa {
    private Document document;
    private Scanner input=new Scanner(System.in);
    public FangFa(){
        //创建解析工厂
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        try {
            //利用解析工厂解析一个对象
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            //利用解析器解析一个具体的xml文件，产生一个Document对象
            document=documentBuilder.parse("D:\\untitled\\src\\main\\java\\com\\hzit\\w\\scores.xml");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出现异常，正在退出程序");
        }
    }
    //查询所有考生
    public void cha(){
        System.out.println("**********************************************");
        System.out.println("考生编号\t学生姓名\t考试科目\t考试分数");
        //获取文档中所有的stu标签
        NodeList list=document.getElementsByTagName("stu");
        for (int i = 0; i <list.getLength() ; i++) {
            //获取元素中第i个节点
            Element student=(Element)list.item(i);
            //获取第i个stu标签下面的第一个属性名叫ID的属性
            String id=student.getAttribute("id");
            //获取第i个标签下各个节点的值文本内容
            String name=student.getElementsByTagName("name").item(0).getTextContent();
            String course=student.getElementsByTagName("course").item(0).getTextContent();
            String score=student.getElementsByTagName("score").item(0).getTextContent();
            System.out.println("\t"+id+"\t\t"+name+"\t\t"+course+" \t\t "+score);
        }
        System.out.println("**********************************************");
    }
    //删除所选考生
        public void shan(){
            System.out.println("请输入你想要删除的考生编号");
            String id=input.nextLine();
            NodeList list=document.getElementsByTagName("stu");
            for (int i = 0; i <list.getLength() ; i++) {
                Element student=(Element)list.item(i);
                String num=student.getAttribute("id");
                if (num.equals(id)){
                    document.getDocumentElement().removeChild(student);
                    System.out.println("删除成功");
                    baocun();
                    return;
                }
            }
            System.out.println("没找到该考号对应的信息");
        }
    //修改考生
    public void gai(){
        System.out.println("请输入你想要修改的考生编号");
        String id=input.nextLine();
        NodeList list=document.getElementsByTagName("stu");
        for (int i = 0; i <list.getLength() ; i++) {
            Element student=(Element)list.item(0);
            String num=student.getAttribute("id");
            if(num.equals(id)) {
                System.out.println("请输入你想要修改的分数");
                String newscore=input.nextLine();
                student.getElementsByTagName("score").item(0).setTextContent(newscore);
                System.out.println("修改成功");
                baocun();
                return;
            }
        }
        System.out.println("修改失败，没有找到该考号对应的学生信息");
    }
    //增加考生信息
    public void zeng(){

        //System.out.println("请输入考生编号");
        String id= bianhao();
        System.out.println("请输入考生姓名");
        String name=input.nextLine();
        System.out.println("请输入考试科目");
        String course=input.nextLine();
        System.out.println("请输入考试分数");
        String score=input.nextLine();

        //通过xml文档创建节点
        Element elementstu=document.createElement("stu");
        //Element elementid=document.createElement("id");
        //elementid.setTextContent(id);
        Element elementname=document.createElement("name");
        elementname.setTextContent(name);
        Element elementcourse=document.createElement("course");
        elementcourse.setTextContent(course);
        Element elementscore=document.createElement("score");
        elementscore.setTextContent(score);

        //elementstu.appendChild(elementid);
        elementstu.appendChild(elementname);
        elementstu.appendChild(elementcourse);
        elementstu.appendChild(elementscore);

        elementstu.setAttribute("id",id);

        document.getDocumentElement().appendChild(elementstu);
        System.out.println("新增成功");
        baocun();
    }

    /**
     * 编写一个方法自动生成考生编号
     * @return 考生编号
     */
    private String bianhao(){
        List<Integer> numlist=new ArrayList<Integer>();
        NodeList list=document.getElementsByTagName("stu");
        for (int i = 0; i <list.getLength(); i++) {
            Element student=(Element)list.item(i);
            String stuno=student.getAttribute("id");//获取xml文件里面带有s的数字
            String num=stuno.substring(1);
            numlist.add(Integer.parseInt(num));
        }
        //获取最大数
        Integer max=0;
        if (numlist.size()==0){
            max=0;
        }else {
            max = Collections.max(numlist);
        }
        return "s"+(max+1);
    }
    private void baocun(){
        //创建转换工厂
        TransformerFactory f=TransformerFactory.newInstance();
        try {
        //通过转换工厂获取转换器对象
            Transformer t=f.newTransformer();
        //文件输出流
            FileOutputStream out = new FileOutputStream("D:\\untitled\\src\\main\\java\\com\\hzit\\w\\scores.xml");
            DOMSource xmlSource=new DOMSource(document);
            StreamResult outputTarget=new StreamResult(out);
            t.transform(xmlSource,outputTarget);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
