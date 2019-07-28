<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/28
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            // ServletContext:application
            application.setAttribute("name", "zs"); // 增加application(ServletContext)属性
            application.setAttribute("name", "ls"); // 替换
            application.removeAttribute("name");

            session.setAttribute("user", "user01");
            session.setAttribute("user", "user02");
            session.removeAttribute("user");

            request.setAttribute("school", "zju");
            request.setAttribute("school", "zju1");
            request.removeAttribute("school");
        %>
</body>
</html>
