
@Functional
Feature: Feature: Calendar Event Creation

  agile story:As a user I want to create recurring calendar events
  so that I can schedule repetitive meetings

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify default value and error message for recurring calendar events
    Given user logs in as "<userType>"
    When user navigates to activities dropdownpage
    And the user hovers over the activities
    And clicks on Create Calendar Event button
    And enables the Repeat checkbox
    Then the Repeat Every field should show "1" by default
    When user clears the Repeat Every field
    Then the error message "This value should not be blank." should be displayed
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

