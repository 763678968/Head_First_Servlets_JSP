<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            // 服务端
            Cookie cookie1 = new Cookie("name", "zs");
            Cookie cookie2 = new Cookie("pwd", "abc");

            response.addCookie(cookie1);
            response.addCookie(cookie2);

            // 页面跳转到客户端（转发、重定向）
            response.sendRedirect("result.jsp");
        %>
</body>
</html>
