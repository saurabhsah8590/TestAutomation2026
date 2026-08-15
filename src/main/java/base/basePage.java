package base;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class basePage {

    private static Properties prop;
    public static String url;

    public basePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.Properties");
        prop.load(data);
    }

    public static WebDriver getDriver() throws IOException{
        return WebDriverInstance.getDriver();
    }

    public static String getUrl(){
        url = prop.getProperty("url");
        return url;
    }
}
