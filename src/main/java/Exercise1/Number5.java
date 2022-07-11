package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Number5 {
    public String baseurl;
    public WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        baseurl = ("https://datamate.co.za/");
        driver.manage().window().maximize();
    }

    @Test
    public void selectCourse() throws InterruptedException {
        driver.get(baseurl);

        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/div/ul/li[2]/ul/li[8]/a/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"default-btn-86dfb65d5a95023ba5557de2b61b07ef\"]/span")).click();

        Thread.sleep(2000);

        /*WebElement divClick = driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_16-container\"]/div/div[1]/div/div"));
        divClick.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.className("selectize-dropdown-content")));
        Select select = new Select(driver.findElement(By.className("selectize-dropwodn-content")));
        select.selectByVisibleText("Certified Professional -Selenium Automation Testing- Java  (Practical)");

        WebElement selectCause = driver.findElement(By.cssSelector("#wpforms-3337-field_16-container > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)"));
        Select cause = new Select(selectCause);
        cause.selectByValue("Certified Professional -Selenium Automation Testing- Java  (Practical)");

       Thread.sleep(2000);*/

        String Title = driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_16-container\"]/label")).getText();
        System.out.println(Title);

    }

    @After
    public void closeWindow(){
        driver.quit();
    }
}
