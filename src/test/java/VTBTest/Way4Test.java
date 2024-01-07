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
import ru.vtb.testing.VTB.Way4;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Openway")
public class Way4Test extends BaseTest {

    static WebDriver driver = new ChromeDriver();

    @BeforeAll
    @Test
    @DisplayName("Авторизация")
    public static void beforeAll() throws InterruptedException {
        //System.setProperty("webdriver.chromedriver", "C:\\soft\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //public void a() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.Authorization2();
    }


/*    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.Authorization2();
    }*/

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonOplatit();
    }

    @Test
    @Order(4)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        Way4 way4 = new Way4(driver);
        way4.openPageInformation();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonUsecard();
    }

    @Test
    @Order(6)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonMakeVipyska();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.checkButtonMakeSpravka();
    }

    @Test
    @Order(8)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {
        Way4 way4 = new Way4(driver);
        way4.openPageSettings();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonChangeLimit();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonChangePin() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonChangePin();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonChangeBlock();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonRecomend();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonRefinanc();
    }

    @Test
    @Order(14)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        Way4 way4 = new Way4(driver);
        way4.checkButtonAdditionalCard();
    }


    @Test
    @Order(15)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        Way4 way4 = new Way4(driver);
        way4.pageHistoryOperation();
    }

    @Test
    @Order(16)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageHowUseCard() {
        Way4 way4 = new Way4(driver);
        way4.pageHowUseCard();
    }

    @Order(17)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        Way4 way4 = new Way4(driver);
        way4.clickTabDebt();
    }

    @Order(18)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        Way4 way4 = new Way4(driver);
        way4.checkAccGrace();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        Way4 way4 = new Way4(driver);
        way4.checkAccDebt();
    }


    @Order(20)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        Way4 way4 = new Way4(driver);
        way4.checkAccCredLim();
    }

    @Order(21)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        Way4 way4 = new Way4(driver);
        way4.checkAccTarrifs();
    }

/*    @Order(22)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        Way4 way4 = new Way4(driver);
        way4.clickTabReqv();
    }

    @Order(23)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        Way4 way4 = new Way4(driver);
        way4.checkTabRekv();
    }*/

    @AfterAll
    public static void quit() {
        driver.quit();
    }
}

