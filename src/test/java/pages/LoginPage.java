package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.LoginLocators;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCustomerLoginOption() {
        elementHelper.clickJSLocator(LoginLocators.customerLoginElement);
        LoggerUtility.infoLog("The user clicks on Customer Login Button");
    }

    public void clickOnBankManagerLoginOption() {
        elementHelper.clickJSLocator(LoginLocators.bankManagerLoginElement);
        LoggerUtility.infoLog("The user clicks on Bank Manager Login Button");
    }

    public void clickOnHomeButton() {
        elementHelper.clickJSLocator(LoginLocators.homeLoginElement);
        LoggerUtility.infoLog("The user clicks on Home Button");
    }
}
