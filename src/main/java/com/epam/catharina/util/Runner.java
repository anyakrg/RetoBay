package com.epam.catharina.util;

import com.epam.catharina.entity.User;
import java.sql.Date;
import java.util.UUID;

import static com.epam.catharina.entity.User.*;

public class Runner {
    public static void main(String[] args) {
        User su = new User(UUID.randomUUID(), "General_Elvis", "alexey.slepenkov@gmail.com", MyRole.ADMIN , Sex.MALE, Date.valueOf("1994-03-26"));
        System.out.println("su = " + su.toString());
    }
}
