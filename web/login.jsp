<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/26
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="LoginServlet" method="post">
        用户名：<input type="text" name="uname"><br/>
        密码：  <input type="password" name="upwd"><br/>
                <input type="submit" value="登录">
    </form>
</body>
</html>
