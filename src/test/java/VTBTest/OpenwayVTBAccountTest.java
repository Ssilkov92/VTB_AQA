package VTBTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import pages.OpenwayVTBAccountPage;
import settings.BaseSeleniumTest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Cчёт OpenwayVTB")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OpenwayVTBAccountTest extends BaseSeleniumTest {

    public static OpenwayVTBAccountPage openwayVTBAccountPage = new OpenwayVTBAccountPage();

    @Test
    @Order(1)
    @DisplayName("Авторизация")
    public void auth() throws InterruptedException {
        openwayVTBAccountPage.Authorization2();
    }

    @Test
    @Order(2)
    @DisplayName("Отображение кнопки Пополнить")
    public void checkButtonPopolnit() {
        openwayVTBAccountPage.checkButtonPopolnit();
    }

    @Test
    @Order(3)
    @DisplayName("Открыть переименование")
    public void checkButtonOpenRename() {
        openwayVTBAccountPage.checkOpenRename();
    }

    @Test
    @Order(4)
    @DisplayName("Закрыть переименование")
    public void checkButtonCloseRename() {
        openwayVTBAccountPage.checkCloseRename();
    }

    @Test
    @Order(5)
    @DisplayName("Наличие кнопки Оплатить")
    public void checkButtonOplatit() {
        openwayVTBAccountPage.checkButtonOplatit();
    }

    @Test
    @Order(6)
    @DisplayName("Переход в блок \"О cчете\"")
    public void clickPageInformation() {
        openwayVTBAccountPage.openPageInformation();
    }

    @Test
    @Order(7)
    @DisplayName("Наличие кнопки Как пользоваться картой")
    public void checkButtonUsecard() {
        openwayVTBAccountPage.checkButtonUsecard();
    }

    @Test
    @Order(8)
    @DisplayName("Наличие кнопки Задолженность")
    public void checkButtonDebt(){
        openwayVTBAccountPage.checkButtonDebt();
    }

    @Test
    @Order(9)
    @DisplayName("Наличие кнопки Реквизиты")
    public void checkButtonReqv() {
        openwayVTBAccountPage.checkButtonRequis();
    }

    @Test
    @Order(10)
    @DisplayName("Наличие кнопки Сформировать выписку")
    public void checkButtonMakeVipyska() {
        openwayVTBAccountPage.checkButtonMakeVipyska();
    }

    @Test
    @Order(11)
    @DisplayName("Наличие кнопки Заказать справку")
    public void checkButtonMakeSpravka() throws InterruptedException {
        openwayVTBAccountPage.checkButtonMakeSpravka();
    }

    @Test
    @Order(12)
    @DisplayName("Раздел Настройки")
    public void checkPageSettings() {
        openwayVTBAccountPage.openPageSettings();
    }

    @Test
    @Order(13)
    @DisplayName("Наличие кнопки выпуска доп карты")
    public void checkButtonAdditionalCard() {
        openwayVTBAccountPage.checkButtonAdditionalCard();
    }

    @Test
    @Order(14)
    @DisplayName("Наличие кнопки Изменить лимит")
    public void checkButtonChangeLimit() {
        openwayVTBAccountPage.checkButtonChangeLimit();
    }

    @Test
    @Order(15)
    @DisplayName("Раздел История операций")
    public void checkPageHistoryOperation() {
        openwayVTBAccountPage.pageHistoryOperation();
    }

    @Test
    @Order(16)
    @DisplayName("Раздел Оформленные рассрочки")
    public void checkpageRassrochki() {
        openwayVTBAccountPage.pageRassrochki();
    }

    @Order(17)
    @Test
    @DisplayName("Проверка вкладки Задолженность")
    public void checkTabDebt() {
        openwayVTBAccountPage.clickTabDebt();
    }

    @Order(18)
    @Test
    @DisplayName("Наличие и клик блока Грейс период")
    public void checkAccGrace() {
        openwayVTBAccountPage.checkAccGrace();
    }

    @Order(19)
    @Test
    @DisplayName("Наличие и клик блока Задолженность")
    public void checkAccDebt() {
        openwayVTBAccountPage.checkAccDebt();
    }

    @Order(20)
    @Test
    @DisplayName("Наличие и клик блока Кредитный лимит")
    public void checkAccCredLim() {
        openwayVTBAccountPage.checkAccCredLim();
    }

    @Order(21)
    @Test
    @DisplayName("Наличие и клик блока Тарифы")
    public void checkAccTarrifs() throws InterruptedException {
        openwayVTBAccountPage.checkAccTarrifs();
    }
 @Order(22)
    @Test
    @DisplayName("Переход в Реквизиты")
    public void clickTabReqv() {
        openwayVTBAccountPage.clickTabReqv();
    }

    @Order(23)
    @Test
    @DisplayName("Содержимое вкладки Реквизиты")
    public void checkTabReqv() {
        openwayVTBAccountPage.checkTabRekv();
    }
}
