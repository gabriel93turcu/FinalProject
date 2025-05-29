package sharedData;

import allureUtility.AllureCleaner;
import io.github.bonigarcia.wdm.WebDriverManager;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Hooks {
    private WebDriver driver;
    private String testName;

    @BeforeSuite(alwaysRun = true)
    public void prepareSuite(){
        AllureCleaner.deleteFolder();
    }

    @BeforeMethod (alwaysRun = true)
    public void prepareEnvironment() {
        //găsim numele clasei
        testName = this.getClass().getSimpleName();

        WebDriverManager.chromedriver().setup();

        String remoteEnv = System.getProperty("cicd");
        if(Boolean.parseBoolean(remoteEnv)){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            //deschidem un browser
            driver = new ChromeDriver(options);
        } else {
            driver = new ChromeDriver();
        }

        //Accesăm o pagină web
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        //Facem browserul în mod maximizare
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.startTest(testName);
    }

    @AfterMethod (alwaysRun = true)
    public void clearEnvironment() {
        driver.quit();
        LoggerUtility.finishTest(testName);
    }


    public WebDriver getDriver() {
        return driver;
    }
}

