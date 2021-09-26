package com.gfit.cucumber;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberBaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import org.openqa.selenium.WebDriver;

public class GfFixtures extends BaseFixture {
    private CucumberTempoFixture cucumberTempoFixture = new CucumberTempoFixture();
    private CucumberBaseFixture fixture = new CucumberBaseFixture();
    public static WebDriver driver = null;


    //Private Methods


}
