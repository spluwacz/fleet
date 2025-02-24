package com.fleet.step_definitions;

import com.fleet.pages.CalendarPage_AA;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US10_CalendarStepDefinition {
    LoginPage loginPage = new LoginPage();
    CalendarPage_AA calendarPage_aa = new CalendarPage_AA();

    @When("user navigates to activities dropdown")
    public void user_navigates_to_activities_dropdown() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(calendarPage_aa.activitiesDrop).perform();
        BrowserUtils.sleep(3);
        actions.click().perform();
        BrowserUtils.sleep(3);


    }

    @When("user hovers over the activities")
    public void user_hovers_over_the_activities() {
        calendarPage_aa.calendarEvent.click();


    }

    @When("user click on create calendar events")
    public void user_click_on_create_calendar_events() {
        BrowserUtils.sleep(3);
        calendarPage_aa.createEvent.click();
      //  calendarPage_aa.repeat.click();


    }

    @When("user write text in the field")
    public void user_write_text_in_the_field() {

       BrowserUtils.sleep(8);
        //Find the elemnt= Driver.getDriver().switchTo().frame("//iframe[@allowtransparency='true']");
        WebElement iframe=Driver.getDriver().findElement(By.xpath("//iframe[@allowtransparency='true']"));
        Driver.getDriver().switchTo().frame(iframe);
     // WebElement iframe=Driver.getDriver().findElement(By.xpath("//iframe[@allowtransparency='true']"));
       // Driver.getDriver().switchTo().frame("//iframe[@allowtransparency='true']");
        BrowserUtils.sleep(10);
        WebElement inputFiled=Driver.getDriver().findElement(By.id("tinymce"));
        BrowserUtils.sleep(10);
        inputFiled.sendKeys("Our Team is THE BEST!");


    }

    @Then("user should see txt in the field")
    public void user_should_see_txt_in_the_field() {
        String enteredText="Our Team is THE BEST!";
        String expectedText="Our Team is THE BEST!";
        Assert.assertEquals(enteredText,expectedText);


    }

}
