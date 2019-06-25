<%@ page import="org.w3c.dom.css.Counter" %><%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/25
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Test scriptlets...
<%! int x = 42; %>
<% int x = 22; %>
<%= this.x %>
</body>
</html>