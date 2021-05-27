
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowHeaders extends HttpServlet {
    public void doGet(HttpServletRequest request,  
                    HttpServletResponse response)  
    throws IOException, ServletException {  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();  
        
      out.println("HTTP headers sent by your client:<br>");  
        
        Enumeration enum1 = request.getHeaderNames(); 
        while (enum1.hasMoreElements()) {  
        String headerName = (String) enum1.nextElement();  
        String headerValue = request.getHeader(headerName);  
        out.print("<b>Header Name  :</b>"+headerName + ":   ");  
        out.println("<b>Header Value :  </b>"+headerValue + "<br>");  
      }  
        
  }

}

    