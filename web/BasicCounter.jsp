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
The friends who share your hobby of
<%= request.getParameter("hobby") %>
are:<br>
<% ArrayList al = (ArrayList)request.getAttribute("names"); %>
<% Iterator it = al.iterator();

while (it.hasNext()) { %>
    <%= it.next() %>
<br>
<% } %>
</body>
</html>