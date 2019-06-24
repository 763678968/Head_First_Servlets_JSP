package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ListenerTester extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test session attributes<br>");
        HttpSession session = new request.getSession();

        synchronized(session) {
            getServletContext().setAttribute("foo", "22");
            getServletContext().setAttribute("bar", "42");

            out.println(session.getAttribute("foo"));
            out.println(session.getAttribute("bar"));
        }

    }
}
