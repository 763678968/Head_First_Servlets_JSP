<%@ page import="org.w3c.dom.css.Counter" %><%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/25
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! int doubleCount() {
    count = count*2;
    return count;
    }
%>
<%! int count=1; %>
The page count is now:
<%= doubleCount() %>
</body>
</html>