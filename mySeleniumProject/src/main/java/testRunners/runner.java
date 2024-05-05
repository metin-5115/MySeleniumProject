package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import util.DriverFactory;
import util.WebDriverFactory;


@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"stepsDefinitions", "util"},
        tags = "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",

        }
)
public class runner extends AbstractTestNGCucumberTests {

    static WebDriver driver= DriverFactory.getDriver();

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}