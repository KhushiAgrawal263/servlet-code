// creating servlet by using http servlet class
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class Thirdservlet extends HttpServlet
{
     public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
     {
         System.out.println("This is GET Method..........");
         response.setContentType("text/html");
         PrintWriter out = response.getWriter();
         out.print("<h1>This is GET Method of my servlet </h1>"); 
         out.println(new Date().toString());
     }
}
