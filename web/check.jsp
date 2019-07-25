<%@ page import="java.util.Scanner" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/25
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String URL = "jdbc:mysql://localhost:3306/student";
    String USERNAME = "root";
    String PWD = "12241122---qrx";
    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        // a.导入驱动，加载具体的驱动类
        Class.forName("com.mysql.cj.jdbc.Driver"); // 加载具体的驱动类
        // b.与数据库建立连接
        connection = DriverManager.getConnection(URL, USERNAME, PWD);
        // c.发送sql，执行（查）
        stmt = connection.createStatement();
        
        String name = request.getParameter("uname");
        String pwd = request.getParameter("upwd");

        String sql = "select count(*) from login where uname = '"+name+"' and upwd = '"+pwd+"'";
        
        // 执行SQL(增删改executeUpdate()，查询executeQuery())
        rs = stmt.executeQuery(sql); // 返回值表示增删改几条数据
        // d.处理结果
        int count = -1;
        if (rs.next()) {
            count = rs.getInt(1);
        }
        if (count > 0) {
            out.println("登录成功！");
        } else {
            out.println("登录失败！");
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close(); // 对象、方法
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
</body>
</html>
