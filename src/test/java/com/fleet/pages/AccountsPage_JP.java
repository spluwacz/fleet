package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage_JP {


 public AccountsPage_JP(){
     PageFactory.initElements(Driver.getDriver(), this);
 }

 @FindBy(xpath = "")
    public WebElement dropdownList;

}
