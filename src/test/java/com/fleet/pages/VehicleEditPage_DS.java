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

    @FindBy(linkText = "...")
    public WebElement threeDotMenu;




    /*

      @FindBy (linkText = "Fleet")
    public WebElement fleetDropdown;

        @FindBy(linkText = "Vehicles")
    public WebElement Vehicles;

     */


}
