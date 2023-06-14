package cucumberRunnerPkg;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/main/resources/test.feature",
        glue = "cucumberStepDefPkg")

public class cucuTest123 {
}
