package cucumberPkg;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class stepDefin {
    private String baseurl;

    private WebDriver driver;
    @When("I open the Datamate website")
    public void i_open_the_datamate_website() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://datamateinc.com/registration");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Then("Navigate to the Registration form")
    public void navigate_to_the_registration_form() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get(baseurl);
        String datUrl = driver.getCurrentUrl();
        System.out.println(datUrl);
        Thread.sleep(2000);
    }

    @Then("Print the current url")
    public void print_the_current_url() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am the registration page");
    }
}
