package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openJUnit {
    private String baseurl;
    private WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        baseurl = ("https://datamateinc.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void OpebDataM() throws InterruptedException {

        driver.get(baseurl);

        driver.findElement(By.linkText("Training")).click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Database")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#default-btn-86dfb65d5a95023ba5557de2b61b07ef > span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("wpforms-3337-field_19")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_0\"]")).sendKeys("Fikile");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("Modu");


/*        WebElement selectCountry = driver.findElement(By.xpath("//*[@id='wpforms-3337-field_15-container']/div/div[1]"));
        Select country = new Select(selectCountry);
        country.selectByValue("Algeria");
        Thread.sleep(5000);*/

        String Title =driver.findElement(By.xpath("//*[@id='wpforms-3337-field_20-container']/label")).getText();
        System.out.println(Title);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
