package pages;

import helperMethods.AlertHelper;
import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected AlertHelper alertHelper;
    protected ElementHelper elementHelper;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        alertHelper = new AlertHelper(driver);
        elementHelper = new ElementHelper(driver);
    }
}
