package com.Liuzijian.week4.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConfigDemoServlet",urlPatterns = {"/Config"},
        initParams = {
                @WebInitParam(name = "name", value = "Liuzijian"),
                @WebInitParam(name = "studentId", value = "2020211001001309")
        }
)
public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=this.getServletConfig().getInitParameter("name");
        String studentId =this.getServletConfig().getInitParameter("studentId");
        PrintWriter writer=response.getWriter();
        writer.println("<HTML>");
        writer.println("<HEAD>");
        writer.println("</HEAD>");
        writer.println("<BODY>");
        writer.println("<p>name:"+name+"</p>");
        writer.println("<p>studentId:"+ studentId +"</p>");
        writer.println("</BODY>");
        writer.println("</HTML>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}