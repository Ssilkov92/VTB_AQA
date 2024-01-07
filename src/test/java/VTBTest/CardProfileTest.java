package VTBTest;/*Created by Stanislav Silkov */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.vtb.testing.VTB.CardProfile;
import ru.vtb.testing.VTB.OpenwayVTBCard;
import settings.BaseTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Profile")

public class CardProfileTest extends BaseTest {

    static WebDriver driver = new ChromeDriver();
    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chromedriver", "C:\\soft\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver.get("https://ift-ibrb1-sharing.vtb.ru/login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Tag("POSTIVE")
    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonOplatit();
    }

    @Test
    @Order(4)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.openPageInformation();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonUsecard();
    }

    @Test
    @Order(6)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonMakeVipyska();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonMakeSpravka();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Ваш беспроцентный период")
    public void checkButtonNotPayPercent() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonNotPayPercent();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Отчет о процентах")
    public void checkButtonPercentReport() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonPercentReport();
    }

    @Test
    @Order(10)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.openPageSettings();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonChangeLimit();
    }
    @Test
    @Order(12)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonChangePin() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonChangePin();
    }
    @Test
    @Order(13)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonChangeBlock();
    }
    @Test
    @Order(14)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonRecomend();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonRefinanc();
    }

    @Test
    @Order(16)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageHistoryOperation();
    }

    @Test
    @Order(17)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.pageRassrochki();
    }

    @Order(18)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.clickTabDebt();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccGrace();
    }

    @Order(20)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccDebt();
    }

    @Order(21)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccCredLim();
    }

    @Order(22)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkAccTarrifs();
    }

    @Order(23)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты в подвале")
    public void checkButtonCardNumberFooter() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonCardNumberFooter();
    }

    @Order(24)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты вверху страницы")
    public void checkButtonCardNumberHeader() throws InterruptedException {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkButtonCardNumberHeader();
    }
/*    @Order(25)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.clickTabReqv();
    }*/

 /*   @Order(25)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        OpenwayVTBCard openwayVTBCard = new OpenwayVTBCard(driver);
        openwayVTBCard.clickTabReqv();
    }

    @Order(26)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        CardProfile cardProfile = new CardProfile(driver);
        cardProfile.checkTabRekv();
    }*/

    @AfterAll
    @Test
    public static void quit(){
        driver.quit();
    }
}
