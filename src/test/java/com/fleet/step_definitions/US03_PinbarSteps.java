package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.PinbarPage_KT;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US03_PinbarSteps {

    LoginPage loginPage = new LoginPage();
    PinbarPage_KT pinbarPage_kt = new PinbarPage_KT();

    @When("the user should see and click {string} link")
    public void the_user_should_see_and_click_link(String string) {
        loginPage.waitUntilLoaderScreenDisappear();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.pinBar).perform();
        actions.click().perform();


    }




    @Then("the user should see {string} and {string}")
    public void theUserShouldSeeAnd(String arg0, String arg1) {
        Assert.assertEquals(arg0,pinbarPage_kt.howToUseText.getText());
        Assert.assertEquals(arg1,pinbarPage_kt.usePintText.getText());




    }

    @And("the user should verfiy image source {string}")
    public void theUserShouldVerfiyImageSource(String arg0) {
        String actualImgSource = pinbarPage_kt.imageVerify.getDomAttribute("src");
        Assert.assertEquals(actualImgSource,arg0);


    }
}
