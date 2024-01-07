package ru.vtb.testing.VTB;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.Constants;

public class OpenwayVTBAccount extends Constants {
    public WebDriver driver;

    public OpenwayVTBAccount(WebDriver driver) {
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
    private final By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    private final By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    private final By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    private final By pageSettings = By.xpath("//html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    private final By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    private final By buttonAdditionalCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");
    private final By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    private final By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");

    private final By tabDebt = By.xpath("//button[text()=\"Задолженность\"]");

    private final By accMinAmount = By.xpath("//p[text()=\"Минимальный платеж\"]");
    private final By accGrace = By.xpath("//p[text()=\"Беспроцентный период\"]");
    private final By accDebt = By.xpath("//div[@class=\"sc-pIldA MainTitle__StyledHeader-sc-nvqspm-0 diKCst\"]//p[text()=\"Общая задолженность\"][1]");
    private final By accCredLim = By.xpath("//p[text()=\"Кредитный лимит\"]");
    private final By accTarrifs = By.xpath("//p[text()=\"Тарифы и условия\"]");

    private final By tabRekvizits = By.xpath("//*[text()=\"Реквизиты\"]");
    private final By titleRekvAcc = By.xpath("//p[text()=\"Реквизиты счета • 6017\"]");
    private final By fieldBankName = By.xpath("//p[text()=\"Наименование банка получателя\"]");
    private final By fieldBIK = By.xpath("//*[text()=\"044525745\"]");
    private final By fieldINN = By.xpath("//*[text()=\"7702070139\"]");
    private final By fieldKPP = By.xpath("//*[text()=\"770943003\"]");
    private final By fieldKS = By.xpath("//*[text()=\"30101810345250000745\"]");
    private final By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
    private final By fieldAccountNumber = By.xpath("//*[text()=\"Счет получателя в банке получателя\"]");
    private final By titleRekvCard = By.xpath("//p[text()=\"Реквизиты карты • 0639\"]");
    private final By fieldName = By.xpath("//p[text()=\"Название карты\"]");
    private final By fieldNumber = By.xpath("//*[text()=\"Номер карты\"]");
    private final By fieldData = By.xpath("//*[text()=\"Срок действия\"]");
    private final By fieldOwner = By.xpath("//*[text()=\"Владелец карты\"]");
    private final By fieldStatus = By.xpath("//*[text()=\"Статус карты\"]");

    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncOpenWayAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(3000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/B1D333CCCC0642C1B11BCE1F696F8D0A");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncOpenWayAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(6000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/B1D333CCCC0642C1B11BCE1F696F8D0A");
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
        WebElement information = driver.findElement(By.xpath("//p[text()=\"Информация о счете\"]"));
        Assertions.assertTrue(information.getText().equals("Информация о счете"));
    }

    public void checkButtonUsecard() {
        driver.findElement(buttonHowUsecard).isEnabled();
    }

    public void checkButtonMakeVipyska() {
        driver.findElement(buttonMakeVipyska).isEnabled();
    }

    public void checkButtonMakeSpravka() throws InterruptedException {
        driver.findElement(buttonMakeSpravka).isEnabled();
        driver.navigate().back();
        Thread.sleep(1000);
    }

    public void openPageSettings(){
        driver.findElement(pageSettings).click();
        WebElement settings = driver.findElement(By.xpath("//p[text()=\"Настройки счета\"]"));
        Assertions.assertTrue(settings.getText().equals("Настройки счета"));
    }

    public void checkButtonChangeLimit() {
        driver.findElement(buttonChangeLimit).isEnabled();

    }

    public void checkButtonAdditionalCard() {
        driver.findElement(buttonAdditionalCard).isEnabled();
        driver.navigate().back();
    }

    public void pageHistoryOperation() {
        driver.findElement(pageHistoryOperation).isDisplayed();
    }

    public void pageRassrochki() {
        driver.findElement(pageRassrochki).isDisplayed();
    }

    public void clickTabDebt() {
        driver.findElement(tabDebt).isDisplayed();
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
}
