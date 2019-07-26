<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/25
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.LoginDao_" %>
<%@ page import="com.entity.*" %>
<%@ page import="com.Login_" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("uname");
    String pwd = request.getParameter("upwd");
    Login_ login = new Login_(name, pwd);
    
    LoginDao_ dao = new LoginDao_();
    int result = dao.login(login);
    if (result > 0) {
        out.print("登录成功！");
    } else if (result == 0) {
        out.print("用户名或密码有误！");
    } else {
        out.print("系统异常！");
    }
%>
</body>
</html>
