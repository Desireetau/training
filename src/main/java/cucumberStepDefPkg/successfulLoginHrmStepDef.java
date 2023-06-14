package cucumberStepDefPkg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class successfulLoginHrmStepDef {
    String expectedTitle = "OrangeHRM";
    private String baseurl;
    private WebDriver driver;

    @Given("A user navigates to HRM website")
    public void a_user_navigates_to_hrm_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = "https://orange.duravest.co.za/web/index.php/auth/login";
        // this will maximise the window
        driver.manage().window().maximize();
        //tells the webdriver to wait a certain amount of time before it throw the No Element Found Exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("The login page opens")
    public void the_login_page_opens() throws InterruptedException {
        driver.get(baseurl);
        Thread.sleep(1000);
    }
    @When("^Capture (.*) And (.*)$")
    public void capture_and(String username, String password) {
        Forms.hRMPageElements.txtHrmUserName(driver).sendKeys(username);
        Forms.hRMPageElements.txtHrmPassword(driver).sendKeys(password);
    }
    @Then("Click login  button.")
    public void click_login_button() throws InterruptedException {
        Forms.hRMPageElements.btnHrmLogin(driver).click();
        Thread.sleep(1000);
    }
    @Then("Login must be successful.")
    public void login_must_be_successful() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Login was successful");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(1000);
    }
    @Then("Close browser.")
    public void close_browser() {
        driver.close();
    }

}
