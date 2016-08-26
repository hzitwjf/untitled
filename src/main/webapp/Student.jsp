<%@ page import="com.hzit.dao.CaoZuoStudent" %>
<%@ page import="com.hzit.dao.impl.CaoZuoStudentImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hzit.entity.Tblstudent" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/24
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询所有学生</title>
</head>
<style>
h1{
  color: red;
  font-family:微软雅黑;
}
h2{
  font-family:微软雅黑;
  color:chocolate;
}
td{
    font-size: 12px;
    color: #909;
	font-family:微软雅黑;
  }
</style>
<body>
<table width="683" border="1" align="center">
  <tr>
    <td colspan="6" align="center" valign="middle"><h1>学生信息表</h1></td>
  </tr>
  <tr align="center" valign="middle">
    <td width="106"><h2>学生ID</h2></td>
    <td width="117"><h2>学生名字</h2></td>
    <td width="118"><h2>年龄</h2></td>
    <td width="101"><h2>性别</h2></td>
    <td width="114"><h2>编辑</h2></td>
    <td width="87"><h2>删除</h2></td>
  </tr>
  <%
    CaoZuoStudent c=new CaoZuoStudentImpl();
    List<Tblstudent> list=c.FindAll();
    for(Tblstudent ts : list){
  %>
  <tr align="center" valign="bottom">
    <td><%=ts.getStuId()%></td>
    <td><%=ts.getStuName() %></td>
    <td><%=ts.getStuAge()%></td>
    <td><%=ts.getStuSex()%></td>
    <td><a href="#">编辑</a></td>
    <td><a href="#">删除</a></td>
  </tr>
  <%
    }
  %>
</table>
</body>
</html>
