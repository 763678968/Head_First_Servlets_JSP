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
        session.setMaxInactiveInterval(0);
        String foo = (String)session.getAttribute("foo");

        if (session.isNew()) {
            out.println("This is a new session.");
        } else {
            out.println("Welcome back!");
        }
        out.println("Foo: " + foo);
    }
}
