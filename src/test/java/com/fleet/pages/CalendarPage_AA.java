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


    @FindBy(id = "tinymce")
    public WebElement frame1;

}

