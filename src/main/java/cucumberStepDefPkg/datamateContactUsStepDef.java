package cucumberStepDefPkg;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.execution.FailOverExecutionControlProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class datamateContactUsStepDef {
    private String baseURL;
    private WebDriver driver;
    @Given("I open the Datamate website page")
    public void i_open_the_datamate_website_page() {

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        baseURL = "https://datamateinc.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("I click on the Contact Us link")
    public void i_click_on_the_contact_us_link() throws InterruptedException {
        driver.get(baseURL);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span")).click();
    }
    @Then("I fill in the Send a message form")
    public void i_fill_in_the_send_a_message_form() throws InterruptedException {
        Forms.datamateContactUs_Elements.txtName(driver).sendKeys("Desiree");
        Thread.sleep(2000);
        Forms.datamateContactUs_Elements.txtEmail(driver).sendKeys("desiree@gmail.co.za");
        Thread.sleep(2000);
        Forms.datamateContactUs_Elements.txtTelephone(driver).sendKeys("0214458896");
        Thread.sleep(2000);
        Forms.datamateContactUs_Elements.txtCompany(driver).sendKeys("Desiree Testing Company");
        Thread.sleep(2000);
        Forms.datamateContactUs_Elements.txtMessage(driver).sendKeys("I am just practicing, nothing serious");
        Thread.sleep(2000);
    }

    @Then("I Close the web page")
    public void i_close_the_web_page()

        {
            driver.close();
        }

}
