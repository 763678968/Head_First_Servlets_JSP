<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/19
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

    <%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while(it.hasNext()) {
            out.print("<br>try: " + it.next());
        }
    %>

</body>
</html>
