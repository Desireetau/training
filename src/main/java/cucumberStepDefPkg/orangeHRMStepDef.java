package cucumberStepDefPkg;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class orangeHRMStepDef {
    String expectedTitle = "IceHrm Login";
    private String baseurl;

    private WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = "https://icehrm-open.gamonoid.com/login.php?logout=1#";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Given("^I enter (.*) and (.*)$")
    public void i_enter_user2_and_password(String username, String password) throws InterruptedException {
        driver.get(baseurl);
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @When("I log on to the HRM page")
    public void i_log_on_to_the_hrm_page() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='loginForm']/div[4]/button")).click();
        Thread.sleep(10000);
    }

    @When("Verify the Title of the page")
    public void verify_the_title_of_the_page() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("I close the browser")
    public void i_close_the_browser() {
        System.out.println("The test has been executed and the browser is closing");
        driver.close();
    }
}

