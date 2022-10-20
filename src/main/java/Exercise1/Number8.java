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

        //Enter the number to convert
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input")).sendKeys("4");

        Thread.sleep(1000);

        // selecting Kilometers to convert From
        WebElement selectFrom = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[1]/select"));
        Select From = new Select(selectFrom);
        From.selectByVisibleText("kilometer");

        Thread.sleep(3000);

        // selecting meters to convert To
        WebElement selectTo = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[2]/td[2]/select"));
        Select To = new Select(selectTo);
        To.selectByVisibleText("meter");

        Thread.sleep(1000);

        //Clicking the convert Button
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[3]/td/input")).click();

        Thread.sleep(1000);

        //Display the conversion in the console

        WebElement results = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[4]/td/input"));
        String text = results.getAttribute("value");
        Thread.sleep(1000);
        System.out.println(text);

        Thread.sleep(2000);
        //Displaying  the number that has been entered in the console

        WebElement enteredValue = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/center/table/tbody/tr[1]/td/input"));
        String val = enteredValue.getAttribute("value");
        Thread.sleep(2000);
        System.out.println(val);

        //Check if the answer is correct
        String answer = "4 000 meter";
        System.out.println(text.contains(answer));

    }
    @AfterMethod
    public void closeWindow(){
        driver.quit();
    }

}
