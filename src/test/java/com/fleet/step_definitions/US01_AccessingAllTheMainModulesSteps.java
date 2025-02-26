package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_AccessingAllTheMainModulesSteps {

    LoginPage loginPage = new LoginPage();

    @Then("user should see {string}")
    public void user_should_see(String expectedMenuOptions) throws InterruptedException {
        loginPage.waitUntilLoaderScreenDisappear();

        List<String> actualMenuOptions = new ArrayList<>();
        for (WebElement menuOption : loginPage.menuOptions) {
            actualMenuOptions.add(menuOption.getText().trim());
        }
        String actualMenuOptionsListAsString = String.join(", ", actualMenuOptions);
        Assert.assertEquals(expectedMenuOptions, actualMenuOptionsListAsString);
        System.out.println("menuOptionsText = " + actualMenuOptionsListAsString);
        System.out.println("expectedMenuOptions = " + expectedMenuOptions);

    }

}
