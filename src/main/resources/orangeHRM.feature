Feature: OrangeHRM Login

  Scenario Outline: Login verification on Orange HRM

    Given I launch the browser
    And I enter <username> and <password>
    When I log on to the HRM page
    And Verify the Title of the page
    Then I close the browser


    Examples:
      |username  |password
      |admin     |admin
      |manager   |demouserpwd
      |user1     |demouserpwd
      |user2     |demouserpwd
      |user3     |demo