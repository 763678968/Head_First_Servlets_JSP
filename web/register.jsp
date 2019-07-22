<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
        <form action="show.jsp">
            用户名： <input type="text" name="uname" values="zs"/><br/>
            密码： <input type="password" name="upwd"/><br/>
            年龄： <input type="text" name="uage"/><br/>
            爱好：<br/>
            <input type="checkbox" name="uhobbies" value="唱"/>唱、
            <input type="checkbox" name="uhobbies" value="跳"/>跳、
            <input type="checkbox" name="uhobbies" value="Rap"/>Rap、
            <input type="checkbox" name="uhobbies" value="篮球"/>篮球<br/>
            <input type="submit" value="注册">
        </form>
  </body>
</html>