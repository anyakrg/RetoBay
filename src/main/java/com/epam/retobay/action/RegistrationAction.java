package com.epam.retobay.action;

import com.epam.retobay.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class RegistrationAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");

        User u = new User();
        u.setUuid(UUID.randomUUID());
        u.setLogin(login);
        u.setPassword(password);
        u.setEmail(email);
        u.setGender(User.Sex.valueOf(gender));
        u.setRole(User.Role.valueOf("Client")); // todo change master or client

        // validate
        // db check
        // write to db

        if (!success) {
           request.setAttribute("login", login);
           request.setAttribute("email", email);
           //request.setAttribute("error", error type);
           return "/RegistrationPage.jsp";
        }

        request.setAttribute("user", u);
        return "/WEB-INF/hello.jsp";
    }
}