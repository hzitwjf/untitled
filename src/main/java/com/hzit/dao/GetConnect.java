package com.hzit.dao;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.*;

/**
 * Created by Administrator on 2016/8/23.
 */
public class GetConnect {
    protected  Connection connection;
    protected QueryRunner qr=new QueryRunner();
    public  Connection open() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/homework";
            String user="root";
            String password="hzit";
            connection= DriverManager.getConnection(url, user, password);
            System.out.println(connection.toString());
            System.out.println(connection.isClosed());
            return  connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public  void close(Connection c,Statement s,ResultSet rs)throws  Exception{
        if(rs!=null){
            rs.close();
        }
        if (s!=null){
            s.close();
        }
        if (c!=null){
            c.close();
        }
    }
    public  void close(Connection c,PreparedStatement ps,ResultSet rs)throws  Exception{
        if(rs!=null){
            rs.close();
        }
        if (ps!=null){
            ps.close();
        }
        if (c!=null){
            c.close();
        }
    }
}
