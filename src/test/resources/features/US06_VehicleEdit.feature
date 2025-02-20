@vehicle_edit
Feature: User should be able to see edit icons on the Vehicles page
         while hovering over the three-dot menu

  Background: User is already on the login page
    Given the user is on the login page


  Scenario Outline: Verify user can see edit functions on the vehicle page
    Given the user logged in as "<userType>"
    When user navigates to Vehicles under the Fleet dropdown
    And user hovers over the three-dot menu
    Then user sees View , Edit , and Delete options
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

