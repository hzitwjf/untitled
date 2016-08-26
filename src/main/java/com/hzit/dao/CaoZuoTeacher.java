package com.hzit.dao;

import com.hzit.entity.Tblteacher;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface CaoZuoTeacher {
    /**
     * 查询所有学生
     * @return 装有所有学生信息的集合
     */
    public List<Tblteacher> FindAll();

    /**
     * 通过ID查询指定学生的信息
     * @param teaId 传入Id
     * @return 返回学生信息
     */
    public Tblteacher FindId(Serializable teaId);

    /**
     * 修改学生信息
     * @param tt 传入对象
     * @return 是否修改成功
     */
    public int update(Tblteacher tt);

    /**
     * 删除学生信息
     * @param teaId 传入id
     * @return 是否删除成功
     */
    public int delete(Serializable teaId);

    /**
     * 增加学生信息
     * @param tt 传入一个学生
     * @return  是否增加成功
     */
    public  int insertInto(Tblteacher tt);
}
