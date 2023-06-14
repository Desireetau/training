Feature: Contact Us Form
  Scenario: Fill in the Contact Us Form
    Given I open the Datamate website page
    When I click on the Contact Us link
    Then I fill in the Send a message form
    And I Close the web page