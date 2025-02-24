package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class US05_VehicleModelStepsDef {

    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String u, String p) {

        loginPage.login(ConfigurationReader.getProperty(u), ConfigurationReader.getProperty(p));

    }
    @When("user hover over to the Fleet menu option")
    public void user_hover_over_to_the_fleet_menu_option() {
        loginPage.waitUntilLoaderScreenDisappear();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.fleetDropdown).perform();
        BrowserUtils.sleep(2);

    }

    @When("user clicks to the Vehicle Model option")
    public void user_clicks_to_the_vehicle_model_option() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.vehiclesModel).perform();
        actions.click().perform();

    }
    @Then("user should see {int} columns on the Vehicle Model Page")
    public void user_should_see_columns_on_the_vehicle_model_page(Integer int1) {
        BrowserUtils.sleep(2);
        System.out.println("loginPage.headerRow.size()= " + loginPage.headerRow.size());
        int actualSize = loginPage.headerRow.size();
        for (int i = 0; i < loginPage.headerRow.size(); i++) {
            System.out.println(loginPage.headerRow.get(i).getText());
        }
        int expectedSize=10;
        Assert.assertEquals(expectedSize, actualSize);


    }

    @Then("user see {string} message on the screen")
    public void userSeeMessageOnTheScreen(String arg0) {

        String actualTitle=loginPage.youDoNotHavePermission.getText();
        String expectedTitle="You do not have permission to perform this action.";
        Assert.assertEquals(expectedTitle,actualTitle);


    }
}
