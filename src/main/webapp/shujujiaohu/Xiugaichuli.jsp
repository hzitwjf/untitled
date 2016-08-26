<%@ page import="com.hzit.entity.Tblstudent" %>
<%@ page import="com.hzit.dao.CaoZuoStudent" %>
<%@ page import="com.hzit.dao.impl.CaoZuoStudentImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/26
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
  request.setCharacterEncoding("UTF-8");
        String name=request.getParameter("stuname");
        String stuid=request.getParameter("stuid");
        String age=request.getParameter("stuage");
        String sex=request.getParameter("stusex");
  Tblstudent ts=new Tblstudent();
  CaoZuoStudent c=new CaoZuoStudentImpl();
  //先从数据库查到原始数据
          ts=c.FindId(stuid);
  //再将值封装到实体类
        ts.setStuId(stuid);
        ts.setStuName(name);
        ts.setStuSex(sex);
      ts.setStuAge(Integer.parseInt(age));
  //再将数据同步到数据库
     int result= c.update(ts);
  if(result==1){
    response.sendRedirect("../Studentinfo.jsp");
  }else {
    out.print("<script>alert('修改失败');location='../update.jap'</script>");
  }
%>
</body>
</html>
