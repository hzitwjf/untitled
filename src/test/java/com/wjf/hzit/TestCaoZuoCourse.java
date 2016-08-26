package com.wjf.hzit;

import com.hzit.dao.CaoZuoCourse;
import com.hzit.dao.impl.CaoZuoCourseImpl;
import com.hzit.entity.Tblcourse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class TestCaoZuoCourse {
    CaoZuoCourse c=new CaoZuoCourseImpl();
    Tblcourse tc=new Tblcourse();
    @Test
    public void zeng(){
            tc.setCourseId("018");
            tc.setCourseName("软件测试");
            tc.setTeaId("010");
       int result= c.insertInto(tc);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void shan(){
       int result=c.delete("018");
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void gai(){
        tc.setCourseId("018");
        tc.setCourseName("软件开发");
        tc.setTeaId("010");
      int result=c.update(tc);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void cha(){
        List<Tblcourse> course=new ArrayList<Tblcourse>();
        course=c.FindAll();
        System.out.println(course.size());
        for (Tblcourse tblcourse : course){
            System.out.print("课程ID："+tblcourse.getCourseId()+"\t");
            System.out.print("课程名字："+tblcourse.getCourseName()+"\t");
            System.out.println("教师ID："+tblcourse.getTeaId());
        }
    }
    @Test
    public void chaId(){
       tc= c.FindId("001");
        System.out.print("课程ID："+tc.getCourseId()+"\t");
        System.out.print("课程名字："+tc.getCourseName()+"\t");
        System.out.println("教师ID："+tc.getTeaId());
    }

}
