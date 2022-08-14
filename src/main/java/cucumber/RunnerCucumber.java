package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/cucumber/features",
        glue = "src/main/java/cucumber/steps",
        tags = "@MainPageFeature",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE)

public class RunnerCucumber {

}
