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
import ru.vtb.testing.VTB.AccountProfile;
import ru.vtb.testing.VTB.OpenwayVTBCard;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Счёт Profile")
public class AccountProfileTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.Authorization2();
    }


    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonOplatit();
    }

    @Test
    @Order(4)
    @DisplayName("Переход в блок \"О cчете\"")
    public void clickPageInformation() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.openPageInformation();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonUsecard();
    }

    @Test
    @Order(6)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonMakeVipyska();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonMakeSpravka();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Ваш беспроцентный период")
    public void checkButtonNotPayPercent() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonNotPayPercent();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Отчет о процентах")
    public void checkButtonPercentReport() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonPercentReport();
    }

    @Test
    @Order(10)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.openPageSettings();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonChangeLimit();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonRecomend();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonRefinanc();
    }

    @Test
    @Order(14)
    @DisplayName("Наличие кнопки Оформить страховку")
    public void checkButtonInsurance() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonInsurance();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkButtonAdditionalCard();
    }

    @Test
    @Order(16)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageHistoryOperation();
    }

    @Test
    @Order(17)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.pageRassrochki();
    }

    @Order(18)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.clickTabDebt();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccGrace();
    }

    @Order(20)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccDebt();
    }


    @Order(21)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccCredLim();
    }

    @Order(22)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkAccTarrifs();
    }

/*    @Order(23)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.clickTabReqv();
    }*/

/*    @Order(23)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.clickTabReqv();
    }

    @Order(24)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        AccountProfile accountProfile = new AccountProfile(driver);
        accountProfile.checkTabRekv();
    }*/

    @AfterAll
    @Test
    public static void quit() {
        driver.quit();
    }
}
