package cucumberRunnerPkg;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/resources/OrangeHrmFeatures/successLoginPageHrm.feature",
        glue = " cucumberStepDefPkg"
)
public class successfulHrmLoginRunner extends AbstractTestNGCucumberTests {
}
