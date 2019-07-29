<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/29
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.BeanListener"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            BeanListener bean = new BeanListener();
            session.setAttribute("bean", bean); // 绑定
        %>
</body>
</html>
