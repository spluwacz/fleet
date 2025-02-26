@accounts
Feature: User should be filter customers info on the Accounts page

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: Verify that user can see 8 filter items on the Account page
    Given the user logged in as a "sales manager"
    When user navigate to Accounts under Customers dropdown
    Then user should see below list


  |ACCOUNT NAME, CONTACT NAME, CONTACT EMAIL, CONTACT PHONE, OWNER, BUSINESS UNIT, CREATED AT, UPDATED AT|
