package com;

import java.sql.*;

public class LoginDao_ {

    public int login(Login_ login) { // 1：登录成功 0：登录失败（用户名或密码有误） -1：系统异常
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

//            String name = request.getParameter("uname");
//            String pwd = request.getParameter("upwd");

            String sql = "select count(*) from login where uname = '"+ login.getName()+"' and upwd = '"+login.getPwd()+"'";

            // 执行SQL(增删改executeUpdate()，查询executeQuery())
            rs = stmt.executeQuery(sql); // 返回值表示增删改几条数据
            // d.处理结果
            int count = -1;
            if (rs.next()) {
                count = rs.getInt(1);
            }
//            if (count > 0) {
//                out.println("登录成功！");
//            } else {
//                out.println("登录失败！");
//            }
            return count;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close(); // 对象、方法
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
