<%@ page import="com.BeanListener" %>
<%@ page import="com.BeanListener2" %><%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/29
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BeanListener2 bean = new BeanListener2();
    bean.setNum(10);
    bean.setUser("zs");

    session.setAttribute("bean", bean);
%>
</body>
</html>
