package automation.stepDefinition;

import automation.pages.HomePage;
import automation.utils.TestBase;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class HomePageSteps {
    private final HomePage homePage;
    public HomePageSteps(TestBase testBase){
        homePage=new HomePage(testBase.initializeDriver());

    }

    @Given("the home page is access")
    public void the_home_page_is_access(){
        homePage.openHomePage();

    }

    @When("the sign in button is clicked")
    public void the_sign_in_button_is_clicked()  {
        homePage.clickLogIn();

    }

    @When("the extend button is clicked")
    public void the_extend_button_click(){

        homePage.clickExtendMenu();
    }

    @Then("the vertical menu is extended")
    public void verticalMenuExtended(){

        Assert.assertTrue(homePage.verticalMenuIsExtended());
    }

    @Given("the web windows is maximized")
    public void homePageMaximized(){

        homePage.maximizedWindow();
    }

    @When("the invoices button is clicked")
    public void invoiceButtonClick(){
        homePage.clickInvoiceButton();
    }

    @When("the account card is clicked")
    public void accountCardIsClicked(){
        homePage.accountCardClicked();
    }

    @When("the messages card is clicked")
    public void messagesCardClicked(){
        homePage.messageCardClicked();
    }

    @When("the messages is selected")
    public void messageSelected(){
        homePage.messageClicked();
    }

    @When("the news page card is clicked")
    public void newsPageA(){
        homePage.newsPageAccessed();
    }

    @When("the user button is clicked")
    public void userButtonIsClicked(){
        homePage.userButtonClicked();
    }

    @Then("the account page should be displayed")
    public void accountPageDisplayed(){
        Assert.assertTrue(homePage.accountSettingsPageDisplayed());
    }
    @Then("the invoices page is displayed")
    public void invoicePageDisplayed(){
        Assert.assertTrue(homePage.invoicePageVisible());
    }
    @Then("the messages should be displayed in a pop-up")
    public void messagePopUpDisplayed(){
        Assert.assertTrue(homePage.messagePopUp());
    }
    @Then("the news page is displayed")
    public void newsPageDisplayed(){
        Assert.assertTrue(homePage.newsPageDisplay());
    }

    @Then("the submenu is showed")
    public void subMenuIsDisplayed(){
        Assert.assertTrue(homePage.subMenuDisplayed());
    }
}
