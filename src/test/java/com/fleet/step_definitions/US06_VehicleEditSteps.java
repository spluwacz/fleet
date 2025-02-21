package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleEditPage_DS;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US06_VehicleEditSteps {


    LoginPage loginPage = new LoginPage();
    VehicleEditPage_DS vehicleEditPage = new VehicleEditPage_DS();


    @Given("user navigates and clicks to Vehicles under the Fleet dropdown")
    public void user_navigates_to_vehicles_under_the_fleet_dropdown() {
        loginPage.waitUntilLoaderScreenDisappear();
        loginPage.navigateToModule("Fleet","Vehicles");
    }

    @When("user hovers over the three-dot menu")
    public void user_hovers_over_the_three_dot_menu() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        actions.moveToElement(vehicleEditPage.threeDotMenu).perform();
        BrowserUtils.sleep(1);
    }

    @Then("user sees View , Edit , and Delete options")
    public void user_sees_view_edit_and_delete_options() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleEditPage.viewMenuItem).perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleEditPage.editMenuItem).perform();
        BrowserUtils.sleep(2);
        actions.moveToElement(vehicleEditPage.deleteMenuItem).perform();
        BrowserUtils.sleep(2);
    }

}
