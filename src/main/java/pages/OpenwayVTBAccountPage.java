package pages;

import locators.AccountOpenwayVTBLocators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;

import static locators.AccountOpenwayVTBLocators.buttonAdditionalCard;
import static locators.AccountOpenwayVTBLocators.buttonChangeLimit;
import static locators.AccountOpenwayVTBLocators.buttonHowUsecard;
import static locators.AccountOpenwayVTBLocators.buttonMakeSpravka;
import static locators.AccountOpenwayVTBLocators.buttonMakeVipyska;
import static locators.AccountOpenwayVTBLocators.pageHistoryOperation;
import static locators.AccountOpenwayVTBLocators.pageRassrochki;
import static locators.AccountOpenwayVTBLocators.pageSettings;
import static locators.AccountOpenwayVTBLocators.titleRekvAcc;
import static locators.AccountProfileLocators.buttonCloseRenamePr;
import static locators.AccountProfileLocators.titleRekvCard;
import static locators.CommonLocators.accCredLim;
import static locators.CommonLocators.accDebt;
import static locators.CommonLocators.accGrace;
import static locators.CommonLocators.accTarrifs;
import static locators.CommonLocators.buttonLogin;
import static locators.CommonLocators.buttonOpenRename;
import static locators.CommonLocators.buttonOplatit;
import static locators.CommonLocators.buttonPopolnit;
import static locators.CommonLocators.buttonTabDebt;
import static locators.CommonLocators.buttonTabRequis;
import static locators.CommonLocators.buttonVoyti;
import static locators.CommonLocators.fieldAccountNumber;
import static locators.CommonLocators.fieldBIK;
import static locators.CommonLocators.fieldBankName;
import static locators.CommonLocators.fieldCardHolder;
import static locators.CommonLocators.fieldData;
import static locators.CommonLocators.fieldINN;
import static locators.CommonLocators.fieldKPP;
import static locators.CommonLocators.fieldKS;
import static locators.CommonLocators.fieldLogin;
import static locators.CommonLocators.fieldName;
import static locators.CommonLocators.fieldNumber;
import static locators.CommonLocators.fieldOwner;
import static locators.CommonLocators.fieldPassword;
import static locators.CommonLocators.fieldStatus;
import static locators.CommonLocators.smsCodeField;
import static locators.CommonLocators.tabDebt;
import static locators.CommonLocators.tabRekvizits;
import static settings.Constants.password;
import static settings.Constants.uncOpenWayAccount;

public class OpenwayVTBAccountPage extends BaseSeleniumPage {

    By blockAboutAccount = By.xpath("//a[@aria-label=\"О счете, Задолженность, справки, отчеты\"]");

    public void Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncOpenWayAccount);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(7000);
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
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/LoanCardAccount/B1D333CCCC0642C1B11BCE1F696F8D0A");
        Thread.sleep(2000);
    }

    public void checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
    }

    public void checkOpenRename() {
        driver.findElement(buttonOpenRename).click();
    }

    public void checkCloseRename() {
        driver.findElement(buttonCloseRenamePr).click();
    }

    public void checkButtonOplatit() {
        driver.findElement(buttonOplatit).isDisplayed();
    }

    public void openPageInformation() {
        driver.findElement(blockAboutAccount).click();
        WebElement information = driver.findElement(By.xpath("//p[text()=\"Информация о счете\"]"));
        Assertions.assertTrue(information.getText().equals("Информация о счете"));
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
        driver.findElement(accGrace).isDisplayed();
    }

    public void checkAccDebt() {
        driver.findElement(accDebt).isDisplayed();
    }

    public void checkAccCredLim() {
        driver.findElement(accCredLim).isDisplayed();
    }

    public void checkAccTarrifs() throws InterruptedException {
        driver.findElement(accTarrifs).isDisplayed();
        Thread.sleep(1000);
    }

    public void clickTabReqv() {
        driver.findElement(tabRekvizits).click();
    }

    public void checkTabRekv() {
        driver.findElement(titleRekvAcc).isDisplayed();
        driver.findElement(fieldBankName).isDisplayed();
        driver.findElement(fieldBIK).isDisplayed();
        driver.findElement(fieldINN).isDisplayed();
        driver.findElement(fieldKPP).isDisplayed();
        driver.findElement(fieldKS).isDisplayed();
        driver.findElement(fieldCardHolder).isDisplayed();
        driver.findElement(fieldAccountNumber).isDisplayed();

        //driver.findElement(titleRekvCard).isDisplayed();
        driver.findElement(fieldName).isDisplayed();
        driver.findElement(fieldNumber).isDisplayed();
        driver.findElement(fieldData).isDisplayed();
        driver.findElement(fieldOwner).isDisplayed();
        driver.findElement(fieldStatus).isDisplayed();
    }
}
