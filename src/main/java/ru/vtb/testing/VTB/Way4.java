package ru.vtb.testing.VTB;

/*Created by Stanislav Silkov */

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.Constants;

public class Way4 extends Constants {
    public WebDriver driver;

    public Way4(WebDriver driver) {
        this.driver = driver;
    }

    private final By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    private final By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    private final By fieldPassword = By.xpath("//input[@type=\"password\"]");
    private final By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    private final By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    private final By buttonPopolnit = By.xpath("//button[text()=\"Пополнить\"]");
    private final By buttonOplatit = By.xpath("//button[text()=\"Оплатить\"]");
    private final By pageInformation = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[1]/div");
    private final By pageSettings = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    private final By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    private final By pageHowUseCard = By.xpath("//div[text()=\"Как пользоваться картой\"]");

    private final By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    private final By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    private final By buttonNotPayPercent = By.xpath("//*[text()=\"Ваш беспроцентный период\"]");
    private final By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    private final By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    private final By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    private final By buttonRecomend = By.xpath("//*[text()=\"Рекомендовать карту\"]");
    private final By buttonRefinanc = By.xpath("//*[text()=\"Рефинансирование\"]");
    private final By buttonAdditionalCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");


    private final By tabDebt = By.xpath("//button[text()=\"Задолженность\"]");

    private final By accMinAmount = By.xpath("//p[text()=\"Минимальный платеж\"]");
    private final By accGrace = By.xpath("//p[text()=\"Беспроцентный период\"]");
    private final By accDebt = By.xpath("//div[@class=\"sc-pIldA MainTitle__StyledHeader-sc-nvqspm-0 diKCst\"]//p[text()=\"Общая задолженность\"][1]");
    private final By accCredLim = By.xpath("//p[text()=\"Кредитный лимит\"]");
    private final By accTarrifs = By.xpath("//p[text()=\"Тарифы и условия\"]");

    private final By footerButtonDownLoad = By.xpath("//p[text()=\"Сохранить\"]");
    private final By footerButtonSend = By.xpath("//p[text()=\"Отправить по email\"]");
    private final By footerButtonPrint = By.xpath("//p[text()=\"Печать\"]");

    private final By tabRekvizits = By.xpath("//button[text()=\"Реквизиты\"]");
    private final By titleRekvAcc = By.xpath("//*[text()=\"Реквизиты счета • 0009\"]");
    private final By fieldBankName = By.xpath("//*[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//*[text()=\"БИК банка получателя\"]");
    private final By fieldINN = By.xpath("//*[text()=\"ИНН банка получателя\"]");
    private final By fieldKPP = By.xpath("//*[text()=\"КПП банка получателя\"]");
    private final By fieldKS = By.xpath("//*[text()=\"К/С банка получателя\"]");
    private final By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
    private final By fieldAccountNumber= By.xpath("//*[text()=\"Счет получателя в банке получателя\"]");
    private final By fieldReasonPayment = By.xpath("//*[text()=\"Назначение платежа\"]");

    private final By titleRekvCard = By.xpath("//*[text()=\"Реквизиты карты • 8488\"]");
    private final By fieldName = By.xpath("//span[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//span[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//span[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//span[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//span[text()=\"Статус карты\"]");

