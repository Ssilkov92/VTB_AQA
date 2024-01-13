package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;
import settings.Constants;

import static locators.AccountProfileLocators.buttonCloseRenamePr;
import static locators.CardProfileLocators.titleRekvAcc;
import static locators.CardProfileLocators.titleRekvCard;
import static locators.CommonLocators.*;
import static locators.CardProfileLocators.*;
import static settings.Constants.password;
import static settings.Constants.uncProfileCard;

public class CardProfilePage extends BaseSeleniumPage {

    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncProfileCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/39C0F15933BC480C8699577B2DC069C9");
        Thread.sleep(3000);
    }
    public void Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncProfileCard);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/39C0F15933BC480C8699577B2DC069C9");
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

    public void checkButtonDebt() {
        driver.findElement(buttonTabDebt).isDisplayed();
    }

    public void checkButtonRequis() {
        driver.findElement(buttonTabRequis).isDisplayed();
    }

    public void checkButtonNotPayPercent() {
        driver.findElement(buttonNotPayPercent).isEnabled();
    }

    public void checkButtonMakeVipyska() {
        driver.findElement(buttonMakeVipyska).isEnabled();
    }

    public void checkButtonMakeSpravka()  {
        driver.findElement(buttonMakeSpravka).isEnabled();
    }
    public void checkButtonPercentReport() throws InterruptedException {
        driver.findElement(buttonPercentReport).isEnabled();
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

    public void checkButtonBlock() {
        driver.findElement(buttonBlock).isEnabled();

    }
    public void checkButtonRefinanc() {
        driver.findElement(buttonRefinanc).isEnabled();
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

    public void checkAccMinAmount() {
        driver.findElement(accMinAmount).isDisplayed();
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
        driver.findElement(accTarrifs).click();
        Thread.sleep(2000);
    }

    public void checkButtonCardNumberFooter(){
        driver.findElement(ButtonCardNumberFooter).isDisplayed();
    }

    public void checkButtonCardNumberHeader() {
        driver.findElement(ButtonCardNumberHeader).isDisplayed();
    }

    public void clickTabReqv() {
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
