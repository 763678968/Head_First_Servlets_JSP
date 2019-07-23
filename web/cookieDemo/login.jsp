<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String uname;
%>
<%
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {

    }
%>

        <form action="check.jsp" method="post">
            用户名：<input type="text" name="uname"><br/>
            密码：<input type="password" name="upwd"><br/>
            <input type="submit" value="登录"><br/>
        </form>
</body>
</html>
