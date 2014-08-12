package com.epam.catharina.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nickName = req.getParameter("nickName");
        String email = req.getParameter("email");
        String birth = req.getParameter("birth");
        String gender = req.getParameter("gender");
        //todo ActionFactory
        req.setAttribute("nickName", nickName);
        req.setAttribute("email", email);
        req.setAttribute("birth", birth);
        req.setAttribute("gender", gender);


        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
    }
}

