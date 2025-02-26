package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class US07_VehiclePage {

    public US07_VehiclePage() {

        PageFactory.initElements(Driver.getDriver(),US07_VehiclePage.this);


    }
    @FindBy(xpath = "//button//input[@type='checkbox'][1]")
    public WebElement checkboxAll;

    @FindBy(xpath = "//table//tr/td[1]//input[@type='checkbox']")
    public List<WebElement> column1checkboxes;


    }



