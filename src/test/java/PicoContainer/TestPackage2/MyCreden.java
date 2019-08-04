package PicoContainer.TestPackage2;

import PicoContainer.TestPackage1.MySharedClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyCreden {

    WebDriver driver;


    public MyCreden(MySharedClass mySharedClass) {
        driver = mySharedClass.startBrowser();
    }

    @When("^I am entering my credentials$")
    public void iAmEnteringMyCredentials() throws Throwable {

        driver.findElement(By.id("user[login]")).sendKeys("Treeee");

    }
}
