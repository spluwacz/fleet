@chris @smoke
Feature: User should be able to learn hoe to use the pinbar feature

  Background: User is already in the log in page
    Given the user is on the login page


    Scenario Outline: Verify user can see "Learn how to use this space" link, “How To Use Pinbar” and
    “Use the pin icon on the right top corner of page to create fast access link in the pinbar.”
      Given the user logged in as "<userType>"
      When the user should see and click "Learn how to use this space" link
      Then the user should see "How To Use Pinbar" and "Use pin icon on the right top corner of page to create fast access link in the pinbar."
      And the user should verfiy image source "/bundles/oronavigation/images/pinbar-location.jpg"
      Examples:
        | userType      |
        | driver        |
        | sales manager |
        | store manager |
