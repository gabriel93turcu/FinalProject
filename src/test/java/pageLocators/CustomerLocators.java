package pageLocators;

import org.openqa.selenium.By;

public class CustomerLocators {
    public static final By customerNameElement = By.id("userSelect");
    public static final By customerValueElement = By.xpath("//select[@id='userSelect']/option[@value='6']");
    public static final By loginElement = By.xpath("//button[@type='submit' and text()='Login']");
    public static final By customerAccountNameInCustomerAccountElement = By.xpath("//span[@class='fontBig ng-binding' and text()='Gabriel Tester']");
    public static final By selectedAccountElement = By.id("accountSelect");
    public static final By accountNumberInCustomerAccountElement = By.cssSelector(".center > .ng-binding:nth-child(1)");
    public static final By balanceValueInCurrentAccountElement = By.cssSelector(".center > .ng-binding:nth-child(2)");
    public static final By currencyInCurrentAccountElement = By.cssSelector(".center > .ng-binding:nth-child(3)");
    public static final By transactionsButtonElement = By.cssSelector("button[ng-click=\"transactions()\"]");
    public static final By amountOfFirstTransaction = By.cssSelector("#anchor0 .ng-binding:nth-child(2)");
    public static final By transactionTypeOfFirstTransaction = By.cssSelector("#anchor0 .ng-binding:nth-child(3)");
    public static final By amountOfSecondTransaction = By.cssSelector("#anchor1 .ng-binding:nth-child(2)");
    public static final By transactionTypeOfSecondTransaction = By.cssSelector("#anchor1 .ng-binding:nth-child(3)");
    public static final By depositButtonElement = By.cssSelector("[ng-click=\"deposit()\"]");
    public static final By amountDepositElement = By.xpath("//form[@ng-submit='deposit()']//input[@ng-model='amount']");
    public static final By amountWithdrawElement = By.xpath("//form[@ng-submit='withdrawl()']//input[@ng-model='amount']");
    public static final By depositSubmitButtonElement = By.xpath("//button[@type='submit' and text()='Deposit']");
    public static final By withdrawlButtonElement = By.cssSelector("[ng-click=\"withdrawl()\"]");
    public static final By withdrawSubmitButtonElement = By.xpath("//button[@type='submit' and text()='Withdraw']");
    public static final By messageTransactionElement = By.cssSelector("[ng-show=\"message\"]");
}
