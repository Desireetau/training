package Exercise1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Number8 {
    private String baseurl;
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        baseurl = ("https://www.onlineconversion.com/length_common.htm");
        driver.manage().window().maximize();
    }
    @Test
    public void conversion() throws InterruptedException {
        driver.get(baseurl);


        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).sendKeys("4");

        Thread.sleep(1000);

        WebElement selectFrom = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[1]/select"));
        Select From = new Select(selectFrom);
        From.selectByVisibleText("kilometer");

        Thread.sleep(1000);

        WebElement selectTo = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[2]/select"));
        Select To = new Select(selectTo);
        To.selectByVisibleText("meter");

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[3]/td/input")).click();

        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[4]/td/input")).getText();
        Thread.sleep(2000);
        System.out.println(text);

        Thread.sleep(2000);
        String value = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).getText();
        Thread.sleep(2000);
        System.out.println(value);

    }
    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }

}
