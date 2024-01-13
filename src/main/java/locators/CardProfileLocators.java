package locators;

import org.openqa.selenium.By;

public interface CardProfileLocators {


    By buttonCloseRenameCPr = By.xpath("//button[@class=\"v1-c-WskZL v1-c-WskZL-gPSsDg-size-bodyS v1-c-WskZL-femSRz-isActive-true omega-ui-retail__button-icon\"]");

    By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    By buttonNotPayPercent = By.xpath("//*[text()=\"Ваш беспроцентный период\"]");
    By buttonPercentReport = By.xpath("//*[text()=\"Отчет о процентах\"]");

    By pageSettings = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");

    By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    By buttonRecomend = By.xpath("//*[text()=\"Рекомендовать карту\"]");
    By buttonRefinanc = By.xpath("//*[text()=\"Рефинансирование\"]");


    By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");

    By ButtonCardNumberHeader = By.xpath("//button[text()=\"Показать номер карты\"]");
    By ButtonCardNumberFooter = By.xpath("//p[text()=\"Показать номер карты\"]");

    By buttonShowCardNumber = By.xpath("//*[text()=\"Показать номер карты\"]");
    By titleRekvAcc = By.xpath("//p[text()=\"Реквизиты счета • 3352\"]");

    By titleRekvCard = By.xpath("//p[text()=\"Реквизиты карты • 8781\"]");

}
