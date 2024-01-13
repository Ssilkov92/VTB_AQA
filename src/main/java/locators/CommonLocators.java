package locators;

import org.openqa.selenium.By;

public interface CommonLocators {

    By buttonLogin = By.xpath("//span[text()=\"Логин\"]");
    By fieldLogin = By.xpath("//input[@label=\"Логин (или УНК)\"]");
    By fieldPassword = By.xpath("//input[@type=\"password\"]");
    By buttonVoyti = By.xpath("//*[button=\"Войти\"]");
    By smsCodeField = By.xpath("//input[@label=\"Код\"]");
    By buttonPopolnit = By.xpath("//button[text()=\"Пополнить\"]");
    By buttonOplatit = By.xpath("//button[text()=\"Оплатить\"]");
    By pageInformation = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[2]/div/a[1]/div");
    By pageHowUseCard = By.xpath("//div[text()=\"Как пользоваться картой\"]");
    By buttonOpenRename = By.xpath("//button[@class=\"v1-c-WskZL v1-c-WskZL-gPSsDg-size-bodyS v1-c-WskZL-femSRz-isActive-true omega-ui-retail__button-icon\"]");
    By buttonCloseRename = By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[1]/label/div[2]/div/button[2]");

    By buttonTabDebt = By.xpath("//*[text()=\"Задолженность\"]");
    By buttonTabRequis = By.xpath("//*[text()=\"Реквизиты\"]");

    By tabDebt = By.xpath("//button[text()=\"Задолженность\"]");
    By accMinAmount = By.xpath("//p[text()=\"Минимальный платеж\"]");
    By accGrace = By.xpath("//p[text()=\"Беспроцентный период\"]");
    By accDebt = By.xpath("//div[@class=\"sc-pIldA MainTitle__StyledHeader-sc-nvqspm-0 diKCst\"]//p[text()=\"Общая задолженность\"][1]");
    By accCredLim = By.xpath("//p[text()=\"Кредитный лимит\"]");
    By accTarrifs = By.xpath("//p[text()=\"Тарифы и условия\"]");

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
