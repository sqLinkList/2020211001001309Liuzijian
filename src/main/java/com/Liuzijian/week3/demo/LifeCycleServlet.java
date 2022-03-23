package com.Liuzijian.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "LifeCycleServlet", value = "/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

    Connection con=null;
    public LifeCycleServlet(){
        System.out.println("i am constructor --> LifeCycleServlet");
    }
    @Override
    public void init() {

        System.out.println("i am in init()-> "+con);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service () -->doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
        System.out.println("i am in destroy () --> doGet()");
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
