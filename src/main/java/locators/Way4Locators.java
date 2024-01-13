package locators;

import org.openqa.selenium.By;

public interface Way4Locators {

    By buttonHowUsecard = By.xpath("//*[text()=\"Как пользоваться картой\"]");
    By buttonMakeVipyska = By.xpath("//*[text()=\"Сформировать выписку\"]");
    By buttonMakeSpravka = By.xpath("//*[text()=\"Заказать справку\"]");
    By buttonCardReport = By.xpath("//*[text()=\"Отчет по карте\"]");
    By pageSettings = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[2]/div");
    By buttonAdditionalCard = By.xpath("//*[text()=\"Выпустить дополнительную карту\"]");
    By buttonInsurance = By.xpath("//*[text()=\"Оформить страховку\"]");
    By buttonRecomend = By.xpath("//*[text()=\"Рекомендовать карту\"]");
    By buttonRefinanc = By.xpath("//*[text()=\"Рефинансирование\"]");
    By buttonChangeLimit = By.xpath("//*[text()=\"Изменить лимит\"]");
    By buttonBlock = By.xpath("//*[text()=\"Заблокировать\"]");
    By buttonChangePin = By.xpath("//*[text()=\"Сменить ПИН-код\"]");

    By pageHistoryOperation = By.xpath("//a[@href=\"/history\"]");
    By pageRassrochki = By.xpath("//div[text()=\"Оформленные рассрочки\"]");


    By tabRekvizits = By.xpath("//*[text()=\"Реквизиты\"]");
    By titleRekvAcc = By.xpath("//p[text()=\"Реквизиты счета • 0009\"]");
    By fieldBankName = By.xpath("//p[text()=\"Наименование банка получателя\"]");
    By fieldBIK = By.xpath("//*[text()=\"044525745\"]");
    By fieldINN = By.xpath("//*[text()=\"7702070139\"]");
    By fieldKPP = By.xpath("//*[text()=\"770943003\"]");
    By fieldKS = By.xpath("//*[text()=\"30101810345250000745\"]");
    By fieldCardHolder = By.xpath("//*[text()=\"Получатель\"]");
    By fieldAccountNumber = By.xpath("//*[text()=\"Счет получателя в банке получателя\"]");
    By titleRekvCard = By.xpath("//p[text()=\"Реквизиты карты • 7323\"]");
    By fieldName = By.xpath("//p[text()=\"Название карты\"]");
    By fieldNumber = By.xpath("//*[text()=\"Номер карты\"]");
    By fieldData = By.xpath("//*[text()=\"Срок действия\"]");
    By fieldOwner = By.xpath("//*[text()=\"Владелец карты\"]");
    By fieldStatus = By.xpath("//*[text()=\"Статус карты\"]");
}
