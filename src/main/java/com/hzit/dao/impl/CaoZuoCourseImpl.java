package com.hzit.dao.impl;

import com.hzit.dao.CaoZuoCourse;
import com.hzit.dao.GetConnect;
import com.hzit.entity.Tblcourse;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class CaoZuoCourseImpl extends GetConnect implements CaoZuoCourse{
    @Override
    public int insertInto(Tblcourse tc) {
        open();
        String sql="INSERT INTO tblcourse(CourseId,CourseName,TeaId) VALUES(?,?,?);";
        try {
         int result=qr.update(connection, sql, tc.getCourseId(), tc.getCourseName(), tc.getTeaId());
            return result;
        }catch (Exception ex){
            ex.printStackTrace();
            return -1;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int delete(Serializable courseId) {
        open();
        String sql="DELETE FROM tblcourse WHERE CourseId=?";
        try {
           int result= qr.update(connection,sql,courseId);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int update(Tblcourse tc) {
        open();
        String sql="UPDATE tblcourse SET CourseId=?,CourseName=?,TeaId=? WHERE CourseId=?";
        try {
            int result=qr.update(connection,sql,tc.getCourseId(),tc.getCourseName(),tc.getTeaId(),tc.getCourseId());
           return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public List<Tblcourse> FindAll() {
        open();
        String sql="SELECT * FROM tblcourse";
        try {
            List<Tblcourse> tblcourses=qr.query(connection, sql, new BeanListHandler<Tblcourse>(Tblcourse.class));
       return tblcourses;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Tblcourse FindId(Serializable courseId) {
        open();
        String sql="SELECT * FROM tblcourse WHERE CourseId=?";
        try {
            Tblcourse tblcourse=   qr.query(connection, sql, new BeanHandler<Tblcourse>(Tblcourse.class),courseId);
            return tblcourse;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
