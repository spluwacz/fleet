package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class US05_VehicleModelStepsDef {

    LoginPage loginpage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters the username {string} and password {string}")
    public void user_enters_the_username_and_password(String u, String p) {

        loginpage.login(ConfigurationReader.getProperty(u), ConfigurationReader.getProperty(p));

    }
    @When("user hover over to the Fleet menu option")
    public void user_hover_over_to_the_fleet_menu_option() {

    }
    @When("user clicks to the Vehicle Model option")
    public void user_clicks_to_the_vehicle_model_option() {

    }
    @Then("user should see {int} columns on the Vehicle Model Page")
    public void user_should_see_columns_on_the_vehicle_model_page(Integer int1) {


    }


    @Then("user see {string} message on the screen")
    public void userSeeMessageOnTheScreen(String arg0) {
    }
}
