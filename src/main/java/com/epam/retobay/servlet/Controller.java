package com.epam.retobay.servlet;

import com.epam.retobay.action.Action;
import com.epam.retobay.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actionName = req.getParameter("action");
        Action action = ActionFactory.getAction(actionName);
        System.out.println("actionName = " + actionName);
        String result = action.execute(req);
        req.getRequestDispatcher(result).forward(req, resp);
    }
}


