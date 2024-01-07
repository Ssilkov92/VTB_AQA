package VTBTest;/*Created by Stanislav Silkov */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.VTB.OpenwayVTBAccount;
import ru.vtb.testing.VTB.OpenwayVTBCard;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Cчёт Openway_VTB")
public class OpenwayVTBAccountTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void a() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonOplatit();
    }

    @Test
    @Order(4)
    @DisplayName("Переход в блок \"О cчете\"")
    public void clickPageInformation() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.openPageInformation();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonUsecard();
    }

    @Test
    @Order(6)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonMakeVipyska();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonMakeSpravka();
    }

    @Test
    @Order(8)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.openPageSettings();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonAdditionalCard();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkButtonChangeLimit();
    }

    @Test
    @Order(11)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageHistoryOperation();
    }

    @Test
    @Order(12)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.pageRassrochki();
    }

    @Order(13)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.clickTabDebt();
    }

    @Order(14)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccGrace();
    }

    @Order(15)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccDebt();
    }


    @Order(16)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccCredLim();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkAccTarrifs();
    }
/*    @Order(18)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.clickTabReqv();
    }*/

 /*   @Order(18)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.clickTabReqv();
    }

    @Order(19)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        OpenwayVTBAccount openwayVTBAccount = new OpenwayVTBAccount(driver);
        openwayVTBAccount.checkTabRekv();
    }*/

    @AfterAll
    public static void quit() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}


