package com.sandeep.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    public ConfigReader() {
        properties = new Properties();
        try {

            FileInputStream file = new FileInputStream(
                    "src/test/resources/config.properties");

            properties.load(file);

        } catch (IOException e) {

            throw new RuntimeException("Unable to load config.properties", e);

        }
        public String getProperty(String key) {

            return properties.getProperty(key);

        }
    }
}
