<%@ page import="com.hzit.entity.Tblstudent" %>
<%@ page import="com.hzit.dao.CaoZuoStudent" %>
<%@ page import="com.hzit.dao.impl.CaoZuoStudentImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/25
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
  String stuid=request.getParameter("stuid");
  CaoZuoStudent c=new CaoZuoStudentImpl();
  Tblstudent ts=new Tblstudent();
  int result=c.delete(stuid);
    response.sendRedirect("../Studentinfo.jsp");
%>
</body>
</html>
