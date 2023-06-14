package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class datamateContactUs_Elements {
    public static WebElement element= null;

    public static WebElement txtName(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/div/span[1]/input"));
        return element;
    }

    public static WebElement txtEmail(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/div/span[2]/input"));
        return element;
    }

    public static WebElement txtTelephone(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/div/span[3]/input"));
        return element;
    }

    public static  WebElement txtCompany(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/div/span[4]/input"));
        return element;
    }

    public static WebElement txtMessage(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/form/span/textarea"));
        return element;
    }
}
