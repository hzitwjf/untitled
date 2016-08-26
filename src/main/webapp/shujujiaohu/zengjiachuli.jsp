<%@ page import="com.hzit.entity.Tblstudent" %>
<%@ page import="com.hzit.dao.CaoZuoStudent" %>
<%@ page import="com.hzit.dao.impl.CaoZuoStudentImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/25
  Time: 16:02
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
  String stuid=request.getParameter("stuid");
  String stuname=request.getParameter("stuname");
  String nianling=request.getParameter("age");
  Integer age=Integer.parseInt(nianling);
  String sex[]=request.getParameterValues("sex");
  Tblstudent ts=new Tblstudent();
  ts.setStuId(stuid);
  ts.setStuName(stuname);
  ts.setStuAge(age);
  //ts.setStuSex(sex[0]);
 if(sex[0].equals("男")){
    ts.setStuSex(sex[0]);
  }else{
   sex[0]="女";
    ts.setStuSex(sex[0]);
  }
  CaoZuoStudent c=new CaoZuoStudentImpl();
  int result=c.insertInto(ts);
  if(result==1){
    response.sendRedirect("../Studentinfo.jsp");
  }else {
    out.print("增加学生失败");
    response.sendRedirect("../form-common.html");
  }
%>
</body>
</html>
