package com.epam.retobay.util;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //User su = new User(UUID.randomUUID(), "General_Elvis", "alexey.slepenkov@gmail.com", Role.ADMIN , Sex.MALE, Date.valueOf("1994-03-26"));
        // System.out.println("su = " + su.toString());

        for (int i = 0; i < 7; i++) {
            smthng();
        }


    }

    private static void smthng() {
        List<UUID> uuid = new ArrayList<UUID>() ;
        for (long i = 0; i < 1000000; i++) {
          //  uuid.add(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"));
            uuid.add(UUID.randomUUID();
        }
        Set<UUID> set = new HashSet<UUID>(uuid);
        System.out.println("list size" + uuid.size());
        System.out.println("set size" + set.size());
        System.out.println("-------------------------------" );
    }
}





//TODO QUESTIONS!!
/*
3-Хранение картинок  - база, объект, реляц база?
4-
5-
6-
7-
 */