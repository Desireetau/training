package cucumberRunnerPkg;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/orangeHRM.feature",
        glue = "cucumberPkg"
)
public class orangeHRMRunner extends AbstractTestNGCucumberTests {

}
