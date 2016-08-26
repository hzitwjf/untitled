package com.hzit.dao.impl;



import com.hzit.dao.CaoZuoStudent;
import com.hzit.dao.GetConnect;
import com.hzit.entity.Tblstudent;
import com.hzit.entity.Tblteacher;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/8/23.
 */
public class CaoZuoStudentImpl extends GetConnect implements CaoZuoStudent {
    @Override
    public List<Tblstudent> FindAll() {
        open();
        String sql="SELECT * FROM tblstudent";
        try{
            BeanListHandler<Tblstudent> student=new BeanListHandler<Tblstudent>(Tblstudent.class);
            List<Tblstudent> list=qr.query(connection,sql,student);
            return list;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
        finally {
            try {
                close(connection, null, null);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Tblstudent FindId(Serializable stuId) {
        open();
        String sql="SELECT * FROM tblstudent WHERE StuId=?";
        try{
            Tblstudent ts= qr.query(connection, sql, new BeanHandler<Tblstudent>(Tblstudent.class), stuId);
            return ts;
        }catch (Exception ex){
            ex.printStackTrace();

        }
        finally {
            try{
                close(connection, null, null);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return  null;
    }

    @Override
    public int update(Tblstudent ts) {
        open();
        String sql="UPDATE tblstudent SET StuId=?,StuName=?,StuAge=?,StuSex=? WHERE StuId=?";
        try{
            int result= qr.update(connection,sql,ts.getStuId(),ts.getStuName(),ts.getStuAge(),ts.getStuSex(),ts.getStuId());

            return result;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            try{
                close(connection, null, null);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public int delete(Serializable stuId) {
        open();
        String sql="DELETE FROM tblstudent WHERE StuId=?";
        try{
            int result= qr.update(connection,sql,stuId);

            return result;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            try{
                close(connection, null, null);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return -1;

    }
    @Override
    public int insertInto(Tblstudent ts) {
        open();
        String sql="INSERT INTO tblstudent VALUES(?,?,?,?)";
        try{
            int result= qr.update(connection,sql,ts.getStuId(),ts.getStuName(),ts.getStuAge(),ts.getStuSex());

            return result;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            try{
                close(connection, null, null);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public Tblstudent check(Tblstudent tblstudent) {
        open();
        String sql="SELECT * FROM tblstudent WHERE StuId=? and StuName=?";
        try {
            Tblstudent ts= qr.query(connection, sql, new BeanHandler<Tblstudent>(Tblstudent.class), tblstudent.getStuId(),tblstudent.getStuName() );
            return ts;
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
}
