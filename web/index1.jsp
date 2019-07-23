<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%="当前项目的虚拟路径：" + application.getContextPath() + "<br/>" %>
        <%="虚拟路径对应的绝对路径：" + application.getRealPath("/web_war_exploded") + "<br/>" %>
</body>
</html>
