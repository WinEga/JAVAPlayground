package PicoContainer.TestPackage2;

import PicoContainer.TestPackage1.MySharedClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LaunchApp {

    WebDriver driver;

    public LaunchApp(MySharedClass mySharedClass) {

        driver = mySharedClass.startBrowser();
    }

    @Given("^I am launcing the application$")
    public void iAmLauncingTheApplication() throws Throwable {

        driver.get("https://github.com/");

    }
}
