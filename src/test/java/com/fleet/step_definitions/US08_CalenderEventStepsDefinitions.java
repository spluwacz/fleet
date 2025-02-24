package com.fleet.step_definitions;

import com.fleet.pages.CalendarPage_AA;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US08_CalenderEventStepsDefinitions {

    LoginPage loginPage= new LoginPage();


    @Given("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        loginPage.login(username, password);

    }

    CalendarPage_AA calendarPage_aa = new CalendarPage_AA();
    @When("user navigates to activities dropdownpage")
    public void user_navigates_to_activities_dropdownpage() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(calendarPage_aa.activitiesDrop).perform();
        BrowserUtils.sleep(5);
        actions.click().perform();
        BrowserUtils.sleep(5);

    }
    @When("the user hovers over the activities")
    public void the_user_hovers_over_the_activities() {
        {
            calendarPage_aa.calendarEvent.click();
        }


        }
    @When("clicks on Create Calendar Event button")
    public void clicks_on_create_calendar_event_button() {
        BrowserUtils.sleep(3);
        calendarPage_aa.createEvent.click();


    }
    @When("enables the Repeat checkbox")
    public void enables_the_repeat_checkbox() {
        calendarPage_aa.repeatCheckbox.click();

    }
    @Then("the Repeat Every field should show {string} by default")
    public void the_repeat_every_field_should_show_by_default(String string) {


    }
    @When("user clears the Repeat Every field")
    public void user_clears_the_repeat_every_field() {

    }
    @Then("the error message {string} should be displayed")
    public void the_error_message_should_be_displayed(String string) {

    }
}
