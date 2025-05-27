package pages;

import loggerUtility.LoggerUtility;
import modelObject.CustomerModel;
import modelObject.CustomerTransactionModel;
import org.openqa.selenium.WebDriver;
import pageLocators.CustomerLocators;

public class CustomerPage extends BasePage {

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public void selectCustomerInCustomers() {
        String customerValue = driver.findElement(CustomerLocators.customerValueElement).getText();
        elementHelper.selectCustomerByIndex(CustomerLocators.customerNameElement, 6);
        LoggerUtility.infoLog("The user selects customer value: " + customerValue);
    }

    public void loginCustomerInCustomers() {
        elementHelper.clickJSLocator(CustomerLocators.loginElement);
        LoggerUtility.infoLog("The user clicks on Login Button");
    }

    public void validateCustomerFullNameInCustomers(CustomerModel testCustomerData) {
        String customerFullName = driver.findElement(CustomerLocators.customerAccountNameInCustomerAccountElement).getText();
        elementHelper.validateElementText(CustomerLocators.customerAccountNameInCustomerAccountElement, testCustomerData.getFullName());
        LoggerUtility.infoLog("Validate the customer full name is: " + customerFullName);
    }

    public void clickOnDepositButton() {
        elementHelper.clickJSLocator(CustomerLocators.depositButtonElement);
        LoggerUtility.infoLog("The user clicks on Deposit Button");
    }

    public void addAmountDepositValue(CustomerTransactionModel transactionData) {
        elementHelper.fillLocator(CustomerLocators.amountDepositElement, transactionData.getAmount());
        LoggerUtility.infoLog("User adds amount value: " + transactionData.getAmount());
    }

    public void submitDepositTransaction(){
        elementHelper.clickLocator(CustomerLocators.depositSubmitButtonElement);
        LoggerUtility.infoLog("The user clicks on Submit Deposit Button");
    }

    public void validateMessage(CustomerTransactionModel transactionData) {
        String transactionMessage = driver.findElement(CustomerLocators.messageTransactionElement).getText();
        elementHelper.validateElementText(CustomerLocators.messageTransactionElement,transactionData.getMessage());
        LoggerUtility.infoLog("Validate the message of transaction is: " + transactionMessage);
    }

    public void depositTransaction(CustomerTransactionModel transactionData) {
        clickOnDepositButton();
        addAmountDepositValue(transactionData);
        submitDepositTransaction();
        validateMessage(transactionData);
        elementHelper.waitFor(1500);
    }

    public void clickOnWithdrawlButton() {
        elementHelper.clickJSLocator(CustomerLocators.withdrawlButtonElement);
        LoggerUtility.infoLog("The user clicks on Withdrawl Button");
    }

    public void addAmountWithdrawValue(CustomerTransactionModel transactionData) {
        elementHelper.fillLocator(CustomerLocators.amountWithdrawElement, transactionData.getAmount());
        LoggerUtility.infoLog("User adds amount value: " + transactionData.getAmount());
    }

    public void submitWithdrawTransaction(){
        elementHelper.clickLocator(CustomerLocators.withdrawSubmitButtonElement);
        LoggerUtility.infoLog("The user clicks on Submit Withdraw Button");
    }

    public void withdrawTransaction(CustomerTransactionModel transactionData){
        clickOnWithdrawlButton();
        addAmountWithdrawValue(transactionData);
        submitWithdrawTransaction();
        validateMessage(transactionData);
        elementHelper.waitFor(1500);
    }

    public void transactionsButton() {
        elementHelper.waitFor(5000);
        elementHelper.clickJSLocator(CustomerLocators.transactionsButtonElement);
        LoggerUtility.infoLog("The user clicks on Transactions Button");
    }

    public void validateFirstTransactionAmount(CustomerTransactionModel validateTransactionData) {
        String firstAmountData = driver.findElement(CustomerLocators.amountOfFirstTransaction).getText();
        elementHelper.validateElementText(CustomerLocators.amountOfFirstTransaction,validateTransactionData.getAmount());
        LoggerUtility.infoLog("Validate the message of transaction is: " + firstAmountData);
    }

    public void validateFirstTransactionType(CustomerTransactionModel validateTransactionData) {
        String firstTypeData = driver.findElement(CustomerLocators.transactionTypeOfFirstTransaction).getText();
        elementHelper.validateElementText(CustomerLocators.transactionTypeOfFirstTransaction,validateTransactionData.getValidateType());
        LoggerUtility.infoLog("Validate the message of transaction is: " + firstTypeData);
    }

    public void validateFirstTransaction(CustomerTransactionModel validateTransactionData) {
        validateFirstTransactionAmount(validateTransactionData);
        validateFirstTransactionType(validateTransactionData);
    }

    public void validateSecondTransactionAmount(CustomerTransactionModel validateTransactionData) {
        String secondAmountData = driver.findElement(CustomerLocators.amountOfSecondTransaction).getText();
        elementHelper.validateElementText(CustomerLocators.amountOfSecondTransaction,validateTransactionData.getAmount());
        LoggerUtility.infoLog("Validate the message of transaction is: " + secondAmountData);
    }

    public void validateSecondTransactionType(CustomerTransactionModel validateTransactionData) {
        String secondTypeData = driver.findElement(CustomerLocators.transactionTypeOfSecondTransaction).getText();
        elementHelper.validateElementText(CustomerLocators.transactionTypeOfSecondTransaction,validateTransactionData.getValidateType());
        LoggerUtility.infoLog("Validate the message of transaction is: " + secondTypeData);
    }

    public void validateSecondTransaction(CustomerTransactionModel validateTransactionData) {
        validateSecondTransactionAmount(validateTransactionData);
        validateSecondTransactionType(validateTransactionData);
    }

}
