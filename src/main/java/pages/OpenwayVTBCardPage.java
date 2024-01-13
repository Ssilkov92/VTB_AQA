package pages;

import locators.CardProfileLocators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;
import settings.BaseSeleniumTest;
import settings.Constants;

import static locators.CardOpenwayVTBLocators.titleRekvAccPrC;
import static locators.CardOpenwayVTBLocators.titleRekvCardPrC;
import static locators.CardProfileLocators.*;
import static locators.CommonLocators.*;
import static locators.CommonLocators.buttonLogin;
import static locators.CommonLocators.buttonOpenRename;
import static locators.CommonLocators.buttonTabDebt;
import static locators.CommonLocators.buttonTabRequis;
import static locators.CommonLocators.buttonVoyti;
import static locators.CommonLocators.fieldLogin;
import static locators.CommonLocators.fieldPassword;
import static locators.CommonLocators.smsCodeField;
import static settings.Constants.password;
import static settings.Constants.uncOpenWayAccount;
import static settings.Constants.uncOpenWayCard;

public class OpenwayVTBCardPage extends BaseSeleniumPage {

    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncOpenWayCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/B1D333CCCC0642C1B11BCE1F696F8D0A");
        Thread.sleep(3000);
    }

    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncOpenWayCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/2163ED045FB24661B41C20397F527EAB");
        Thread.sleep(2000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkOpenRename() {
        driver.findElement(buttonOpenRename).click();
    }

    public void checkCloseRename() {
        driver.findElement(buttonCloseRenameCPr).click();
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

    public void checkButtonMakeVipyska() {
        driver.findElement(buttonMakeVipyska).isEnabled();
    }

    public void checkButtonDebt() {
        driver.findElement(buttonTabDebt).isDisplayed();
    }

    public void checkButtonRequis() {
        driver.findElement(buttonTabRequis).isDisplayed();
    }

    public void checkButtonMakeSpravka() throws InterruptedException {
        driver.findElement(buttonMakeSpravka).isEnabled();
        driver.navigate().back();
        Thread.sleep(1000);
    }

    public void openPageSettings() {
        driver.findElement(pageSettings).click();
        WebElement settings = driver.findElement(By.xpath("//p[text()=\"Настройки карты\"]"));
        Assertions.assertTrue(settings.getText().equals("Настройки карты"));
    }

    public void checkButtonhangePin() {
        driver.findElement(buttonChangePin).isEnabled();
    }

    public void checkButtonChangeBlock() {
        driver.findElement(buttonBlock).isEnabled();
    }

    public void checkButtonChangeLimit() {
        driver.findElement(buttonChangeLimit).isEnabled();
    }

    public void checkButtonRecomend() {
        driver.findElement(buttonRecomend).isEnabled();
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
        driver.findElement(accGrace).isDisplayed();
    }

    public void checkAccDebt() {
        driver.findElement(accDebt).isDisplayed();
    }

    public void checkAccCredLim() {
        driver.findElement(accCredLim).isDisplayed();
    }

    public void checkAccTarrifs() throws InterruptedException {
        driver.findElement(accTarrifs);
        Thread.sleep(1000);
    }

    public void clickTabReqv() {
        driver.findElement(tabRekvizits).click();
    }

    public void checkTabRekv() {
        driver.findElement(titleRekvAccPrC).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        driver.findElement(titleRekvCardPrC).isDisplayed();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }

    public void checkButtonCardNumberFooter() {
        driver.findElement(ButtonCardNumberFooter).isDisplayed();
    }

    public void checkButtonCardNumberHeader() {
        driver.findElement(ButtonCardNumberHeader).isDisplayed();
    }
}