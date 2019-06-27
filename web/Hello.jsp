<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/27
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome to our page!

<% if (request.getParameter("userName") == null) { %>
    <jsp:forward page="HandleIt.jsp" />
<% } %>

Hello ${param.userName}

</body>
</html>
