package pages;

import loggerUtility.LoggerUtility;
import modelObject.BankManagerModel;
import org.openqa.selenium.WebDriver;
import pageLocators.BankManagerLocators;

public class BankManagerPage extends BasePage{
    public BankManagerPage(WebDriver driver) {
        super(driver);
    }

    public void addCustomerInBankManager() {
        elementHelper.clickJSLocator(BankManagerLocators.addCustomerElement);
        LoggerUtility.infoLog("The user clicks on Add Customer Button");
    }

    public void fillFirstNameInBankManager(BankManagerModel testBankManagerData) {
        elementHelper.fillLocator(BankManagerLocators.firstNameElement, testBankManagerData.getFirstName());
        LoggerUtility.infoLog("The user fills on first name field the value: "+ testBankManagerData.getFirstName());
    }

    public void fillLastNameInBankManager(BankManagerModel testBankManagerData) {
        elementHelper.fillLocator(BankManagerLocators.lastNameElement, testBankManagerData.getLastName());
        LoggerUtility.infoLog("The user fills on last name field the value: "+ testBankManagerData.getLastName());
    }

    public void fillPostCodeInBankManager(BankManagerModel testBankManagerData) {
        elementHelper.fillLocator(BankManagerLocators.postCodeElement, testBankManagerData.getPostCode());
        LoggerUtility.infoLog("The user fills on post code field the value: "+ testBankManagerData.getPostCode());
    }

    public void submitBankManagerInfo(){
        elementHelper.clickLocator(BankManagerLocators.createCustomerElement);
        LoggerUtility.infoLog("The user clicks on Create Customer Button");

    }

    public void inteceptAndConfirmAlert() {
        alertHelper.acceptAlert();
    }

    public void openAccountInBankManager() {
        elementHelper.clickJSLocator(BankManagerLocators.openAccountElement);
        LoggerUtility.infoLog("The user clicks on Open Account Button");
    }

    public void selectCustomerFieldInBankManager() {
        String customerSelected = driver.findElement(BankManagerLocators.selectCustomerElement).getText();
        elementHelper.selectCustomerByIndex(BankManagerLocators.chooseCustomerElement,6);
        LoggerUtility.infoLog("The user selects customer value: " + customerSelected);
    }


    public void selectCurrencyValueInBankManager() {
        String currencySelected = driver.findElement(BankManagerLocators.selectCurrancyElement).getText();
        elementHelper.selectCustomerByIndex(BankManagerLocators.currencyElement,1);
        LoggerUtility.infoLog("The user selects currency value: " + currencySelected);
    }

    // + metodă selectCurrancyMultiple - cu for

    public void createAccountInBankManager() {
        elementHelper.clickJSLocator(BankManagerLocators.processElement);
        LoggerUtility.infoLog("The user clicks on Process Button");
    }

    public void customersTabInBankAccount() {
        elementHelper.clickJSLocator(BankManagerLocators.customersElement);
        LoggerUtility.infoLog("The user clicks on Customers Button");
    }

    public void searchCustomerInBankAccount(BankManagerModel testBankManagerData) {
        elementHelper.fillLocator(BankManagerLocators.searchCustomerElement,testBankManagerData.getFirstName());
        LoggerUtility.infoLog("The user searches customer by First Name: " + testBankManagerData.getFirstName());
    }

    public void validateCustomerInfoInBankAccount(BankManagerModel testBankManagerData){
        elementHelper.validateElementText(BankManagerLocators.firstNameCustomerElement,testBankManagerData.getFirstName());
        LoggerUtility.infoLog("Check if customer First Name is: " + driver.findElement(BankManagerLocators.firstNameCustomerElement).getText());
        elementHelper.validateElementText(BankManagerLocators.lastNameCustomerElement,testBankManagerData.getLastName());
        LoggerUtility.infoLog("Check if customer Last Name is: " + driver.findElement(BankManagerLocators.lastNameCustomerElement).getText());
        elementHelper.validateElementText(BankManagerLocators.postCodeCustomerElement, testBankManagerData.getPostCode());
        LoggerUtility.infoLog("Check if customer Post Code is: " + driver.findElement(BankManagerLocators.postCodeCustomerElement).getText());
    }


}
