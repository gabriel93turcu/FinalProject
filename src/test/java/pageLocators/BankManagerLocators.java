package pageLocators;

import org.openqa.selenium.By;

public class BankManagerLocators {
    public static final By addCustomerElement = By.cssSelector("[ng-click=\"addCust()\"]");
    public static final By openAccountElement = By.cssSelector("[ng-click=\"openAccount()\"]");
    public static final By customersElement = By.cssSelector("[ng-click=\"showCust()\"]");
    public static final By firstNameElement = By.cssSelector("[ng-model=\"fName\"]");
    public static final By lastNameElement = By.cssSelector("[ng-model=\"lName\"]");
    public static final By postCodeElement = By.cssSelector("[ng-model=\"postCd\"]");
    public static final By createCustomerElement = By.xpath("//button[@type='submit' and text()='Add Customer']");
    public static final By chooseCustomerElement = By.id("userSelect");
    public static final By selectCustomerElement = By.xpath("//select[@id='userSelect']/option[@value='6']");
    public static final By currencyElement = By.id("currency");
    public static final By selectCurrancyElement = By.xpath("//select[@id='currency']/option[@value='Dollar']");
    public static final By processElement = By.xpath("//button[@type='submit' and text()='Process']");
    public static final By searchCustomerElement = By.cssSelector("[ng-model=\"searchCustomer\"]");
    public static final By firstNameCustomerElement = By.cssSelector(".table > tbody > tr:last-child > td:nth-child(1)");
    public static final By lastNameCustomerElement = By.cssSelector(".table > tbody > tr:last-child > td:nth-child(2)");
    public static final By postCodeCustomerElement = By.cssSelector(".table > tbody > tr:last-child > td:nth-child(3)");
    public static final By customerAccountNumberElement = By.cssSelector(".table > tbody > tr:last-child > td:nth-child(4) > span");
}
