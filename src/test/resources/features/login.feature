@login @smoke
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @driver
  Scenario: Verify login as a driver
    Given the user logged in as a "driver"
    Then the user should see "Dashboard" in the title

  @sales
  Scenario: Verify login as a sales manager
    Given the user logged in as a "sales manager"
    Then the user should see "Dashboard" in the title

  @store
  Scenario: Verify login as a store manager
    Given the user logged in as a "store manager"
    Then the user should see "Dashboard" in the title


  @outline @smoke
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    Then the user should see "Dashboard" in the title
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |