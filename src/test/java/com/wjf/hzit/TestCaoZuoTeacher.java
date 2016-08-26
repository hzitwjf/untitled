package com.wjf.hzit;

import com.hzit.dao.CaoZuoTeacher;
import com.hzit.dao.impl.CaoZuoTeacherImpl;
import com.hzit.entity.Tblteacher;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TestCaoZuoTeacher {
    CaoZuoTeacher c=new CaoZuoTeacherImpl();
    Tblteacher tt=new Tblteacher();
    @Test
    public void zeng(){
        tt.setTeaId("018");
        tt.setTeaName("消炎");
        int result=c.insertInto(tt);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void shan(){
        int result=c.delete("018");
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void gai(){
        tt.setTeaId("018");
        tt.setTeaName("萧炎");
        int result=c.update(tt);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void cha(){
       List<Tblteacher> list= c.FindAll();
        System.out.println(list.size());
        for (Tblteacher teacher : list){
            System.out.print("教师ID：" + teacher.getTeaId() + "\t");
            System.out.println("教师名字："+teacher.getTeaName());
        }
    }
    @Test
    public void chaId(){
       tt= c.FindId("001");
        System.out.print("教师ID：" + tt.getTeaId() + "\t");
        System.out.println("教师名字："+tt.getTeaName());
    }
}
