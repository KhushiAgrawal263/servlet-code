
package com.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.println("<h2> Welcome to registered servlet </h2>");
       String name=request.getParameter("user_name");
       String password=request.getParameter("user_password");
       String email=request.getParameter("user_email");
       String gender=request.getParameter("user_gender");
       String course=request.getParameter("user_course");

       String cond=request.getParameter("condition");
       if(cond!=null)
       {
            if(cond.equals("checked"))
            {
               out.println("<h2>Name:"+name+ "<h2>");
               out.println("<h2>Password:"+password+ "<h2>");
               out.println("<h2>Email:"+email+ "<h2>");
               out.println("<h2>Gender:"+gender+ "<h2>");
               out.println("<h2>course:"+course+ "<h2>");
               //Saved to db
               RequestDispatcher rd = request.getRequestDispatcher("success");
               rd.forward(request, response);
               
            }
            else
            {
                out.println("<h2>You have not accepted terms and conditions");
            }
       } 
       else
       {
           out.println("<h2>You have not accepted terms and conditions");
           // Include output of index.html
           
           // get the object of RequestDispatcher
           
           RequestDispatcher rd = request.getRequestDispatcher("index.html");
//           
//           // include

           rd.include(request,response);
         

//           
       }
     }
}
