<%@ page import="com.hzit.entity.Tblstudent" %>
<%@ page import="com.hzit.dao.CaoZuoStudent" %>
<%@ page import="com.hzit.dao.impl.CaoZuoStudentImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/24
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>处理页面</title>
</head>
<body>
<%
  request.setCharacterEncoding("UTF-8");
        String name=request.getParameter("stuName");
        String password=request.getParameter("stuId");
        CaoZuoStudent c=new CaoZuoStudentImpl();
          Tblstudent ts=new Tblstudent();
          ts.setStuName(name);
          ts.setStuId(password);
        ts=c.check(ts);
  if(ts==null){
    response.sendRedirect("../login.html");
  }else{
    response.sendRedirect("../Studentinfo.jsp");
  }
%>

</body>
</html>
