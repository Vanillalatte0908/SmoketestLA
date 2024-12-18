@smoketestandroidenglish
Feature: smoketestandroidenglish

     		 Scenario: LA-00001-ENG-Login with phone number without OTP
             When I enter the phone number "85281409935"
              And I take a screenshot "Login"
              And I click the start button
              And I enter the PIN "123455"
              And I take a screenshot "Login1"
             Then I should see the home screen
              And I take a screenshot "Login2"

				 Scenario: LA-00002-ENG-Successfully change PIN with valid inputs
  			  	 When I navigate to the Profile section1
  			  	 And I tap on PIN Settings1
  			  	 And I prepare a folder for screenshots1
   			  	 And I take a screenshot with name1 "ChangePin"
  			  	 And I tap on Change PIN1
  			  	 And I take a screenshot with name1 "ChangePin1"
          	 And I enter the PIN "123455"
  			  	 And I take a screenshot with name1 "ChangePin2"
  			  	 And I enter the PIN "112233"
          	 And the user the re enter the pinned "112233"
   			  	 And I take a screenshot with name1 "ChangePin4"
   			  	 And the user confirms the action
   			  
        Scenario: LA-00003-ENG-Resetting PIN via security question BEFORE LOGIN
        		  And the user confirms the relogin
        		  When I open apps linkaja
              When I enter the phone number "85281409935"
              And I click the start button
              And the user navigates to Forgot PIN and selects a security question
              And the user enters the answer "Linkaja"
              And I enter the PIN "123455"
              And the user the re enter the pinned "123455"
              And the user confirms the action

        Scenario: LA-00004-ENG-Login with phone number without OTP
             When I enter the phone number "85281409935"
              And I take a screenshot "Login"
              And I click the start button
              And I enter the PIN "123455"
              And I take a screenshot "Login1"
             Then I should see the home screen
              And I take a screenshot "Login2"
    
        Scenario: LA-00005-ENG-Dashboard click
             When The user taps on History
             When The user taps on Pay
             And I take a screenshot "Dashboard"
             When The user taps on ImageButton1
             And I take a screenshot "Dashboard2"
             When The user taps on Inbox
             And I take a screenshot "Dashboard3"
             When The user taps on Profile
             And I take a screenshot "Dashboard4"
             When The user taps on Home
    
        Scenario: LA-00006-ENG-Users Check Balance
             When The user taps on Your Balance
             When The user takes a screenshot of balance screen
             When The user taps on Home
             When The user takes a screenshot of home screen
        
        Scenario: LA-00007-ENG-User checks Bonus Balance
             When The user taps on Bonus Balance
             When The user takes a screenshot of bonus balance screen
             When The user taps the ImageButton
             When The user takes a screenshot of the next screen
    
        Scenario: LA-00008-ENG-User Check Favorite
             When I tap on the first button
             And I take a screenshot "Favorite"
             And I tap on the view group
             And I tap on the first image button
             And I take a screenshot "Dashboard"
             And I tap on the second image button
    
        Scenario: LA-00009-ENG-User Check with MyQR and Ticket Code sections
             When I tap on 'See All' under MyQR and Token section
             When I tap on 'Ticket Code'
             And I take a screenshot "Myqr"
              And I tap on the image button2
    
        Scenario: LA-00010-ENG-User Check through the 'Voucher' section and performs actions
             When I tap on 'See All' under MyQR and Token section
              And I tap on 'Voucher'
             When The user taps the ImageButton
    
    
        Scenario: LA-000011-ENG-User navigates to My QR
             When I tap on 'See All' under MyQR and Token section
             Then I take a screenshot of the MyQR screen
             When I tap on 'My QR'
             Then I take another screenshot of the MyQR details screen
             When I tap on 'Back Button'
    
        Scenario: LA-00012-ENG-User views e-statement and voucher section
             When I tap on 'See All' under MyQR and Token section
             When I tap on 'E-statement LinkAja'
             Then I take a screenshot of the e-statement screen
             When The user taps the ImageButton
             When I tap on 'See All' under MyQR and Token section
             When I tap on 'Voucher'
             Then I take a screenshot of the voucher screen
             When The user taps the ImageButton
    
        Scenario: LA-00013-ENG-User Generate a token and capture screenshots
             When I tap on 'See All' under MyQR and Token section
              And I take a screenshot of the dashboard
              And I create a new token
              And I enter the PIN "123455"
              And I wait for the application to respond
              And I take a screenshot of the dashboard
              When The user taps the ImageButton
   
        Scenario: LA-00014-ENG-User Check Profile, Payment Method, and Policy sections
             When I navigate to the Profile page
             When I tap on the 'Payment Method' section
             When The user taps the ImageButton
             When I tap on the 'Terms of Service' section
             When The user taps the ImageButton
             When I tap on the 'Privacy Policy' section
             When The user taps the ImageButton
             When I tap on the 'Help Center' section
             When The user taps the ImageButton
    
        Scenario: LA-00015-ENG-Execute a P2P transaction and capture screenshots
             When The user taps on Home
             When I tap on "Send Money" on the dashboard
             Then I capture a screenshot labeled "P2P"
             When I tap on "Phone Number" under MyQR and Token
             Then I capture a screenshot labeled "P2P1"
             When I select the recipient
             Then I capture a screenshot labeled "P2P2"
             When I tap the amount input field
             Then I capture a screenshot labeled "P2P3"
             When I enter the amount "1"
             When I tap on 'Back Button'
             When I tap on 'Back Button'
             When I tap on 'Back Button'
    
        Scenario: LA-00016-ENG-User completes cash-out process with ATM withdrawal and payment options\
             When The user taps on Home
             When I tap on 'cashout' on the dashboard1
             Then I take a screenshot of the current screen
             When I tap on 'ATM Withdrawal'
             When I tap on 'Association of State-Owned Banks (HIMBARA)' tap1
             When I tap on 'Rp 100.000' tap2
             Then I take a screenshot of the selected ATM withdrawal
             When The user taps the ImageButton
             When The user taps the ImageButton
             When I tap on 'BCA' tap3
             Then I take a screenshot of BCA payment screen
             When I tap on 'Rp 100.000' again
             Then I take a screenshot of the final ATM withdrawal confirmation
             When The user taps the ImageButton
             When The user taps the ImageButton
             When The user taps the ImageButton
             When The user taps the ImageButton
    
        Scenario: LA-00017-ENG-User Verify language switching in the app
             When I navigate to the Profile page
             When the user changes the language to English
             And I take a screenshot "Language"
             When the user changes the language back to Indonesia
             And I take a screenshot "language2"
             When the user navigates to the Profile indo page1
             And I take a screenshot "language3"
             When the user taps on Bahasa option
             When the user changes the language to English1
             And I take a screenshot "language4"
             When the user waits for Home page to load
    
        Scenario: LA-00018-ENG-User logs out from the application
             When I navigate to the Profile page
              And I take a screenshot of the Profile page
              And I scroll to the Logout button
              And I wait for the Logout button to appear
              And I take a screenshot after the Logout button appears
             When I click the Logout button
             Then I take a screenshot after logging out