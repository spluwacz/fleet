@VehicleAmie
Feature: As a user (Sales and Store manager), I should be able to select any vehicle from the
  Vehicles page (web table).

  Background: User is already in the log in page
    Given the user is on the login page



  Scenario Outline: Verify that once the user launch on the Vehicles page, can see all the checkboxes
  as unchecked,can check the first checkbox to select all the cars and also can verify by selecting any random car
    Given the user logged in as "<userType>"
    When user navigates to Vehicles under Fleet dropdown
    Then the user should see all checked boxes are unchecked
    And the user can select all cars by selecting first checkbox
    Then user should be able to select a random car

    Examples:
      | userType      |
      | sales manager |
      | store manager |










#   What is a better scenario option ask team

  #Scenario: Verify that once the store manager launch on the Vehicles page, the users can see all the checkboxes
  #as unchecked,can check the first checkbox to select all the cars and also can verify can select any car
   # Given the user logged in as a "store manager"
   # When user navigates to Vehicles under Fleet dropdown
   # Then the user should see all checked boxes are unchecked
   # And the user can select all cars by selecting first checkbox
   # Then user should be able to select a random car


# Scenario: Verify that once the sales manager launch on the Vehicles page, the users can see all the checkboxes
#  as unchecked.
#    Given the user logged in as a "sales manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then the user should see all checked boxes are unchecked
#
#  Scenario: Verify that sales manager can check the first checkbox to select all the cars
#    Given the user logged in as a "sales manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then the user can select all cars by selecting first checkbox
#
#  Scenario: Verify that sales manager can select any car
#    Given the user logged in as a "sales manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then user should be able to select a random car
#
#
#
#
#  Scenario: Verify that once the store manager launch on the Vehicles page, the users can see all the checkboxes
#  as unchecked.
#    Given the user logged in as a "store manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then  user should see all checked boxes are unchecked
#
#  Scenario: Verify that store manager can check the first checkbox to select all the cars
#    Given the user logged in as a "store manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then  user can select all cars by selecting first checkbox
#
#  Scenario: Verify that store manager can select any car
#    Given the user logged in as a "store manager"
#    When user navigates to Vehicles under Fleet dropdown
#    Then  user should be able to select a random car