package com.epam.catharina.util;

import com.epam.catharina.entity.MyRole;
import com.epam.catharina.entity.Sex;
import com.epam.catharina.entity.User;

import java.sql.Date;
import java.util.UUID;


public class Runner {
    public static void main(String[] args) {
        User me = new User(UUID.randomUUID(), "General_Elvis", "alexey.slepenkov@gmail.com", MyRole.ADMIN, Sex.MALE, Date.valueOf("1994-03-26"));

        System.out.println("me = " + me.toString());

    }
}
