package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
    static WebDriver driver;
    public  WebDriver initializeDriver(){
        if(driver==null){
            driver=new EdgeDriver();
        }
        return driver;
    }
    public void refreshPage(){
        driver.navigate().refresh();

    }
    public void closeDriver(){

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
