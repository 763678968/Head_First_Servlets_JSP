<%--
  Created by IntelliJ IDEA.
  User: animation
  Date: 2019/7/23
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            request.setCharacterEncoding("utf-8");
            String name = request.getParameter("uname");
            String pwd = request.getParameter("upwd");
            if (name.equals("zs") && pwd.equals("abc")) { // 假设zs abc
                // 只有登录成功，session中才会存在uname/upwd
                session.setAttribute("uname", name);
                session.setAttribute("upwd", pwd);
                System.out.println("sessionId" + session.getId());

                // Cookie cookie = new Cookie("uname", name)
                // response.addCookie(cookie);
                // 服务端在第一次响应客户端时，会发送一个JSESSIONID的cookie

                // session.setMaxInactiveInterval(10);

                request.getRequestDispatcher("welcome.jsp").forward(request, response);
            } else {
                // 登录失败
                response.sendRedirect("login.jsp");
            }
        %>
</body>
</html>
