package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;

public class VehicleEditPage_DS {

    public VehicleEditPage_DS() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[.='...'])[1]")
    public WebElement threeDotMenu;

    @FindBy (xpath = "(//a[@title='View'])[1]")
    public WebElement viewMenuItem;

    @FindBy (xpath = "(//a[@title='Edit'])[1]")
    public WebElement editMenuItem;

    @FindBy (xpath = "(//i[@class='fa-trash-o hide-text'])[1]")
    public WebElement deleteMenuItem;









    /*

    LOCATORS BELOW HAVE BEEN MOVED TO BASEPAGE

      @FindBy (linkText = "Fleet")
    public WebElement fleetDropdown;

        @FindBy(linkText = "Vehicles")
    public WebElement Vehicles;

     */


}