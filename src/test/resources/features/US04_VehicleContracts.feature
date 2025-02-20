@vehicle_contracts_feature
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Store Manager can access Vehicle Contracts page
    Given the user logged in as "store manager"
    When I navigate to the Vehicle Contracts page
    Then the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"
    And the URL should be "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"

  Scenario: Sales Manager can access Vehicle Contracts page
    Given the user logged in as "sales manager"
    When I navigate to the Vehicle Contracts page
    Then the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"
    And the URL should be "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"

  Scenario: Driver cannot access Vehicle Contracts page
    Given the user logged in as "driver"
    When I navigate to the Vehicle Contracts page
    Then I should see an error message "You do not have permission to perform this action."
    And I should be redirected to the login page