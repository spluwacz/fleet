@angel
Feature: User should be able to type into description
  field when create a calendar event

  Background: User is already on the login page
    Given the user is on the login page

  Scenario Outline: Verify user can see activities on the fleet management
    Given the user logged in as "<userType>"
    When user navigates to activities dropdown
    And user hovers over the activities
    And user click on create calendar events
    And user write text in the field
    Then user should see txt in the field

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |
