package VTBTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.VTB.OpenwayVTBCard;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Openway_VTB")
public class OpenwayVTBCardTest extends BaseTest {
    public static WebDriver driver = new ChromeDriver();

    //protected OpenwayVTBCard openwayVTBCard;

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void a() throws InterruptedException {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Наличие кнопки Пополнить")
    public void checkButtonPopolnit() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonOplatit();
    }

    @Test
    @Order(4)
    @DisplayName("Переход в блок \"О карте\"")
    public void clickPageInformation() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.openPageInformation();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonUsecard();
    }

    @Test
    @Order(6)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonMakeVipyska();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonMakeSpravka();
    }

    @Test
    @Order(8)
    @DisplayName("Переход в блок Настройки")
    public void openPageSettings() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.openPageSettings();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonhangePin() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonhangePin();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonChangeLimit();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonChangeBlock();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonRecomend();
    }

    @Test
    @Order(13)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.pageHistoryOperation();
    }

    @Test
    @Order(14)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.pageRassrochki();
    }

    @Order(15)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.clickTabDebt();
    }

    @Order(16)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkAccGrace();
    }

    @Order(17)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkAccDebt();
    }


    @Order(18)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkAccCredLim();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkAccTarrifs();
    }

 /*   @Order(20)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.clickTabReqv();
    }

    @Order(21)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkTabRekv();
    }*/

    @Order(22)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты в подвале")
    public void checkButtonCardNumberFooter() throws InterruptedException {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonCardNumberFooter();
    }

    @Order(23)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты вверху страницы")
    public void checkButtonCardNumberHeader() throws InterruptedException {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.checkButtonCardNumberHeader();
    }

    @AfterAll
    public static void quit() {
        driver.quit();
    }
}
