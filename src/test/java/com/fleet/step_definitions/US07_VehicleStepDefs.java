package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US07_VehiclePage;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;


public class US07_VehicleStepDefs {

    LoginPage loginPage = new LoginPage();
    US07_VehiclePage vehiclePage = new US07_VehiclePage();

    @When("user navigates to Vehicles under Fleet dropdown")
    public void user_navigates_to_vehicles_under_fleet_dropdown() {
     loginPage.waitUntilLoaderScreenDisappear();
     loginPage.navigateToModule("Fleet","Vehicles");
    }
    @Then("the user should see all checked boxes are unchecked")
    public void the_user_should_see_all_checked_boxes_are_unchecked() {

        vehiclePage.checkboxAll.isSelected();
        System.out.println("vehiclePage.checkboxAll.isSelected() expecting false = " + vehiclePage.checkboxAll.isSelected());


    }
    @Then("the user can select all cars by selecting first checkbox")
    public void the_user_can_select_all_cars_by_selecting_first_checkbox() {
        vehiclePage.checkboxAll.click();
        System.out.println("vehiclePage.checkboxAll.isSelected() expecting true = " + vehiclePage.checkboxAll.isSelected());

        Assert.assertTrue(vehiclePage.checkboxAll.isSelected());
        vehiclePage.checkboxAll.click();
    }
    @Then("user should be able to select a random car")
    public void user_should_be_able_to_select_a_random_car() {


    }
}