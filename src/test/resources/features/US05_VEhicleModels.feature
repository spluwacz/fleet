@driver_bsr
Feature:Users should be able to login
  User story: As a user, I should be able to login with correct credentials to different accounts. And 10 columns should be displayed.
  Accounts are: driver, sales manager, store manager

  Scenario Outline:Fleet Management Search Functionality
    Given user is on the login page
    When user enters the username "<username>" and password "<password>"
    And user hover over to the Fleet menu option
    And user clicks to the Vehicle Model option
    Then user should see 10 columns on the Vehicle Model Page

    Examples:
      | username               | password               |
      | store_manager_username | store_manager_password |
      | sales_manager_username | sales_manager_password |


      Scenario: Verify Restricted Access to Vehicles Model Page
        Given user is on the login page
        When user enters the username "driver_username" and password "driver_password"
        And user hover over to the Fleet menu option
       And user clicks to the Vehicle Model option
       Then user see "You do not have permission to perform this action" message on the screen

