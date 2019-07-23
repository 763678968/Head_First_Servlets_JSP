<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎您：
<%
    String name = (String)session.getAttribute("uname");
    // 如果用户没有登陆，而是直接通过地址栏访问welcome，则必然获取到的name为null
    if (name!=null) {
        out.print(name);
    } else { // 如果没有登陆，应该跳转到登录页面
        response.sendRedirect("login.jsp");
    }
%>
</body>
</html>
