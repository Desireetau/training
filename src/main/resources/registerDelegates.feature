Feature: Registering a delegate
  Scenario Outline: We are registering delegates for training
    Given We open Datamate website
    When On the registration form we enter details
    Then Capture First Name "<FirstName>"
    And Capture Last Names "<LastName>"
    Then We are going ot close the browser
    Examples:
      |FirstName  |LastName|
      |Thapelo    |Cele|
      |Piet       |Smith|