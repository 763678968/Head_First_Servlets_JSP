<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/28
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            System.out.print("===============session销毁页面sessionInvalidate.jsp=============");
            session.invalidate();
        %>
</body>
</html>
