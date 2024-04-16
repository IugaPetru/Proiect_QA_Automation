package automation.stepDefinition;

import automation.pages.LogInPage;
import automation.utils.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LogInPageSteps {
    LogInPage loginPage;

    public  LogInPageSteps(TestBase testBase){
        loginPage=new LogInPage(testBase.initializeDriver());

    }
    @When("the fields are filled with values")
    public void fillValues(DataTable dataTableType){
        List<String> value=dataTableType.values();
        loginPage.typeValueToElement(value.get(0),value.get(1));
        loginPage.typeValueToElement(value.get(2),value.get(3));

    }
    @When("the register button is clicked")
    public void registerButton(){
        loginPage.clickRegisterButton();

    }

    @Then("the sign in page should be displayed")
    public void displayedLogIn(){
        Assert.assertTrue(loginPage.isLogInPageDisplayed());
    }
    @Then("the user is logged")
    public void userLogged(){
        Assert.assertTrue(loginPage.isLogged());
    }
    @Then("the sign in button should be click")
    public void signIn(){
        LogInPage.clickSignIn();

    }
    @Then("the register page is displayed")
    public void displayedRegisterPage(){
        Assert.assertTrue(loginPage.isDisplayedRegisterPage());

    }

}
