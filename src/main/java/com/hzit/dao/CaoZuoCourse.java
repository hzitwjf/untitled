package com.hzit.dao;

import com.hzit.entity.Tblcourse;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public interface CaoZuoCourse {
    /**
     *增加课程信息
     * @param tc  传入一个课程信息
     * @return  返回是否增加成功和影响的行数
     */
    int insertInto(Tblcourse tc);

    /**
     * 删除课程信息
     * @param courseId 传入一个课程ID
     * @return  返回是否删除成功和影响的行数
     */
    int delete(Serializable courseId);

    /**
     * 修改课程信息
     * @param tc 传入一个课程对象
     * @return 返回是否修改成功和影响的行数
     */
     int update(Tblcourse tc);

    /**
     * 查询所有课程信息
     * @return  返回一个装有所有课程的集合
     */
    List<Tblcourse> FindAll();

    /**
     * 通过Id查询指定的课程信息
     * @param courseId 传入一个课程Id
     * @return  返回指定课程Id的对象
     */
    Tblcourse FindId(Serializable courseId);
}
