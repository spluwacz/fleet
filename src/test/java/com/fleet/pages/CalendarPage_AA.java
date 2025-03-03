package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage_AA extends BasePage {


    @FindBy(linkText = "Activities")

    public WebElement activitiesDrop;


    @FindBy(xpath = "//a[normalize-space()='Create Calendar event']")
    public WebElement createEvent;


    @FindBy(xpath = "//span[normalize-space()='Calendar Events']")
    public WebElement calendarEvent;



    @FindBy(css = "a[title='Create Calendar event']")
    public WebElement createCalendarEventBtn;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@value='1'])[2]")
    public WebElement repeatEveryInput;

    //@FindBy(css = ".validation-failed")
    @FindBy(xpath = "(//span['This value should not be blank.'])[91]")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[contains(text(),'This value should not be blank.')]")
    public WebElement errorMessage2;

    @FindBy(id = "tinymce")
    public WebElement frame1;


}

