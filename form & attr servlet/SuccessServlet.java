package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class SuccessServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("This is success servlet");
        out.println("Successfully Registered");
        String name=req.getParameter("user_name");
        out.println("Welcome" +name);
    }
    
}
