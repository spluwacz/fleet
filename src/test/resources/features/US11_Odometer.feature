@saltaodometer
Feature: As a user, I want to view car odometer info on the
  Vehicles Odometer page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that user see the error message
  "You do not have permission to perform this action." when they
  click the Vehicle Odometer module.

    Given the user logged in as "<userType>"
    When user navigates to the Fleet dropdown and vehicle odometer
    Then user should see the error message "You do not have permission to perform this action."

    Examples:
      | userType      |
      | sales manager |
      | store manager |


      Scenario: Verify that user see the default page as 1.
      Given the user logged in as a "driver"
      When user navigates to the Fleet dropdown and vehicle odometer
      Then user see the default page as 1

  Scenario: Verify that user see the View Per Page as 25 by default.
    Given the user logged in as a "driver"
    When user navigates to the Fleet dropdown and vehicle odometer
    Then user see the View Per Page as 25 by default










