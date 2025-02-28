package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.CalendarPage_AA;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class US08_CalendarEventStepDefinitions {
    LoginPage loginPage = new LoginPage();
    CalendarPage_AA calendarPage_aa = new CalendarPage_AA();


    @When("user navigates to activities- Calendars Events")
    public void userNavigatesToActivitiesCalendarsEvents() {
        loginPage.waitUntilLoaderScreenDisappear();
        loginPage.navigateToModule("Activities", "Calendar Events");
        BrowserUtils.waitForPageToLoad(10);


    }


    @When("the user clicks on Create Calendar Event button")
    public void the_user_clicks_on_create_calendar_event_button() {
//Actions actions = new Actions(Driver.getDriver());
        //  actions.moveToElement(calendarPage_aa.createEvent).click().perform();

        calendarPage_aa.createEvent.click();
        BrowserUtils.sleep(3);


    }

    @When("the user clicks on repeat checkbox")
    public void the_user_clicks_on_repeat_checkbox() {
//        Actions actions = new Actions(Driver.getDriver());
//        BrowserUtils.sleep(3);
//        actions.moveToElement(calendarPage_aa.repeatCheckbox).perform();
//        BrowserUtils.sleep(3);
        calendarPage_aa.repeatCheckbox.click();
        BrowserUtils.sleep(3);

    }


    @Then("the Repeat Every field should show {string} by default")
    public void the_repeat_every_field_should_show_by_default(String string) {
        BrowserUtils.sleep(3);
        String expectedValue = "1";
        String actualValue = calendarPage_aa.repeatEveryInput.getDomAttribute("value");
        System.out.println("actualValue = " + actualValue);
        System.out.println("expectValue = " + expectedValue);
        Assert.assertEquals(expectedValue, actualValue);


    }

    @When("the calender event repeat field is cleared")
    public void theCalenderEventRepeatFieldIsCleared() {
        // Locate the repeat field and clear it
        calendarPage_aa.repeatEveryInput.clear();
        BrowserUtils.sleep(1);
        System.out.println("Error message displayed: " + calendarPage_aa.repeatEveryInput.isDisplayed());
    }


    @Then("user should see {string} warning")
    public void userShouldSeeWarning(String string) {
        BrowserUtils.sleep(2);
        String expectedWarning = "This value should not be blank.";
        String actualWarning = calendarPage_aa.errorMessage2.getText();
        System.out.println("actualValue = " + actualWarning);
        System.out.println("expectValue = " + expectedWarning);
        Assert.assertEquals(expectedWarning, actualWarning);
        BrowserUtils.sleep(3);
    }

}
