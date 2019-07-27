<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/27
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="UpAndDown.UploadServlet" method="post" enctype="multipart/form-data">
            学号：<input name="sno"/><br/>
            姓名：<input name="sname"/><br/>
            上传照片：<input type="file" name="spicture"/><br/>
            <input type="submit" value="注册"/>
        </form>
        <a href="UpAndDown.DownloadServlet?filename=无标题.png">无标题</a>

</body>
</html>
