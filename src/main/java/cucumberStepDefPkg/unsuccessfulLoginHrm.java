package cucumberStepDefPkg;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class unsuccessfulLoginHrm {
    private String baseurl;

    private WebDriver driver;

    @Given("As a user I open the HRM login page")
    public void as_a_user_i_open_the_hrm_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = "https://icehrm-open.gamonoid.com/login.php?logout=1#";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Given("^I enter invalid (.*) and (.*)$")
    public void i_enter_user2_and_password(String username, String password) throws InterruptedException {
        driver.get(baseurl);
        Thread.sleep(1000);
        Forms.hRMPageElements.txtHrmUserName(driver).sendKeys(username);
        Forms.hRMPageElements.txtHrmPassword(driver).sendKeys(password);
        Thread.sleep(100);
    }

    @Then("I Click login  button.")
    public void i_click_login_button(){
        Forms.hRMPageElements.btnHrmLogin(driver).click();

    }

    @Then("An error message should display.")
    public void an_error_message_should_display() {
        String message = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/p")).getText();
        System.out.println(message);
    }

    @Then("I close the browser.")
    public void i_close_the_browser() {
        driver.close();
    }
}
