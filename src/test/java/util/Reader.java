package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reader {

    private static Properties properties;
    private static String webDriverPath = "src/main/resources/webdriver";

    static {
        try {
            FileInputStream fis = new FileInputStream(webDriverPath);
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Dosya okunamadı!");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
