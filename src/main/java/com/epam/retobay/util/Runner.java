package com.epam.retobay.util;

import com.epam.retobay.entity.User;
import java.sql.Date;
import java.util.UUID;

import static com.epam.retobay.entity.User.*;

public class Runner {
    public static void main(String[] args) {
        User su = new User(UUID.randomUUID(), "General_Elvis", "alexey.slepenkov@gmail.com", MyRole.ADMIN , Sex.MALE, Date.valueOf("1994-03-26"));
        System.out.println("su = " + su.toString());
    }

}



//TODO QUESTIONS!!
/*
1-Сразу в sql или агрегирующий класс?
2-КОпия состояния в объектах, или состояние в базе DAO?
3-Хранение картинок  - база, объект, реляц база?
4-
5-
6-
7-
 */