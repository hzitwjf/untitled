package com.hzit.dao;

import com.hzit.entity.Tblstudent;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface CaoZuoStudent {
    /**
     * 查询所有学生
     * @return 装有所有学生信息的集合
     */
    public List<Tblstudent> FindAll();

    /**
     * 通过ID查询指定学生的信息
     * @param stuId 传入Id
     * @return 返回学生信息
     */
    public Tblstudent FindId(Serializable stuId);

    /**
     * 修改学生信息
     * @param ts 传入对象
     * @return 是否修改成功
     */
    public int update(Tblstudent ts);

    /**
     * 删除学生信息
     * @param stuId 传入id
     * @return 是否删除成功
     */
    public int delete(Serializable stuId);

    /**
     * 增加学生信息
     * @param ts 传入一个学生
     * @return  是否增加成功
     */
    public  int insertInto(Tblstudent ts);

    /**
     * 检查数据库是否有此学生
     * @param tblstudent  传入学生名字和ID
     * @return  返回此学生整个信息
     */
    Tblstudent check(Tblstudent tblstudent);
}
