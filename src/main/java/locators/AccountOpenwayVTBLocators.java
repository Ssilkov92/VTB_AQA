package locators;

import org.openqa.selenium.By;

public interface AccountOpenwayVTBLocators {
    By blockAboutAccount = By.xpath("//a[@aria-label=\"О счете, Задолженность, справки, отчеты\"]");

    By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    By pageSettings = By.xpath("//html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    By buttonAdditionalCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");
    By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");
    By titleRekvAcc = By.xpath("//p[text()=\"Реквизиты счета • 6017\"]");
    By titleRekvCard = By.xpath("//p[text()=\"Реквизиты карты • 0639\"]");
}
