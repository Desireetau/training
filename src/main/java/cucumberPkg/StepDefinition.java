package cucumberPkg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinition {
    private String baseurl;
    private WebDriver driver;
    @Given("We open Datamate website")
    public void we_open_datamate_website() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseurl = "https://datamateinc.com/registration";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @When("On the registration form we enter details")
    public void on_the_registration_form_we_enter_details() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get(baseurl);
        Thread.sleep(1000);

    }
    @Then("Capture First Name {string}")
    public void capture_first_name(String FirstName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Forms.regPageElements.txtDelegateName(driver).sendKeys(FirstName);

        Thread.sleep(1000);
    }

    @Then("Capture Last Names {string}")
    public void capture_last_names(String LastName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Forms.regPageElements.txtDelegateLastName(driver).sendKeys(LastName);
        Thread.sleep(1000);
    }
    @Then("We are going ot close the browser")
    public void we_are_going_ot_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
