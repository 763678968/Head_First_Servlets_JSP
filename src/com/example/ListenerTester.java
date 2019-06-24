package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        session.setAttribute("foo", "42");
        session.setAttribute("bar", "420");
        session.invalidate();

        String foo = (String)session.getAttribute("foo");

        out.println("Foo: " + foo);
    }
}
