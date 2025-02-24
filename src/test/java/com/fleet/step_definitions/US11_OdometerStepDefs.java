package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.Comparator;

public class US11_OdometerStepDefs {
    LoginPage loginPage = new LoginPage();


    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String string) {
        Assert.assertTrue(loginPage.permissionError.isDisplayed());
    }

    @When("user navigates to the Fleet dropdown and vehicle odometer")
    public void userNavigatesToTheFleetDropdownAndVehicleOdometer() {
        loginPage.navigateToModule("Fleet", "Vehicle Odometer");
        BrowserUtils.sleep(5);
    }

    @Then("user see the default page as {int}")
    public void user_see_the_default_page_as(Integer int1) {
        loginPage.navigateToModule("Fleet", "Vehicle Odometer");
        Assert.assertTrue(loginPage.defaultPage.isDisplayed());
    }

    @Then("user see the View Per Page as {int} by default")
    public void user_see_the_view_per_page_as_by_default(Integer int1) {
        loginPage.navigateToModule("Fleet", "Vehicle Odometer");
        Assert.assertTrue(loginPage.ViewPerPage.isDisplayed());

    }




    }



