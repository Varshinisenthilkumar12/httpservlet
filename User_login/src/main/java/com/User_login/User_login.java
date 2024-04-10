package com.User_login;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User_login extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");

        if (name != null && password != null && name.equals("test") && password.equals("pass")) {
            res.getWriter().append("success");
        } else {
            res.getWriter().append("failure");
        }

        System.out.println("get");
    }
}
