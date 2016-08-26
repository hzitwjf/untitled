package com.wjf.hzit;

import com.hzit.dao.CaoZuoScore;
import com.hzit.dao.impl.CaoZuoScoreImpl;
import com.hzit.entity.Tblscore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class TestCaoZuoScores {
    CaoZuoScore c = new CaoZuoScoreImpl();
    Tblscore ts = new Tblscore();

    @Test
    public void cha() {
        List<Tblscore> scores = new ArrayList<Tblscore>();
        scores = c.FindAll();
        System.out.println(scores.size());
        for (Tblscore tblscore : scores) {
            System.out.print("学生ID：" + tblscore.getStuId() + "\t");
            System.out.print("课程ID：" + tblscore.getCourseId() + "\t");
            System.out.println("分数：" + tblscore.getScore());
        }
    }

    @Test
    public void chaId() {
        ts = c.FindId("1");
            System.out.print("学生ID：" + ts.getStuId() + "\t");
            System.out.print("课程ID：" + ts.getCourseId() + "\t");
            System.out.print("分数：" + ts.getScore() + "\t");
        System.out.println("考试ID：" + ts.getTestId());
    }
    @Test
    public void zeng(){
        ts.setStuId("1015");
        ts.setCourseId("015");
        ts.setScore(99.8f);
        int result=c.insertInto(ts);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void gai(){
        ts.setStuId("1016");
        ts.setCourseId("016");
        ts.setScore(69.0f);
        ts.setTestId(58);
        int result=c.update(ts);
        System.out.println("共影响了"+result+"行");
    }
    @Test
    public void shan(){
        int result=c.delete(57);
        System.out.println("共影响了"+result+"行");
    }
}