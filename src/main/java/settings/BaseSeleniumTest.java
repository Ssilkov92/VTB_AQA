package settings;

/*Created by Stanislav Silkov */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeAll
    //@Test
    @DisplayName("Авторизация")
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //System.setProperty("webdriver.chromedriver", "C:\\soft\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        BaseSeleniumPage.setDriver(driver);
    }

    @AfterAll
    public void tearDown() {
        driver.close(); //закрывает Хромдрайвер - взаимодействие с браузер
        driver.quit(); //закрываем сам браузер
    }

}
