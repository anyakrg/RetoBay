package com.epam.as.test.util;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Runner {

    public static void main(String[] args) {
        StudentFinder.findByGroup(2);
        keepRollin(50);

    }

    public static void keepRollin(int speed){

        boolean on = false;
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        try {
            for (int i = 0; i < 200000; i++) {
                toolkit.setLockingKeyState(KeyEvent.VK_SCROLL_LOCK, on);
                Thread.sleep(speed);
                toolkit.setLockingKeyState(KeyEvent.VK_CAPS_LOCK, on);
                Thread.sleep(speed);
                toolkit.setLockingKeyState(KeyEvent.VK_NUM_LOCK, on);
                Thread.sleep(speed);
                on = !on;
            }
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
