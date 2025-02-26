package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleEditPage_DS extends BasePage {

    @FindBy(xpath = "(//a[.='...'])[1]")
    public WebElement threeDotMenu;

    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement viewMenuItem;

    @FindBy(xpath = "(//a[@title='Edit'])[1]")
    public WebElement editMenuItem;

    @FindBy(xpath = "(//i[@class='fa-trash-o hide-text'])[1]")
    public WebElement deleteMenuItem;

}