package automation.stepDefinition;

import automation.pages.IndexPage;

import automation.utils.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class IndexPageSteps {
    IndexPage indexpage;
    public IndexPageSteps(TestBase testBase){
        indexpage=new IndexPage(testBase.initializeDriver());
    }
    @When("the index button is clicked")
    public void theIndexButton(){
        indexpage.indexPageButton();
    }

    @Then("the index page is accessed")
    public void indexPageDisplayed(){
        Assert.assertTrue(indexpage.indexPageIsDisplayed());
    }
}
