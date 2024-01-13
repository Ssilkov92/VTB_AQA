package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import settings.BaseSeleniumPage;

import static locators.CommonLocators.accCredLim;
import static locators.CommonLocators.accDebt;
import static locators.CommonLocators.accGrace;
import static locators.CommonLocators.accMinAmount;
import static locators.CommonLocators.accTarrifs;
import static locators.CommonLocators.buttonCloseRename;
import static locators.CommonLocators.buttonLogin;
import static locators.CommonLocators.buttonOpenRename;
import static locators.CommonLocators.buttonOplatit;
import static locators.CommonLocators.buttonPopolnit;
import static locators.CommonLocators.buttonTabDebt;
import static locators.CommonLocators.buttonTabRequis;
import static locators.CommonLocators.buttonVoyti;
import static locators.CommonLocators.fieldLogin;
import static locators.CommonLocators.fieldPassword;
import static locators.CommonLocators.pageHowUseCard;
import static locators.CommonLocators.pageInformation;
import static locators.CommonLocators.smsCodeField;
import static locators.CommonLocators.tabDebt;
import static locators.Way4Locators.buttonAdditionalCard;
import static locators.Way4Locators.buttonBlock;
import static locators.Way4Locators.buttonCardReport;
import static locators.Way4Locators.buttonChangeLimit;
import static locators.Way4Locators.buttonChangePin;
import static locators.Way4Locators.buttonHowUsecard;
import static locators.Way4Locators.buttonMakeSpravka;
import static locators.Way4Locators.buttonMakeVipyska;
import static locators.Way4Locators.buttonRecomend;
import static locators.Way4Locators.buttonRefinanc;
import static locators.Way4Locators.fieldAccountNumber;
import static locators.Way4Locators.fieldBIK;
import static locators.Way4Locators.fieldBankName;
import static locators.Way4Locators.fieldCardHolder;
import static locators.Way4Locators.fieldData;
import static locators.Way4Locators.fieldINN;
import static locators.Way4Locators.fieldKPP;
import static locators.Way4Locators.fieldKS;
import static locators.Way4Locators.fieldName;
import static locators.Way4Locators.fieldNumber;
import static locators.Way4Locators.fieldOwner;
import static locators.Way4Locators.fieldStatus;
import static locators.Way4Locators.pageHistoryOperation;
import static locators.Way4Locators.pageSettings;
import static locators.Way4Locators.tabRekvizits;
import static locators.Way4Locators.titleRekvAcc;
import static locators.Way4Locators.titleRekvCard;
import static settings.Constants.password;
import static settings.Constants.uncWay4;

public class Way4Page extends BaseSeleniumPage {

/*    public Way4Page Authorization() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldPassword).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(fieldLogin).sendKeys(uncWay4);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        Thread.sleep(7000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/F406162507C74167BFB0130B587F964B");
        Thread.sleep(3000);
        return this;
    }*/

    public Way4Page Authorization2() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        driver.findElement(fieldLogin).sendKeys(uncWay4);
        driver.findElement(buttonVoyti).click();
        driver.findElement(smsCodeField).sendKeys("000000");
        driver.findElement(fieldPassword).sendKeys(password);
        driver.findElement(buttonVoyti).click();
        Thread.sleep(8000);
        driver.get("https://ift-ibrb1-sharing.vtb.ru/details/CreditCard/F406162507C74167BFB0130B587F964B");
        Thread.sleep(3000);
        return this;
    }

    public Way4Page checkOpenRename() {
        driver.findElement(buttonOpenRename).click();
        return this;
    }

    public Way4Page checkCloseRename() {
        driver.findElement(buttonCloseRename).click();
        return this;
    }
    public Way4Page checkButtonPopolnit() {
        driver.findElement(buttonPopolnit).isDisplayed();
        return this;
    }

        public Way4Page checkButtonOplatit () {
            driver.findElement(buttonOplatit).isDisplayed();
            return this;
        }


        public Way4Page openPageInformation () throws InterruptedException {
            driver.findElement(pageInformation).click();
            WebElement information = driver.findElement(By.xpath("//p[text()=\"Информация о карте\"]"));
            Assertions.assertTrue(information.getText().equals("Информация о карте"));
            Thread.sleep(1000);
            return this;
        }

        public Way4Page checkButtonUsecard () {
            driver.findElement(buttonHowUsecard).isEnabled();
            return this;
        }

        public Way4Page checkButtonPercentReport () {
            driver.findElement(buttonCardReport).isEnabled();
            return this;
        }

        public Way4Page checkButtonMakeVipyska () {
            driver.findElement(buttonMakeVipyska).isEnabled();
            return this;
        }

        public Way4Page checkButtonDebt () {
            driver.findElement(buttonTabDebt).isEnabled();
            return this;
        }

        public Way4Page checkButtonRequis () {
            driver.findElement(buttonTabRequis).isEnabled();
            return this;
        }

        public Way4Page checkButtonMakeSpravka () throws InterruptedException {
            driver.findElement(buttonMakeSpravka).isEnabled();
            driver.navigate().back();
            Thread.sleep(1000);
            return this;
        }

        public Way4Page openPageSettings () {
            driver.findElement(pageSettings).click();
            return this;
        }

        public Way4Page checkButtonChangeLimit () {
            driver.findElement(buttonChangeLimit).isDisplayed();
            return this;
        }

        public void checkButtonRecomend () {
            driver.findElement(buttonRecomend).isDisplayed();
        }

        public void checkButtonChangePin () {
            driver.findElement(buttonChangePin).isDisplayed();
        }

        public void checkButtonChangeBlock () {
            driver.findElement(buttonBlock).isEnabled();
        }

        public Way4Page checkButtonRefinanc () {
            driver.findElement(buttonRefinanc).isEnabled();
            return this;
        }

        public Way4Page checkButtonAdditionalCard () {
            driver.findElement(buttonAdditionalCard).isEnabled();
            driver.navigate().back();
            return this;
        }

        public Way4Page pageHistoryOperation () {
            driver.findElement(pageHistoryOperation).isDisplayed();
            return this;
        }

        public Way4Page pageHowUseCard () {
            driver.findElement(pageHowUseCard).isDisplayed();
            return this;
        }

        public Way4Page clickTabDebt () {
            driver.findElement(tabDebt).isDisplayed();
            return this;
        }

        public Way4Page checkAccMinAmount () {
            driver.findElement(accMinAmount).click();
            return this;
        }

        public Way4Page checkAccGrace () {
            driver.findElement(accGrace).click();
            return this;
        }

        public Way4Page checkAccDebt () {
            driver.findElement(accDebt).click();
            return this;
        }

        public Way4Page checkAccCredLim () {
            driver.findElement(accCredLim).isDisplayed();
            return this;
        }

        public Way4Page checkAccTarrifs () {
            driver.findElement(accTarrifs).isDisplayed();
            return this;
        }

        public Way4Page clickTabReqv () {
            driver.findElement(tabRekvizits).click();
            return this;
        }

        public Way4Page checkTabRekv () {
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
            return this;
        }
    }
