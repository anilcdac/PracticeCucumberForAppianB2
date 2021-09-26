package com.gfit.cucumber;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberBaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GfFixtures extends BaseFixture {
    private CucumberTempoFixture cucumberTempoFixture = new CucumberTempoFixture();
    private CucumberBaseFixture fixture = new CucumberBaseFixture();
    public static WebDriver driver = null;

/*
<input type="button" class="btn primary" value="I Agree" onclick="acceptTermsOfService()">
“//input[@value=‘I Agree’]”
 */
    //Private Methods
    @Given("I click on custom button {string}")
    public void iClickOnCustomButton(String arg0) {
        CucumberTempoFixture.getSettings().getDriver().findElement(By.xpath("//input[@type='button']")).click();
    }

}
