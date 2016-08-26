package com.hzit.dao;

import com.hzit.entity.Tblscore;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface CaoZuoScore {
    /**
     * 查询所有学生的分数
     * @return 返回装有所有学生分数的集合
     */
      List<Tblscore> FindAll();

    /**
     * 通过ID查询指定Id的学生分数
     * @param stuId  传入一个学生ID
     * @return  返回指定ID的学生分数
     */
    Tblscore FindId(Serializable stuId);

    /**
     * 增加学生的分数
     * @param ts 传入一个学生的信息
     * @return  返回是否增加成功和影响的行数
     */
    int insertInto(Tblscore ts);

    /**
     * 修改学生的分数
     * @param ts  传入一个学生信息
     * @return  返回是否修改成功和影响的行数
     */
    int update(Tblscore ts);

    /**
     * 删除学生信息
     * @param testId  传入学生的ID
     * @return  返回是否删除成功和影响的行数
     */
    int delete(Serializable testId);

}
