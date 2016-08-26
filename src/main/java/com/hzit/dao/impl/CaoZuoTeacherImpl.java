package com.hzit.dao.impl;

import com.hzit.dao.CaoZuoTeacher;
import com.hzit.dao.GetConnect;
import com.hzit.entity.Tblteacher;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public class CaoZuoTeacherImpl extends GetConnect implements CaoZuoTeacher {
    @Override
    public List<Tblteacher> FindAll() {
        open();
        String sql="SELECT * FROM tblteacher";
        try {
            List<Tblteacher> teacher= qr.query(connection, sql, new BeanListHandler<Tblteacher>(Tblteacher.class));
       return teacher;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Tblteacher FindId(Serializable teaId) {
        open();
        String sql="SELECT * FROM tblteacher WHERE teaId=?";
        try {
            Tblteacher tblteacher=qr.query(connection, sql, new BeanHandler<Tblteacher>(Tblteacher.class),teaId);
            return  tblteacher;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int update(Tblteacher tt) {
        open();
        String sql="UPDATE tblteacher SET TeaId=?,TeaName=? WHERE TeaId=?";
        try {
          int result= qr.update(connection,sql,tt.getTeaId(),tt.getTeaName(),tt.getTeaId());
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int delete(Serializable teaId) {
        open();
        String sql="DELETE FROM tblteacher WHERE TeaId=?";
        try {
            int result= qr.update(connection,sql,teaId);
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int insertInto(Tblteacher tt) {
        open();
        String sql="INSERT INTO tblteacher VALUES(?,?);";
        try {
          int result = qr.update(connection,sql,tt.getTeaId(),tt.getTeaName());
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        finally {
            try {
                close(connection,null,null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
