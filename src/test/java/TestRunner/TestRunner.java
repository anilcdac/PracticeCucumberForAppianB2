package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        glue = {"com.appiancorp.ps.cucumber","com.gfit.cucumber","stepDef"},
        monochrome = true,
        plugin={
                "html:target/cucumber-reports/index.html",
                "html:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "summary"},
        tags= "@Login"
)

public class TestRunner {
}
