@saltaodometer
Feature: As a user, I want to view car odometer info on the
  Vehicles Odometer page.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that user see the error message
  "You do not have permission to perform this action." when they
  click the Vehicle Odometer module.

    Given the user logged in as "<userType>"
    When user navigates to the Fleet dropdown
    Then user hovers over the Vehicle Odometer
    And user click on Vehicle Odometer
    Then user should see the error message "You do not have permission to perform this action."

    Examples:
      | userType      |
      | sales manager |
      | store manager |






