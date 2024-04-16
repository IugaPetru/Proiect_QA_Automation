package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait waitElem;

    public HomePage(WebDriver driver){
        this.driver=driver;
        waitElem = new WebDriverWait(driver, Duration.ofSeconds(35));
    }
    public void openHomePage(){
        driver.get("http://localhost:3000/home");
    }


// Button functions
    public void clickLogIn()  {
        WebElement logIn=driver.findElement(By.xpath("//p[normalize-space()='Login']"));
        waitElem.until(ExpectedConditions.visibilityOf(logIn));
        logIn.click();


        WebElement logIn1=driver.findElement(By.cssSelector("div[class='top_nav css-e53awj-MuiStack-root'] li:nth-child(2) a:nth-child(1)"));
        waitElem.until(ExpectedConditions.visibilityOf(logIn1));
        logIn1.click();
    }

    public void clickExtendMenu(){
        WebElement extendButton=driver.findElement(By.xpath("//div[@class='navbar-nav']//*[name()='svg']"));
        extendButton.click();
    }

    public boolean verticalMenuIsExtended(){
        WebElement verticalMenuExt= driver.findElement(By.cssSelector("svg"));
        return verticalMenuExt.isDisplayed();
    }
    public void maximizedWindow() {
        driver.manage().window().maximize();

    }



//Invoice Page
    public void clickInvoiceButton() {

        WebElement invoiceCard = driver.findElement(By.xpath("//a[@color='primary']//div[@class='card-body']"));
        waitElem.until(ExpectedConditions.visibilityOf(invoiceCard));
        invoiceCard.click();
    }

    public boolean invoicePageVisible(){
        WebElement invoicePge = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(1)"));
        return  invoicePge.isDisplayed();
    }



// Account page {
    public void accountCardClicked(){
        WebElement accountCard =driver.findElement(By.xpath("//p[normalize-space()='Cont']"));
        waitElem.until(ExpectedConditions.visibilityOf(accountCard));
        accountCard.click();
    }

    public boolean accountSettingsPageDisplayed(){
        WebElement accountSetting= driver.findElement(By.xpath("//button[normalize-space()='Adauga']"));
        waitElem.until(ExpectedConditions.visibilityOf(accountSetting));
        return accountSetting.isDisplayed();
    }

// Messages page
    public void messageCardClicked(){
        WebElement messageCard=driver.findElement(By.xpath("//p[@class='cardtext card-text'][normalize-space()='Mesaje']"));
        waitElem.until(ExpectedConditions.visibilityOf(messageCard));
        messageCard.click();
    }

    public void messageClicked(){
        WebElement messageSelect=driver.findElement(By.xpath("//button[2]//p[1]"));
        messageSelect.click();
    }
    public boolean messagePopUp(){
        WebElement messagePop=driver.findElement(By.xpath("//div[@role='dialog']"));
        return messagePop.isDisplayed();
    }

 // News Page

    public void newsPageAccessed(){
        WebElement newsCard=driver.findElement(By.xpath("//a[@href='/noutati']//div[@class='card-body']//*[name()='svg']//*[name()='path' and contains(@d,'M6 2c-1.1 ')]"));
        newsCard.click();
    }

    public boolean newsPageDisplay(){
        WebElement newsDisplayed= driver.findElement(By.cssSelector("body div[id='root'] div[class='container'] div[class='container'] div:nth-child(2) div:nth-child(1) h2:nth-child(1)"));
        return newsDisplayed.isDisplayed();
    }

// Secondary menu

    public void userButtonClicked(){
        WebElement userButton=driver.findElement(By.xpath("//p[normalize-space()='Login']"));
        userButton.click();
    }

    public boolean subMenuDisplayed(){
        WebElement subMenu=driver.findElement(By.xpath("//ul[@id='composition-menu']"));
        waitElem.until(ExpectedConditions.visibilityOf(subMenu));
        return subMenu.isDisplayed();
    }

}
