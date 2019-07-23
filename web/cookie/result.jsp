<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 客户端
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        out.print(cookie.getName() + "--" + cookie.getValue());
    }
%>
</body>
</html>
