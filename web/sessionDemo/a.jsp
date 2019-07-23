<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.print(session.getAttribute("uname"));
    Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("JSESSIONID")) {
            System.out.print("JSESSIONID" + cookie.getValue());
        }
    }
%>
</body>
</html>
