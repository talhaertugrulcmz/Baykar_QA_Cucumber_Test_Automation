
package Util;

import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class Driver {

    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browser){
        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")){
            WebDriverManager
            WebDriverManager.chromedriver().setup();
        }
    }


}
