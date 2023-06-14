package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class hRMPageElements {

    public static WebElement element = null;

    public static WebElement txtHrmUserName(WebDriver driver){
        element = driver.findElement(By.name("username"));
        return element;
    }

    public static WebElement txtHrmPassword(WebDriver driver){
        element = driver.findElement(By.name("password"));
        return element;
    }

    public static WebElement btnHrmLogin(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        return element;
    }

    
}
