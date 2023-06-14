Feature: Login Page Functionality
  Scenario Outline: Successful Login with valid login details
    Given A user navigates to HRM website
    When The login page opens
    And Capture <username> And <password>
    And Click login  button.
    Then Login must be successful.
    Then Close browser.

    Examples:
    |username   | password|
    |Desiree    |Orange@2022|
