package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class QueryAllStudentsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        StudentService service = new StudentService();
        List<Student> students = service.queryAllStudents();

        System.out.println(students);
        request.setAttribute("students", students);
        // 因为request域中有数据，因此需要通过请求转发的方式跳转（重定向会丢失request域）
        // pageContext < request < session < application

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
