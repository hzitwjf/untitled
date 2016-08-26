package com.wjf.hzit;



import com.hzit.dao.CaoZuoStudent;

import com.hzit.dao.impl.CaoZuoStudentImpl;
import com.hzit.entity.Tblstudent;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/23.
 */
public class TestCaozuoStudent {
    CaoZuoStudent c=new CaoZuoStudentImpl();
    Tblstudent ts=new Tblstudent();
    Scanner input =new Scanner(System.in);

    //查询所有学生
    @Test
    public void chaSuoyou() {
     List<Tblstudent> student= c.FindAll();
        System.out.println(student.size());
        for (Tblstudent tblstudent : student){
            System.out.print("ID是："+tblstudent.getStuId()+"\t");
            System.out.print("名字是："+tblstudent.getStuName() +"\t");
            System.out.print("年龄："+tblstudent.getStuAge()+"\t");
            System.out.println("性别是："+tblstudent.getStuSex());
        }
    }

        //增加学生
        @Test
        public void zeng() {
        ts.setStuName("西毒");
        ts.setStuId("1024");
        ts.setStuAge(20);
        ts.setStuSex("男");
        int result=c.insertInto(ts);
            System.out.println("影响了" + result + "行");
    }

    //改变学生信息
    @Test
    public void gai() {
        ts.setStuName("东邪");
        ts.setStuId("1024");
        ts.setStuAge(20);
        ts.setStuSex("男");
        int result= c.update(ts);
        System.out.println("影响了" + result + "行");
    }

    //删除学生信息
    @Test
    public void shan() {
        int jieguo = c.delete("1024");
        System.out.println("影响了" + jieguo + "行");
    }

    //根据ID来查找学生
    @Test
    public  void chaId(){
         ts=  c.FindId("1024");
         System.out.print("ID是："+ts.getStuId()+"\t");
         System.out.print("名字是："+ts.getStuName() +"\t");
         System.out.print("年龄："+ts.getStuAge()+"\t");
         System.out.println("性别是："+ts.getStuSex());
    }
    @Test
public void check(){
        ts.setStuName("东邪");
        ts.setStuId("1024");
        ts=c.check(ts);
        System.out.print("ID是："+ts.getStuId()+"\t");
        System.out.print("名字是："+ts.getStuName() +"\t");
        System.out.print("年龄："+ts.getStuAge()+"\t");
        System.out.println("性别是："+ts.getStuSex());
    }
}
