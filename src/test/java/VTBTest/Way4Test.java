package VTBTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import pages.Way4Page;
import settings.BaseSeleniumTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Карта Openway")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Way4Test extends BaseSeleniumTest {

    public static Way4Page way4Page = new Way4Page();

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void a() throws InterruptedException {
        way4Page.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() throws InterruptedException {
        way4Page.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Открыть переименование")
    public void checkButtonOpenRename() {
        way4Page.checkOpenRename();
    }

    @Test
    @Order(4)
    @DisplayName("Закрыть переименование")
    public void checkButtonCloseRename() {
        way4Page.checkCloseRename();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        way4Page.checkButtonOplatit();
    }

    @Test
    @Order(6)
    @DisplayName("Раздел Информация")
    public void checkPageInformation() throws InterruptedException {
        way4Page.openPageInformation();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        way4Page.checkButtonUsecard();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Отчёт о процентах")
    public void checkButtonPercentReport() {
        way4Page.checkButtonPercentReport();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        way4Page.checkButtonMakeVipyska();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Задолженность")
    public void checkButtonDebt() {
        way4Page.checkButtonDebt();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Реквизиты")
    public void checkButtonReqius() {
        way4Page.checkButtonRequis();
    }

    @Test
    @Order(12)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        way4Page.checkButtonMakeSpravka();
    }

    @Test
    @Order(13)
    @DisplayName("Переход в раздел Настройки")
    public void checkPageSettings() {
        way4Page.openPageSettings();
    }

    @Test
    @Order(14)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        way4Page.checkButtonChangeLimit();
    }

    @Test
    @Order(15)
    @DisplayName("Наличие кнопки сменить пин-код")
    public void checkButtonChangePin() {
        way4Page.checkButtonChangePin();
    }

    @Test
    @Order(16)
    @DisplayName("Наличие кнопки Заблокировать")
    public void checkButtonBlock() {
        way4Page.checkButtonChangeBlock();
    }

    @Test
    @Order(17)
    @DisplayName("Наличие кнопки Рекомендовать карту")
    public void checkButtonRecomend() {
        way4Page.checkButtonRecomend();
    }

    @Test
    @Order(18)
    @DisplayName("Наличие кнопки Рефинансирование")
    public void checkButtonRefinanc() {
        way4Page.checkButtonRefinanc();
    }

    @Test
    @Order(19)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        way4Page.checkButtonAdditionalCard();
    }

    @Test
    @Order(20)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        way4Page.pageHistoryOperation();
    }

    @Test
    @Order(21)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageHowUseCard() {
        way4Page.pageHowUseCard();
    }

    @Order(22)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        way4Page.clickTabDebt();
    }

    @Order(23)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        way4Page.checkAccGrace();
    }

    @Order(24)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        way4Page.checkAccDebt();
    }

    @Order(25)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        way4Page.checkAccCredLim();
    }

    @Order(26)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs(){
        way4Page.checkAccTarrifs();
    }

    @Order(27)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        way4Page.clickTabReqv();
    }

    @Order(28)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        way4Page.checkTabRekv();
    }
}
