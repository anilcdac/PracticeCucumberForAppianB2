package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AutomationFixture extends BaseSteps {

 //   And I launch URL "https://www.google.com/"

    @Given("I launch URL {string}")
    public void iopenurl(String arg0) {
        System.out.println("URL Opened");
        driver.get(arg0);   // hit url
        driver.manage().window().maximize();

    }

    @And("I enter username {string}")
    public void iEnterUsername(String arg0) {
        driver.findElement(By.xpath("//tagName[@Attribute='value']")).sendKeys();
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        driver.findElement(By.xpath("//tagName[@Attribute='value']")).sendKeys();
    }


    @When("I verify button {string} is present")
    public void iVerifyButtonIsPresent(String arg0) {

    }

    @Then("I click on button {string}")
    public void iClickOnButton(String arg0) {

    }
}