    private final By buttonMore = By.xpath("//button[@data-test-id=\"productactions_button\"]");
    private final By buttonHowUseCard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    private final By buttonGiveAndPay = By.xpath("//*[text()=\"Перевести и Оплатить\"]");
    private final By buttonBlockCard = By.xpath("//*[text()=\"Заблокировать\"]");
    private final By buttonTabDebt = By.xpath("//*[text()=\"Задолженность\"]");
    private final By buttonTurnCreHoliday = By.xpath("//*[text()=\"Подключить кредитные каникулы\"]");
    private final By buttonMakeDoc = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonOrderCert = By.xpath("//*[text()=\"Заказать справку\"]");


    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncWay4);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/F406162507C74167BFB0130B587F964B");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncWay4);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(5000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/F406162507C74167BFB0130B587F964B");
        Thread.sleep(2000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkButtonOplatit() {
        driver.findElement(buttonOplatit).isDisplayed();
    }


    public void openPageInformation() {
        driver.findElement(pageInformation).click();
        WebElement information = driver.findElement(By.xpath("//p[text()=\"Информация о карте\"]"));
        Assertions.assertTrue(information.getText().equals("Информация о карте"));
    }

    public void checkButtonUsecard() {
        driver.findElement(buttonHowUsecard).isEnabled();
    }

    public void checkButtonNotPayPercent() {
        driver.findElement(buttonNotPayPercent).isEnabled();
    }

    public void checkButtonMakeVipyska() {
        driver.findElement(buttonMakeVipyska).isEnabled();
    }

    public void checkButtonMakeSpravka() throws InterruptedException {
        driver.findElement(buttonMakeSpravka).isEnabled();
        driver.navigate().back();
        Thread.sleep(1000);
    }

    public void openPageSettings() {
        driver.findElement(pageSettings).click();
    }

    public void checkButtonChangeLimit() {
        driver.findElement(buttonChangeLimit).isEnabled();
    }

    public void checkButtonRecomend() {
        driver.findElement(buttonRecomend).isEnabled();
    }
    public void checkButtonChangePin() {
        driver.findElement(buttonChangePin).isEnabled();
    }

    public void checkButtonChangeBlock() {
        driver.findElement(buttonBlock).isEnabled();

    }
    public void checkButtonRefinanc() {
        driver.findElement(buttonRefinanc).isEnabled();
    }
    public void checkButtonAdditionalCard() {
        driver.findElement(buttonAdditionalCard).isEnabled();
        driver.navigate().back();
    }

    public void pageHistoryOperation() {
        driver.findElement(pageHistoryOperation).isDisplayed();
    }

    public void pageHowUseCard() {
        driver.findElement(pageHowUseCard).isDisplayed();
    }

    public void clickTabDebt() {
        driver.findElement(tabDebt).isDisplayed();
    }

    public void checkAccMinAmount() {
        driver.findElement(accMinAmount).click();
    }

    public void checkAccGrace() {
        driver.findElement(accGrace).click();
    }

    public void checkAccDebt() {
        driver.findElement(accDebt).click();
    }

    public void checkAccCredLim() {
        driver.findElement(accCredLim).click();
    }

    public void checkAccTarrifs() throws InterruptedException {
        driver.findElement(accTarrifs).click();
        Thread.sleep(2000);
    }

    public void clickTabReqv(){
        driver.findElement(tabRekvizits).click();
    }

    public void checkTabRekv(){
        driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        driver.findElement(titleRekvCard).isDisplayed();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void clickTabRequisites() {
        driver.findElement(tabRekvizits).click();
    }

    public void checkFieldsTabsRequisites(){
        driver.findElement(titleRekvAcc).isEnabled();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();
        driver.findElement(fieldReasonPayment).isDisplayed();

        driver.findElement(titleRekvCard).isEnabled();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void checkButtonsRekv(){
        driver.findElement(footerButtonDownLoad).isDisplayed();
        driver.findElement(footerButtonSend).isDisplayed();
        driver.findElement(footerButtonPrint).isDisplayed();
    }

    public void bestButtonMore(){
        driver.findElement(buttonMore).click();
    }

    public void checkMenuMore(){
        driver.findElement(buttonHowUseCard).isDisplayed();
        driver.findElement(buttonGiveAndPay).isDisplayed();
        driver.findElement(buttonChangePin).isEnabled();
        driver.findElement(buttonBlockCard).isEnabled();
        driver.findElement(buttonTabDebt).isDisplayed();
        //driver.findElement(buttonChangeLimit).isDisplayed();
        driver.findElement(buttonMakeDoc).isDisplayed();
        driver.findElement(buttonOrderCert).isDisplayed();
        //driver.findElement(buttonTurnCreHoliday).isDisplayed();
    }

    public void clickButtonHowUseCard() {
        driver.findElement(buttonHowUseCard).click();
    }
}
