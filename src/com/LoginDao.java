package com;


import javax.xml.transform.Result;
import java.sql.*;

// 模型层：用于处理登录（查询数据）
public class LoginDao {
    public static int login(Login login) { // 登录
        //boolean flag = false; // 登录成功与否的标识
        int flag = -1; // -1：系统异常， 0：用户名或密码有误 1：登录成功
        int result = -1;
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "12241122---qrx");

            String sql = "select count(*) from login where uname = ? and upwd = ?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, login.getUname());
            pstmt.setString(2, login.getUpwd());
            rs = pstmt.executeQuery();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            if (result > 0) {
                return 1;
            } else {
                return 0; // 登录失败（用户名或密码有误！）
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1; // 登录失败（系统异常！）
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } catch(Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
