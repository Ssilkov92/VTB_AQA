package settings;

/*Created by Stanislav Silkov */

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver webdriver){
    driver = webdriver;
    }
}
