package cucumber;


import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/cucumber/features/HomeWork13.feature",
        glue = "cucumber.steps",
        tags = "@TestCertificate",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerCucumber {
    //protected static WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);

    @BeforeClass
    public static void start() {
        Base.driver = DriverFactory.getDriver(BROWSER.CHROME);
    }

    @AfterClass
    public static void end() {
        Base.driver.quit();


    }
}
