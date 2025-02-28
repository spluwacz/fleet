@Functional
Feature: Feature: Calendar Event Creation

  As a user I want to create recurring calendar events
  so that I can schedule repetitive meetings

  Background: User is already in the log in page
    Given the user is on the login page

    @UserStory1
  Scenario:US08_AC1TC1 Verify repeat number is 1 by default under recurring events
      Given the user logged in as a "sales manager"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    Then the Repeat Every field should show "1" by default


  Scenario:US08_AC1TC2 Verify repeat number is 1 by default under recurring events
    Given the user logged in as a "driver"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    Then the Repeat Every field should show "1" by default

  Scenario:US08_AC1TC3 Verify repeat number is 1 by default under recurring events
    Given the user logged in as a "store manager"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    Then the Repeat Every field should show "1" by default

  @UserStory2
  Scenario:US08_AC2TC1 Verify error message appears when deleting the repeat number
    Given the user logged in as a "sales manager"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    When the calender event repeat field is cleared
    Then user should see "This value should not be blank." warning

  Scenario:US08_AC2TC2 Verify error message appears when deleting the repeat number
    Given the user logged in as a "driver"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    When the calender event repeat field is cleared
    Then user should see "This value should not be blank." warning

  Scenario:US08_AC2TC3 Verify error message appears when deleting the repeat number
    Given the user logged in as a "store manager"
    When user navigates to activities- Calendars Events
    And  the user clicks on Create Calendar Event button
    And the user clicks on repeat checkbox
    When the calender event repeat field is cleared
    Then user should see "This value should not be blank." warning
