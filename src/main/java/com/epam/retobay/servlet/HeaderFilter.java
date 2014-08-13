package com.epam.retobay.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeaderFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse)resp;
        response.addHeader("author", "alexey.slepenkov@gmail.com");
        response.addHeader("project", "t5:Catharina");
        req.setCharacterEncoding("UTF-8");
        chain.doFilter(req, response);
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
