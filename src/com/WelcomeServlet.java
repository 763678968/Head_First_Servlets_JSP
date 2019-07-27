package com;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //System.out.println("doGet...");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //System.out.println("doPost...");
        this.doGet(req, resp);
    }
}
