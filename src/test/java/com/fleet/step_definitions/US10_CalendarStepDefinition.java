package com.fleet.step_definitions;

import com.fleet.pages.CalendarPage_AA;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US10_CalendarStepDefinition {
    LoginPage loginPage= new LoginPage();
    CalendarPage_AA calendarPage_aa = new CalendarPage_AA();

    @When("user navigates to activities dropdown")
    public void user_navigates_to_activities_dropdown() {

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(calendarPage_aa.activitiesDrop).perform();
        BrowserUtils.sleep(5);
        actions.click().perform();
        BrowserUtils.sleep(5);


    }
    @When("user hovers over the activities")
    public void user_hovers_over_the_activities() {
     calendarPage_aa.calendarEvent.click();



    }

    @When("user click on create calendar events")
    public void user_click_on_create_calendar_events() {
        BrowserUtils.sleep(3);
       calendarPage_aa.createEvent.click();




    }
    @When("user write text in the field")
    public void user_write_text_in_the_field() {

    }
    @Then("user should see txt in the field")
    public void user_should_see_txt_in_the_field() {

    }

}
