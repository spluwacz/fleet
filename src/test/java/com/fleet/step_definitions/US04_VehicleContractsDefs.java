package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleContracts_OS;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US04_VehicleContractsDefs {
    LoginPage loginPage = new LoginPage();
    VehicleContracts_OS vehicleContracts_OS = new VehicleContracts_OS();


    @When("I navigate to the Vehicle Contracts page")
    public void i_navigate_to_the_vehicle_contracts_page() {
        loginPage.navigateToModule("Fleet", "Vehicle Contracts");

        Actions actions = new Actions(Driver.getDriver()).click();
        BrowserUtils.sleep(5);
        //actions.moveToElement(vehicleContracts_OS.vehicleContracts).perform();
        //BrowserUtils.sleep(5);
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String string) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa3.vytrack.com/entity/Extend_Entity_VehicleContract";
        Assert.assertEquals(expectedUrl, actualUrl);
        BrowserUtils.sleep(5);

    }
    @Then("the URL should be {string}")
    public void the_url_should_be(String string) {

    }


    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String arg0) {
    }

    @And("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
    }

}
