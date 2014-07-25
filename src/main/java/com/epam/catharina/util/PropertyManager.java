package com.epam.catharina.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static final Properties PROPERTIES = new Properties();

    public PropertyManager(String filename) {
        InputStream stream = PropertyManager.class.getClassLoader().getResourceAsStream(filename);
        try {
            PROPERTIES.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public int getIntProperty(String key) {
        String property = PROPERTIES.getProperty(key);
        int size = PROPERTIES.size();
        return Integer.parseInt(property);
    }

    public double getDoubleProperty(String key) {
        String property = PROPERTIES.getProperty(key);
        int size = PROPERTIES.size();
        return Double.parseDouble(property);
    }
}