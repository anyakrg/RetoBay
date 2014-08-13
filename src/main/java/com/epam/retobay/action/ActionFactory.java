package com.epam.retobay.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private final static Map<String, Action> actions = new HashMap<>();

    static {
        actions.put("register", new RegistrationAction());
        actions.put("login", new LoginAction());
    }

    public static Action getAction(String actionName) {
        return actions.get(actionName);
    }
}