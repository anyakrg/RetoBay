package com.epam.retobay.action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
    String execute(HttpServletRequest request);
}
