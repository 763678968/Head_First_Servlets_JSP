<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            session.setAttribute("hello", "world");
            // request.getRequestDispatcher("rq1.jsp").forward(request, response);
            response.sendRedirect("ss1.jsp");
        %>

        <%=pageContext.getAttribute("hello")%>
</body>
</html>
