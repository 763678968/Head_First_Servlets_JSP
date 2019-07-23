<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            request.setCharacterEncoding("utf-8");
            String name = request.getParameter("uname");
            String pwd = request.getParameter("upwd");

            // 将用户名加入到Cookie中
            Cookie cookie = new Cookie("name", name);

            response.addCookie(cookie);

            response.sendRedirect("A.jsp");
        %>
</body>
</html>
