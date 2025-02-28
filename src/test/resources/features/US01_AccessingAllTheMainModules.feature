@smoke
Feature: As a user, I should be accessing all the main modules of the app.

  Background: User is already in the log in page
    Given the user is on the login page

  @nur
  Scenario Outline: Verify app users see the modules that they have
    Given the user logged in as "<userType>"
    Then user should see "<menuOptions>"

    Examples:
      | userType      | menuOptions                                                                            |
      | driver        | Fleet, Customers, Activities, System                                                   |
      | sales manager | Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System |
      | store manager | Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System |

