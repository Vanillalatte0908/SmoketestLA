@smoketestandroidenglish
Feature: smoketestandroidindonesia


	Scenario: LA-00001-ENG-Login with phone number without OTP
     When I enter the phone number "081113019756"
     And I take a screenshot "Login"
     And I click the start button
     And I enter the PIN "123455"
     And I take a screenshot "Login1"
     Then I should see the home screen
     And I take a screenshot "Login2"
              
	Scenario: LA-00002-ENG-User Verify language switching in the app
     When I navigate to the Profile page
     When the user changes the language to English
     And I take a screenshot "Language"
     When the user changes the language back to Indonesia
     And I take a screenshot "language2"
     When the user navigates to the Profile indo page1

	Scenario: LA-00003-IDN-User logs out of the linkaja apps
    When the user navigates to the profile section
    And the user scrolls to the "Keluar" option
    And the user logs out
    Then the application is closed
    
	Scenario: LA-00004-IDN-Login apps
    When the user enters phone number indonesia "81113019756"
    Then a folder for screenshots is created with the current date
    When the user starts the app and enters the PIN "123455"
    Then the user navigates through various sections of the app
    And screenshots are captured at each step

 	Scenario: LA-00005-IDN-User completes a Favorite transaction
    When the user taps the Favorite button
    Then a folder for screenshots is created with the current date
    When the user interacts with the app to make a payment
    Then screenshots are captured at each step
   
 	Scenario: LA-00006-IDN-User completes the Isi Saldo flow with multiple bank and merchant options
    When the user taps on "Isi Saldo"
    Then a folder for screenshots is created with the current date
    When the user navigates through bank and merchant options
    Then screenshots are captured at each step
    
    