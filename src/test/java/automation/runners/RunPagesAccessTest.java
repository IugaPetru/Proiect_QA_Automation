package automation.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/cucumber/cucumber.html"},
        glue = {"automation.stepDefinition", "automation.hooks"},
        features = "src/test/resources/features",
        tags="@TestPages"
)

public class RunPagesAccessTest extends AbstractTestNGCucumberTests {
}
