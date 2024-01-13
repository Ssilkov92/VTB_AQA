package VTBTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CardProfilePage;
import settings.BaseSeleniumTest;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Profile")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CardProfileTest extends BaseSeleniumTest {

    public static CardProfilePage cardProfilePage = new CardProfilePage();

    @Tag("POSTIVE")
    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void auth() throws InterruptedException {
        cardProfilePage.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        cardProfilePage.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Открыть переименование")
    public void checkButtonOpenRename() {
        cardProfilePage.checkOpenRename();
    }

    @Test
    @Order(4)
    @DisplayName("Закрыть переименование")
    public void checkButtonCloseRename() {
        cardProfilePage.checkCloseRename();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        cardProfilePage.checkButtonOplatit();
    }

    @Test
    @Order(6)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() {
        cardProfilePage.openPageInformation();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        cardProfilePage.checkButtonUsecard();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Задолженность")
    public void checkButtonDebt() throws InterruptedException {
        cardProfilePage.checkButtonDebt();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Реквизиты")
    public void checkButtonReqv() throws InterruptedException {
        cardProfilePage.checkButtonRequis();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        cardProfilePage.checkButtonMakeVipyska();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        cardProfilePage.checkButtonMakeSpravka();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Ваш беспроцентный период")
    public void checkButtonNotPayPercent() throws InterruptedException {
        cardProfilePage.checkButtonNotPayPercent();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки Отчет о процентах")
    public void checkButtonPercentReport() throws InterruptedException {

        cardProfilePage.checkButtonPercentReport();
    }

    @Test
    @Order(14)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {

        cardProfilePage.openPageSettings();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        cardProfilePage.checkButtonChangeLimit();
    }

    @Test
    @Order(16)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonChangePin() {
        cardProfilePage.checkButtonChangePin();
    }

    @Test
    @Order(17)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        cardProfilePage.checkButtonBlock();

    }

    @Test
    @Order(18)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        cardProfilePage.checkButtonRecomend();
    }

    @Test
    @Order(19)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        cardProfilePage.checkButtonRefinanc();
    }

    @Test
    @Order(20)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        cardProfilePage.pageHistoryOperation();
    }

    @Test
    @Order(21)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        cardProfilePage.pageRassrochki();
    }

    @Order(22)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        cardProfilePage.clickTabDebt();
    }

    @Order(23)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        cardProfilePage.checkAccGrace();
    }

    @Order(24)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        cardProfilePage.checkAccDebt();
    }

    @Order(25)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        cardProfilePage.checkAccCredLim();
    }

    @Order(26)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccMinAmm() {
        cardProfilePage.checkAccMinAmount();
    }

    @Order(27)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        cardProfilePage.checkAccTarrifs();
    }

    @Order(28)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты в подвале")
    public void checkButtonCardNumberFooter() throws InterruptedException {
        cardProfilePage.checkButtonCardNumberFooter();
    }

    @Order(29)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты вверху страницы")
    public void checkButtonCardNumberHeader() throws InterruptedException {
        cardProfilePage.checkButtonCardNumberHeader();
    }

    @Order(30)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        cardProfilePage.clickTabReqv();
    }

    @Order(31)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        cardProfilePage.checkTabRekv();
    }
}
