package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage_KT {

    public PinbarPage_KT(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn minimize-button gold-icon']")
    public WebElement pinButton;

    @FindBy(xpath = "//h3[contains(text(),'How To Use Pinbar')]")
    public WebElement howToUseText;

    @FindBy(xpath = "//p[contains(text(),'Use pin icon on the right top corner of page to cr')]")
    public WebElement usePintText;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement imageVerify;


}
