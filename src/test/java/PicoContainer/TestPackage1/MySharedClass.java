package PicoContainer.TestPackage1;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySharedClass {

    public WebDriver driver;

    @Before
    public WebDriver startBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/evotester/.selenium_driver/chromedriver");
        if (driver == null) {
            driver = new ChromeDriver();
        }

        return driver;

    }

    @After
    public void closeBrowser() {

        driver.close();
        driver.quit();
        driver = null;
    }

}
