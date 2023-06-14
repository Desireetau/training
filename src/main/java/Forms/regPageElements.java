package Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class regPageElements {

    public static  WebElement element = null;

    //txtTraining
    //txtDatabase
    //txtRegistrationLink
    //txtTitle
    //txtDelegateName
    //txtDelegateLastName

    public static WebElement txtTraining(WebDriver driver){

        element = driver.findElement(By.linkText("Training"));
        return element;
    }
    public static WebElement txtDatabase(WebDriver driver){

        element = driver.findElement(By.partialLinkText("Database"));
        return element;
    }

    public static WebElement txtRegistrationLink(WebDriver driver){

        element = driver.findElement(By.cssSelector("#default-btn-86dfb65d5a95023ba5557de2b61b07ef > span"));
        return element;
    }

    public static WebElement txtTitle(WebDriver driver){

        element = driver.findElement(By.id("wpforms-3337-field_19"));
        return element;
    }
    public static WebElement txtDelegateName(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"wpforms-3337-field_0\"]"));
        return element;
    }
    public static WebElement txtDelegateLastName(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div/section[3]/div/div[1]/div/div/div/div/form/div[1]/div[2]/div[1]/div[2]/input"));
        return element;
    }
//Elements for demosite execution.
    public static WebElement txtUserName(WebDriver driver){

        element = driver.findElement(By.name("UserName"));
        return element;
    }

    public static WebElement txtPassword(WebDriver driver){

        element = driver.findElement(By.name("Password"));
        return element;
    }

    public static WebElement txtLogin(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id='userName']/p[3]/input"));
        return element;
    }


}
