package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US03_PinbarSteps {

    LoginPage loginPage = new LoginPage();

    @When("the user should see and click {string} link")
    public void the_user_should_see_and_click_link(String string) {
        BrowserUtils.sleep(3);
        //loginPage.waitUntilLoaderScreenDisappear();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.pinBar).perform();
        actions.click().perform();








    }
    @Then("the user should see {string} link and {string} link")
    public void the_user_should_see_link_and_link(String string, String string2) {

    }









}
