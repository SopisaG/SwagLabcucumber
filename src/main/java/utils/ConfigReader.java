package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readProperty(String property) {
        Properties prop = new Properties();

        try {
            FileInputStream fileInput = new FileInputStream("config.properties");
            prop.load(fileInput);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(property);
    }
}
