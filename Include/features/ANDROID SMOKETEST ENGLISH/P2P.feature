Feature: Send Money P2P Transfer

  Scenario: Send money using phone number
    Given The application is launched
    When I tap on "Send Money"
    And I take a screenshot "P2P"
    And I select "Phone Number" for the transfer
    And I take a screenshot "P2P1"
    And I select a recent contact
    And I take a screenshot "P2P2"
    And I enter the amount "1"
    And I take a screenshot "P2P3"
    And I tap "Next"
    And I take a screenshot "P2P5"
    And I confirm the transaction
    And I take a screenshot "P2P6"
    Then I close the application