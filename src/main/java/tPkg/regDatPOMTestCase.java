package tPkg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class regDatPOMTestCase {
    public static void main (String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datamate.co.za/");
        driver.manage().window().maximize();

        //Click training
        Forms.regPageElements.txtTraining(driver).click();
        Thread.sleep(1000);

        Forms.regPageElements.txtDatabase(driver).click();
        Thread.sleep(1000);
        
        Forms.regPageElements.txtRegistrationLink(driver).click();
        Thread.sleep(1000);
        Forms.regPageElements.txtTitle(driver).sendKeys("Mr");
        Forms.regPageElements.txtDelegateName(driver).sendKeys("Fikile");
        Forms.regPageElements.txtDelegateLastName(driver).sendKeys("Modu");


        /*WebElement selectCountry = driver.findElement(By.xpath("//*[@id='wpforms-3337-field_15-container']/div"));
        Select country = new Select(selectCountry);
        country.selectByValue("Algeria");
        Thread.sleep(5000);*/

        String Title =driver.findElement(By.xpath("//*[@id='wpforms-3337-field_20-container']/label")).getText();
        System.out.println(Title);

        driver.quit();
    }
}
