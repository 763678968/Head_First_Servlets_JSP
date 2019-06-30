<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/6/30
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="KathyClassicTags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <mine:iterateMovies>
        <tr><td>${movie}</td></tr>
    </mine:iterateMovies>
</table>

</body>
</html>
