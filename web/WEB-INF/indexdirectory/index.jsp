<%@ page import="java.util.List" %>
<%@ page import="com.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/27
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息列表</title>
</head>
<body>
        <table border="1px">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>地址</th>
            </tr>

            <%
                // 获取request域中的数据
                List<Student> students = (List<Student>) request.getAttribute("students");
                for (Student student : students) {
            %>
            <tr>
                <td><%=student.getSno()%></td>
                <td><%=student.getSname()%></td>
                <td><%=student.getSage()%></td>
                <td><%=student.getSaddress()%></td>
            </tr>
            <%
                }
            %>

        </table>

</body>
</html>
