package tests;

import helperMethods.AlertHelper;
import modelObject.*;
import org.testng.annotations.Test;
import pages.BankManagerPage;
import pages.CustomerPage;
import pages.LoginPage;
import sharedData.Hooks;
import suites.TestCaseSuite;
import suites.TestSuite;

public class BankManagerLoginTest extends Hooks {

    @Test (groups = {TestSuite.REGRESSION_SUITE, TestSuite.BANK_MANAGER_SUITE,
            TestCaseSuite.TICKET_123,TestCaseSuite.TC_457, TestCaseSuite.TC_459})
    public void createBankManagerAccount() {

        BankManagerModel testBankManagerData = new BankManagerModel("src/test/resources/testData/BankManagerData.json");
        CustomerModel testCustomerData = new CustomerModel("src/test/resources/testData/CustomerData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnBankManagerLoginOption();

        AlertHelper alertHelper = new AlertHelper(getDriver());
        BankManagerPage bankManagerPage = new BankManagerPage(getDriver());
        bankManagerPage.addCustomerInBankManager();
        bankManagerPage.fillFirstNameInBankManager(testBankManagerData);
        bankManagerPage.fillLastNameInBankManager(testBankManagerData);
        bankManagerPage.fillPostCodeInBankManager(testBankManagerData);
        bankManagerPage.submitBankManagerInfo();
        bankManagerPage.inteceptAndConfirmAlert();

        // for pentru 2 conturi
        bankManagerPage.openAccountInBankManager();
        for (AccountModel account : testBankManagerData.getAccounts()) {
            bankManagerPage.selectCustomerFieldInBankManager();
            bankManagerPage.selectCurrencyValueInBankManager();
            bankManagerPage.createAccountInBankManager();

            String accountNumber = alertHelper.getAndParseTextInAlert();
            System.out.println("Account number is: " +accountNumber);
        }

        bankManagerPage.customersTabInBankAccount();
        bankManagerPage.searchCustomerInBankAccount(testBankManagerData);
        bankManagerPage.validateCustomerInfoInBankAccount(testBankManagerData);

        loginPage.clickOnHomeButton();
        loginPage.clickOnCustomerLoginOption();

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.selectCustomerInCustomers();
        customerPage.loginCustomerInCustomers();
        customerPage.validateCustomerFullNameInCustomers(testCustomerData);

        for(CustomerAccountModel account : testCustomerData.getAccounts()) {
            if(account.getCurrency().equals("Dollar")) {
                for(CustomerTransactionModel transaction : account.getTransactions()) {
                    if (transaction.getType().equalsIgnoreCase("Deposit")){
                        customerPage.depositTransaction(transaction);
                    } else if (transaction.getType().equalsIgnoreCase("Withdrawl")){
                        customerPage.withdrawTransaction(transaction);
                    }
                }
            }
        }

        customerPage.transactionsButton();

        CustomerAccountModel account = testCustomerData.getAccounts().get(0);
        CustomerTransactionModel firstTransaction = account.getTransactions().get(0);
        CustomerTransactionModel secondTransaction = account.getTransactions().get(1);
        customerPage.validateFirstTransaction(firstTransaction);
        customerPage.validateSecondTransaction(secondTransaction);
    }
}
