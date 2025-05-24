package pageLocators;

import org.openqa.selenium.By;

public class LoginLocators {
    public static final By customerLoginElement = By.cssSelector("[ng-click=\"customer()\"]");
    public static final By bankManagerLoginElement = By.cssSelector("[ng-click=\"manager()\"]");
    public static final By homeLoginElement = By.cssSelector("[ng-click=\"home()\"]");
}
