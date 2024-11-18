@verification
Feature: One flow 

  Scenario: Login with phone number without OTP
    When I enter the phone number "85281409935"
    And I take a screenshot "Login"
    And I click the start button
    And I enter the PIN "123455"
    And I take a screenshot "Login1"
    Then I should see the home screen
    And I take a screenshot "Login2"
    
    Scenario: Dashboard click
    When The user taps on History
    When The user taps on Pay
    When The user taps on ImageButton
    When The user taps on Inbox
    When The user taps on Profile
    When The user taps on Home
    
    Scenario: Check Balance
    When The user taps on Your Balance
    When The user takes a screenshot of balance screen
    When The user taps on Home
    When The user takes a screenshot of home screen
    Then The user closes the application
    
  	Scenario: User logs out from the application
    When I navigate to the Profile page
    And I take a screenshot of the Profile page
    And I scroll to the Logout button
    And I wait for the Logout button to appear
    And I take a screenshot after the Logout button appears
    When I click the Logout button
    Then I take a screenshot after logging out