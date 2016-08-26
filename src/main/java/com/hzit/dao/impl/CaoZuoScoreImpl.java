package com.hzit.dao.impl;

import com.hzit.dao.CaoZuoScore;
import com.hzit.dao.GetConnect;
import com.hzit.entity.Tblscore;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class CaoZuoScoreImpl extends GetConnect implements CaoZuoScore {
    @Override
    public List<Tblscore> FindAll() {
        open();
        String sql="SELECT * FROM tblscore";
        try {
        List<Tblscore> tblscores=qr.query(connection, sql, new BeanListHandler<Tblscore>(Tblscore.class));
            return tblscores;
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
    public  Tblscore FindId(Serializable stuId) {
        open();
        String sql="SELECT * FROM tblscore WHERE testId=?";
        try {
            Tblscore tblscore= qr.query(connection, sql, new BeanHandler<Tblscore>(Tblscore.class), stuId);
        return tblscore;
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
    public int insertInto(Tblscore ts) {
        open();
        String sql="INSERT INTO tblscore(StuId,CourseId,Score) VALUES(?,?,?)";
        try {
          int result=qr.update(connection,sql,ts.getStuId(),ts.getCourseId(),ts.getScore());
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return  -1;
        }finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int update(Tblscore ts) {
        open();
        String sql="UPDATE tblscore SET StuId=?,CourseId=?,Score=?,TestId=? WHERE TestId=?";
        try {
            int result=qr.update(connection,sql,ts.getStuId(),ts.getCourseId(),ts.getScore(),ts.getTestId(),ts.getTestId());
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
    public int delete(Serializable testId) {
        open();
        String sql="DELETE FROM tblscore WHERE TestId=?";
        try {
            int result=qr.update(connection,sql,testId);
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
}
