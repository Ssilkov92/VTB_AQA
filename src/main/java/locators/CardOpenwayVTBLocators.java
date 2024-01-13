package locators;

import org.openqa.selenium.By;

public interface CardOpenwayVTBLocators {

    By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");

    By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    By buttonRecomend = By.xpath("//*[text()=\"Рекомендовать карту\"]");
    By pageSettings = By.xpath("//html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");

    By ButtonCardNumberHeader = By.xpath("//button[text()=\"Показать номер карты\"]");
    By ButtonCardNumberFooter = By.xpath("//p[text()=\"Показать номер карты\"]");

    By titleRekvAccPrC = By.xpath("//p[text()=\"Реквизиты счета • 6017\"]");
    By titleRekvCardPrC = By.xpath("//p[text()=\"Реквизиты карты • 0639\"]");

}
