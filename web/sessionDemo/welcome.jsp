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
    out.print(name);
%>
</body>
</html>
