package locators;

import org.openqa.selenium.By;

public interface AccountProfileLocators {
    By blockAboutAccount = By.xpath("//a[@aria-label=\"О счете, Задолженность, справки, отчеты\"]");
    By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    By buttonPercentReport = By.xpath("//*[text()=\"Отчет о процентах\"]");
    By buttonNotPayPercent = By.xpath("//*[text()=\"Ваш беспроцентный период\"]");


    By pageSettings = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    By buttonAdditionalCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");
    By buttonInsurance = By.xpath("//*[text()=\"Оформить страховку\"]");
    By buttonRecomend = By.xpath("//*[text()=\"Рекомендовать карту\"]");
    By buttonRefinanc = By.xpath("//*[text()=\"Рефинансирование\"]");
    By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");
    By buttonCloseRenamePr = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/div[1]/div[2]/label/div[2]/div/button[2]");
    By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");

    By titleRekvAcc = By.xpath("//p[text()=\"Реквизиты счета • 3355\"]");
    By titleRekvCard = By.xpath("//p[text()=\"Реквизиты карты • 6071\"]");


    By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
}
