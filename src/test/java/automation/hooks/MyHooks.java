package automation.hooks;

import automation.utils.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
    private final TestBase testBase;

    public  MyHooks(TestBase testBase){
        this.testBase=testBase;
    }

    @Before
    public  void initializeTest(){

        testBase.initializeDriver();
    }

    @After
    public void finalizeTest(){

        testBase.refreshPage();
        testBase.closeDriver();

    }

}
