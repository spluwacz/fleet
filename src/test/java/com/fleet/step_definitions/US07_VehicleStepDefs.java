package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.VehiclePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;


public class US07_VehicleStepDefs {

    LoginPage loginPage = new LoginPage();
    VehiclePage vehiclePage = new VehiclePage();




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

       //this is a way to pick the user choice of a random checkbox + take the //away to activate remember to //the other option

       // Collections.shuffle(vehiclePage.column1checkboxes);
       // vehiclePage.column1checkboxes.get(2).click();

       // This is another way to pick a random checkbox where it picks a checkbox  for you
        if (vehiclePage.column1checkboxes.isEmpty()) {
            System.out.println("No elements found for the provided locator.");
             return;
        }

        // Create a Random object to generate a random index
        Random random = new Random();
        // Generate a random index between 0 and the size of the list
        int randomIndex = random.nextInt(vehiclePage.column1checkboxes.size());

        // Return the randomly selected element
         vehiclePage.column1checkboxes.get(randomIndex);
        System.out.println("the random index is " + randomIndex);
    }


    }
