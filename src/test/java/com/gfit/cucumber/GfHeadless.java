package com.gfit.cucumber;

import com.appiancorp.ps.automatedtest.common.Constants;
import com.appiancorp.ps.automatedtest.common.PropertiesUtilities;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import io.cucumber.java.en.Given;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.yaml.snakeyaml.scanner.Constant;

import java.util.Properties;

public class GfHeadless {

    private CucumberTempoFixture cucumberTempoFixture = new CucumberTempoFixture();

    @Given("^I setup with headless chrome browser$")
    public void iSetupWithHeadlessChromeBrowser() throws Exception {
        Properties props = PropertiesUtilities.getProps();
//        Properties props = Properties.getProps();
        String driverHome= determineDriverHome(Constants.Driver.CHROME,props);
        System.setProperty("webdriver.chrome.driver", driverHome);
        System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions co = new ChromeOptions();

        //Add headless chrome args
        co.addArguments(new String[]{"--headless"});
        co.addArguments(new String[]{"--disable-gpu"});

        cucumberTempoFixture.getSettings().setDriver(new ChromeDriver(co));

    }

    private String determineDriverHome(Constants.Driver driver, Properties props) {
        return StringUtils.isNotBlank(props.getProperty(driver.getDriverHome())) ? FilenameUtils.separatorsToSystem(props.getProperty(driver.getDriverHome())) : FilenameUtils.separatorsToSystem(props.getProperty("automated.testing.home") + "lib/drivers/" + driver.getDriver());
    }



}
