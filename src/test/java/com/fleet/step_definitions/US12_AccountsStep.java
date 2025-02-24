package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage_JP;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US12_AccountsStep {


     LoginPage loginPage = new LoginPage();
     AccountsPage_JP accountsPage = new AccountsPage_JP();


    @When("user navigate to Accounts under Customers dropdown")
    public void userNavigateToAccountsUnderCustomersDropdown() {
        loginPage.waitUntilLoaderScreenDisappear();
        loginPage.navigateToModule("Customers", "Accounts");
        BrowserUtils.sleep(5);
    }


    @Then("user should see below list")
    public void user_should_see_below_list(List<String> expectedDropdownList) {

    }


}
