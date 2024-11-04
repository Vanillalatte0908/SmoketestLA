@verification
Feature: Login without OTP

  Scenario: Login with phone number without OTP
    Given The application is started
    When I enter the phone number "85281409935"
    And I take a screenshot "Login"
    And I click the start button
    And I enter the PIN "123455"
    And I take a screenshot "Login1"
    Then I should see the home screen
    And I take a screenshot "Login2"
    And I close the application