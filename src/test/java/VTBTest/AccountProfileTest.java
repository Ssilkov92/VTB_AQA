package VTBTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import pages.AccountProfilePage;
import settings.BaseSeleniumTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Счёт Profile")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AccountProfileTest extends BaseSeleniumTest {

    public static AccountProfilePage accountProfilePage = new AccountProfilePage();

    @Test
    @Order(1)
    @DisplayName("Кнопка Логин при авторизации")
    public void a() throws InterruptedException {
        accountProfilePage.Authorization2(); //обращаемся к этому методу
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        accountProfilePage.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Открыть переименование")
    public void checkButtonOpenRename() {
        accountProfilePage.checkOpenRename();
    }

    @Test
    @Order(4)
    @DisplayName("Закрыть переименование")
    public void checkButtonCloseRename() {
        accountProfilePage.checkCloseRename();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        accountProfilePage.checkButtonOplatit();
    }

    @Test
    @Order(6)
    @DisplayName("Переход в блок \"О cчете\"")
    public void clickPageInformation() {
        accountProfilePage.openPageInformation();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        accountProfilePage.checkButtonUsecard();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        accountProfilePage.checkButtonMakeVipyska();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() {
        accountProfilePage.checkButtonMakeSpravka();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Ваш беспроцентный период")
    public void checkButtonNotPayPercent() throws InterruptedException {
        accountProfilePage.checkButtonNotPayPercent();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Задолженность")
    public void checkButtonDebt(){
        accountProfilePage.checkButtonDebt();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Реквизиты")
    public void checkButtonReqv() {
        accountProfilePage.checkButtonRequis();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки Отчет о процентах")
    public void checkButtonPercentReport() throws InterruptedException {
        accountProfilePage.checkButtonPercentReport();
    }

    @Test
    @Order(14)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {
        accountProfilePage.openPageSettings();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        accountProfilePage.checkButtonChangeLimit();
    }

    @Test
    @Order(16)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        accountProfilePage.checkButtonRecomend();
    }

    @Test
    @Order(17)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        accountProfilePage.checkButtonRefinanc();
    }

    @Test
    @Order(18)
    @DisplayName("Наличие кнопки Оформить страховку")
    public void checkButtonInsurance() {
        accountProfilePage.checkButtonInsurance();
    }

    @Test
    @Order(19)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        accountProfilePage.checkButtonAdditionalCard();
    }

    @Test
    @Order(20)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        accountProfilePage.pageHistoryOperation();
    }

    @Test
    @Order(21)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        accountProfilePage.pageRassrochki();
    }

    @Order(22)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        accountProfilePage.clickTabDebt();
    }

    @Order(23)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccMinAmount() {
        accountProfilePage.checkAccMinAmount();
    }

    @Order(24)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        accountProfilePage.checkAccGrace();
    }

    @Order(25)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        accountProfilePage.checkAccDebt();
    }

    @Order(26)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        accountProfilePage.checkAccCredLim();
    }

    @Order(27)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        accountProfilePage.checkAccTarrifs();
    }

    @Order(28)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        accountProfilePage.clickTabReqv();
    }

    @Order(29)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        accountProfilePage.checkTabRekv();
    }
}
