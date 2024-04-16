package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IndexPage {
    WebDriver driver;

    public IndexPage(WebDriver driver){
        this.driver=driver;

    }

    public void indexPageButton(){
        WebElement indexButton = driver.findElement(By.xpath("//p[normalize-space()='Index']"));
        indexButton.click();
        }
    public boolean indexPageIsDisplayed(){
        WebElement indexPageDisplayed=driver.findElement(By.cssSelector("button[class='incarca btn btn-primary']"));
        return indexPageDisplayed.isDisplayed();
    }
}
