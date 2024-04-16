package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LogInPage {
    static WebDriver driver;

    public LogInPage(WebDriver driver){
        LogInPage.driver =driver;

    }
    public boolean isLogged(){
        WebElement logged=driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > a:nth-child(1) > div:nth-child(1) > p:nth-child(2)"));
        return logged.isDisplayed();
    }
    public boolean isLogInPageDisplayed(){
        WebElement loginPage = driver.findElement(By.cssSelector(".t_link.active.nav-link"));
        return loginPage.isDisplayed();
    }
// User and password insert
    public void typeValueToElement(String webElement, String value){
        WebElement elementNameElement = driver.findElement(By.name(webElement));
        elementNameElement.sendKeys(value);

    }
    public static void clickSignIn() {
        WebElement logIn2 = driver.findElement(By.xpath("//div[@class='nav']"));
        logIn2.click();

    }


//Register Page
    public void clickRegisterButton(){
        WebElement registerButton=driver.findElement(By.xpath("//a[@class='t_link active nav-link']"));
        registerButton.click();
    }

    public boolean isDisplayedRegisterPage(){
        WebElement isDisplayedReg= driver.findElement(By.cssSelector("button[type='submit']"));
        return isDisplayedReg.isDisplayed();
    }
}
