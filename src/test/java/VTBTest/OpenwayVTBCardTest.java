package VTBTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import pages.OpenwayVTBCardPage;
import settings.BaseSeleniumTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Openway_VTB")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenwayVTBCardTest extends BaseSeleniumTest {

    public static OpenwayVTBCardPage openwayVTBCardPage = new OpenwayVTBCardPage();

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void auth() throws InterruptedException {
        openwayVTBCardPage.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Наличие кнопки Пополнить")
    public void checkButtonPopolnit() {
        openwayVTBCardPage.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Открыть переименование")
    public void checkButtonOpenRename() {
        openwayVTBCardPage.checkOpenRename();
    }

    @Test
    @Order(4)
    @DisplayName("Закрыть переименование")
    public void checkButtonCloseRename() {
        openwayVTBCardPage.checkCloseRename();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        openwayVTBCardPage.checkButtonOplatit();
    }

    @Test
    @Order(6)
    @DisplayName("Переход в блок \"О карте\"")
    public void clickPageInformation() {
        openwayVTBCardPage.openPageInformation();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        openwayVTBCardPage.checkButtonUsecard();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Задолженность")
    public void checkButtonDebt() throws InterruptedException {
        openwayVTBCardPage.checkButtonDebt();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Реквизиты")
    public void checkButtonReqv() throws InterruptedException {
        openwayVTBCardPage.checkButtonRequis();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        openwayVTBCardPage.checkButtonMakeVipyska();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        openwayVTBCardPage.checkButtonMakeSpravka();
    }

    @Test
    @Order(12)
    @DisplayName("Переход в блок Настройки")
    public void openPageSettings() {
        openwayVTBCardPage.openPageSettings();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonhangePin() {
        openwayVTBCardPage.checkButtonhangePin();
    }

    @Test
    @Order(14)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        openwayVTBCardPage.checkButtonChangeLimit();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        openwayVTBCardPage.checkButtonChangeBlock();
    }

    @Test
    @Order(16)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        openwayVTBCardPage.checkButtonRecomend();
    }

    @Test
    @Order(17)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        openwayVTBCardPage.pageHistoryOperation();
    }

    @Test
    @Order(18)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        openwayVTBCardPage.pageRassrochki();
    }

    @Order(19)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        openwayVTBCardPage.clickTabDebt();
    }

    @Order(20)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        openwayVTBCardPage.checkAccGrace();
    }

    @Order(21)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        openwayVTBCardPage.checkAccDebt();
    }


    @Order(22)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        openwayVTBCardPage.checkAccCredLim();
    }

    @Order(23)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        openwayVTBCardPage.checkAccTarrifs();
    }

    @Order(24)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        openwayVTBCardPage.clickTabReqv();
    }

    @Order(25)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        openwayVTBCardPage.checkTabRekv();
    }

    @Order(26)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты в подвале")
    public void checkButtonCardNumberFooter() throws InterruptedException {
        openwayVTBCardPage.checkButtonCardNumberFooter();
    }

    @Order(27)
    @Test
    @DisplayName("Проверка кнопки Показать номер карты вверху страницы")
    public void checkButtonCardNumberHeader() throws InterruptedException {
        openwayVTBCardPage.checkButtonCardNumberHeader();
    }
}
