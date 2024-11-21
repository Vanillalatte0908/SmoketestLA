package oneflow

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Then

class Oneflowenglish {
	// Initialize variables for folder paths and timestamps
	String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
	String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
	String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
	String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "loginnoootp"

	@When("I enter the phone number {string}")
	def enterPhoneNumber(String phoneNumber) {
		KeywordUtil.logInfo("Entering phone number: " + phoneNumber)
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'), phoneNumber)
	}

	@And("I take a screenshot {string}")
	def takeScreenshot(String stepName) {
		String screenshotPath = folderPath + '/' + stepName + '_' + todaysDate + '_' + nowTime + '.png'
		KeywordUtil.logInfo("Taking screenshot: " + screenshotPath)
		Mobile.takeScreenshot(screenshotPath)
	}

	@And("I click the start button")
	def clickStartButton() {
		KeywordUtil.logInfo("Clicking the Start button")
		Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)
	}

	@And("I enter the PIN {string}")
	def enterPIN(String pin) {
		KeywordUtil.logInfo("Entering PIN: " + pin)
		Mobile.sendKeys(findTestObject('ANDROID/Login without OTP/android.widget.EditText'), pin)
	}

	@Then("I should see the home screen")
	def verifyHomeScreen() {
		KeywordUtil.logInfo("Verifying the home screen")
		Mobile.waitForElementPresent(findTestObject('ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 10)
	}

	//DASHBOARD

	@When("The user taps on History")
	def tapHistory() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - History'), 5)
	}

	@When("The user taps on Pay")
	def tapPay() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Pay'), 5)
	}

	@When("The user taps on ImageButton1")
	def tapImageButton1() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.ImageButton'), 5)
	}

	@When("The user taps on Inbox")
	def tapInbox() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Inbox'), 5)
	}

	@When("The user taps on Profile")
	def tapProfile() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Profile'), 5)
	}

	@When("The user taps on Home")
	def tapHome1() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 5)
	}

	//BALANCE

	@When("The user taps on Your Balance")
	def tapYourBalance() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.TextView - Your Balance'), 3)
	}

	@When("The user takes a screenshot of balance screen")
	def takeScreenshotBalance() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Balance"
		Files.createDirectories(Paths.get(folderPath))

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ balance' + todaysDate + '_' + nowTime + '.png')
	}

	@When("The user takes a screenshot of home screen")
	def takeScreenshotHome() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Balance"

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ balance1' + todaysDate + '_' + nowTime + '.png')
	}

	//BONUS BALANCE

	@When("The user taps on Bonus Balance")
	def tapBonusBalance() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.TextView - Bonus Balance'), 0)
	}

	@When("The user takes a screenshot of bonus balance screen")
	def takeScreenshotBonusBalance() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Bonbal"
		Files.createDirectories(Paths.get(folderPath))

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ Bonbal' + todaysDate + '_' + nowTime + '.png')
	}

	@When("The user taps the ImageButton")
	def tapImageButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.ImageButton'), 0)
	}

	@When("The user takes a screenshot of the next screen")
	def takeScreenshotAfterTap() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Bonbal"

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ Bonbal1' + todaysDate + '_' + nowTime + '.png')
	}

	//LOGOUT
	@When("I navigate to the Profile page")
	def navigateToProfile() {
		KeywordUtil.logInfo("Navigating to Profile page")
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Profile'), 0)
	}

	@And("I take a screenshot of the Profile page")
	def takeProfileScreenshot() {
		KeywordUtil.logInfo("Taking screenshot of the Profile page")
		Files.createDirectories(Paths.get(folderPath))
		Mobile.takeScreenshot(folderPath + '/ProfilePage_' + todaysDate + '_' + nowTime + '.png')
	}

	@And("I scroll to the Logout button")
	def scrollToLogout() {
		KeywordUtil.logInfo("Scrolling to Logout button")
		Mobile.scrollToText('Logout')
	}

	@And("I wait for the Logout button to appear")
	def waitForLogoutButton() {
		KeywordUtil.logInfo("Waiting for Logout button")
		Mobile.waitForElementPresent(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Logout'), 10)
	}

	@And("I take a screenshot after the Logout button appears")
	def takeLogoutButtonScreenshot() {
		KeywordUtil.logInfo("Taking screenshot after Logout button appears")
		Mobile.takeScreenshot(folderPath + '/LogoutButton_' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I click the Logout button")
	def clickLogoutButton() {
		KeywordUtil.logInfo("Clicking Logout button")
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Logout'), 3)
	}

	@Then("I take a screenshot after logging out")
	def takePostLogoutScreenshot() {
		KeywordUtil.logInfo("Taking screenshot after logging out")
		Mobile.takeScreenshot(folderPath + '/PostLogout_' + todaysDate + '_' + nowTime + '.png')
	}

	// FAVORITE

	@When("I tap on the first button")
	def tapFirstButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button'), 0)
	}

	@When("I tap on the view group")
	def tapViewGroup() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.view.ViewGroup (1)'), 0)
	}

	@When("I tap on the first image button")
	def tapFirstImageButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton (1)'), 0)
	}

	@When("I tap on the second image button")
	def tapSecondImageButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton (1)'), 0)
	}

	//MY QR

	@When("I tap on 'See All' under MyQR and Token section")
	def tapSeeAll() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - See All (1)'), 0)
	}

	@When("I tap on 'Ticket Code'")
	def tapTicketCode() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Ticket Code'), 3)
	}

	@When("I tap on the image button2")
	def tapImageButton2() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton'), 0)
	}

	//PROFILE TERM & CONDITION AND OTHERS

	@When("I tap on the 'Payment Method' section")
	def tapPaymentMethod() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Payment Method'), 7)
	}

	@When("I tap on the 'Terms of Service' section")
	def tapTermsOfService() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Terms of Service'), 7)
	}

	@When("I tap on the 'Privacy Policy' section")
	def tapPrivacyPolicy() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Privacy Policy'), 3)
	}

	@When("I tap on the 'Help Center' section")
	def tapHelpCenter() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Help Center'), 3)
	}

	//VOUCHER

	@When("I tap on 'Voucher'")
	def tapVoucher() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Voucher'), 3)
	}

	// CASHOUT WITHDRAWAL

	@When("I tap on 'cashout' on the dashboard1")
	def tapCashOut() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - CashOut'), 0)
	}

	@Then("I take a screenshot of the current screen")
	def takeScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "CW"
		Files.createDirectories(Paths.get(folderPath))

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ CW' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'ATM Withdrawal'")
	def tapATMWithdrawal() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - ATM Withdrawal'), 5)
	}

	@When("I tap on {string} tap1")
	def tapHIMBARA(String bankName) {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Association of State-Owned Banks (HIMBARA)'),
			0)
	}


	@When("I tap on 'Rp 100.000' tap2")
	def tapAmount() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Rp 100.000'), 5)
	}

	@Then("I take a screenshot of the selected ATM withdrawal")
	def takeAmountScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "CW"
		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ CW2' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'BCA' tap3")
	def tapBCA() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - BCA'), 0)
	}

	@Then("I take a screenshot of BCA payment screen")
	def takeBCAScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "CW"
		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ CW2' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'Rp 100.000' again")
	def tapAmountAgain() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Rp 100.000'), 0)
	}

	@Then("I take a screenshot of the final ATM withdrawal confirmation")
	def takeFinalScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "CW"
		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ CW1' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'ImageButton' three times")
	def tapImageButtonThreeTimes() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton (1)'), 0)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton (1)'), 0)
	}
	// E-Statment

	@When("I tap on 'E-statement LinkAja'")
	def tapEStatement() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - E-statement LinkAja'), 10)
	}

	@Then("I take a screenshot of the e-statement screen")
	def takeEStatementScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + 'E-statment and Voucher'
		Files.createDirectories(Paths.get(folderPath))

		Mobile.delay(20)
		Mobile.takeScreenshot(folderPath + '/ Estatment' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'See All' again")
	def tapSeeAllAgain() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - See All'), 0)
	}

	@Then("I take a screenshot of the voucher screen")
	def takeVoucherScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + 'E-statment and Voucher'

		Mobile.takeScreenshot(folderPath + '/ Voucher' + todaysDate + '_' + nowTime + '.png')
	}

	//MY QR GENERATE


	@Then("I take a screenshot of the MyQR screen")
	def takeMyQRScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "MyQR"
		Files.createDirectories(Paths.get(folderPath))

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ MyQR' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'My QR'")
	def tapMyQR() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - My QR'), 5)
	}

	@Then("I take another screenshot of the MyQR details screen")
	def takeMyQRDetailsScreenshot() {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "MyQR"

		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + '/ MyQR1' + todaysDate + '_' + nowTime + '.png')
	}

	@When("I tap on 'Back Button'")
	def tapBackButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton'), 0)
	}
	// GENERATE TOKEN

	@When("I navigate to the {string} section in MyQR and Token")
	public void navigateToSection(String sectionName) throws Exception {
		Mobile.tap(findTestObject("Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - " + sectionName), 0);
		Files.createDirectories(Paths.get(folderPath));
	}

	@And("I take a screenshot of the dashboard")
	public void takeDashboardScreenshot() throws Exception {
		Mobile.takeScreenshot(folderPath + "/Token_" + todaysDate + "_" + nowTime + ".png");
	}

	@And("I create a new token")
	public void createNewToken() throws Exception {
		Mobile.tap(findTestObject("Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Create Token"), 3);
		Mobile.takeScreenshot(folderPath + "/Token1_" + todaysDate + "_" + nowTime + ".png");
	}

	@And("I wait for the application to respond")
	public void waitForResponse() throws Exception {
		Mobile.delay(10);
	}
	//P2P

	@When('I tap on {string} on the dashboard')
	def tapOnDashboard(String elementName) {
		Mobile.tap(findTestObject("Object Repository/ANDROID/DashboardLA/android.widget.TextView - Send Money"), 2)
	}

	@Then('I capture a screenshot labeled {string}')
	def captureScreenshot(String label) {
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		Mobile.takeScreenshot("${folderPath}/${label}${todaysDate}_${nowTime}.png")
	}

	@When('I tap on {string} under MyQR and Token')
	def tapMyQRToken(String elementName) {
		Mobile.tap(findTestObject("Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Phone Number"), 5)
	}

	@When('I select the recipient')
	def selectRecipient() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.view.ViewGroup (3)'), 5)
	}

	@When('I tap the amount input field')
	def tapAmountInputField() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), 0)
	}

	@When("I enter the amount {string}")
	def enterAmount(String amount) {
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), amount)
	}

	@When('I navigate back and proceed by tapping {string}')
	def navigateBackAndTapNext(String buttonName) {
		Mobile.tap(findTestObject("Object Repository/ANDROID/DashboardLA/android.widget.Button - Next"), 0)
	}

	@When('I confirm the transaction')
	def confirmTransaction() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Confirm'), 0)
	}

	// CHANGE LANGUAGE

	@When('the user changes the language to English')
	def changeToEnglish() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/bahasa/android.widget.TextView - English'), 5)
			}

	@When('the user changes the language back to Indonesia')
	def changeToIndonesian() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/bahasa/android.widget.TextView - Indonesia'), 5)
	}


	@When("the user navigates to the Profile page1")
	def navigateToProfile1() {
		Mobile.tap(findTestObject('ANDROID/DashboardLA/android.widget.TextView - Profil'), 5)
		Mobile.delay(10)
		takeScreenshot("ProfilePage")
	}

	@When("the user taps on Bahasa option")
	def tapBahasaOption() {
		Mobile.tap(findTestObject('ANDROID/DashboardLA/android.widget.TextView - Bahasa'), 5)
	}

	@When("the user changes the language to English1")
	def changeToEnglish1() {
		Mobile.tap(findTestObject('ANDROID/DashboardLA/bahasa/android.widget.TextView - English (1)'), 5)
	}


	@Then("the user waits for Home page to load")
	def waitForHomePage() {
		Mobile.waitForElementPresent(findTestObject('ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 5)
	}
	//FLIGHT MODE

	@When("I navigate to the Connections screen")
	public void iNavigateToConnectionsScreen() {
		Mobile.pressBack();
		Mobile.tap(findTestObject("Object Repository/ANDROID/Connection/android.widget.TextView - Connections"), 5);
	}

	@When("I toggle the Flight Mode switch")
	public void iToggleTheFlightModeSwitch() {
		Mobile.tap(findTestObject("Object Repository/ANDROID/Connection/android.widget.Switch"), 5);
	}

	@Then("I take a screenshot after toggling the Flight Mode")
	public void iTakeScreenshotAfterTogglingFlightMode() {
		Mobile.delay(10);
		Mobile.takeScreenshot(folderPath + "/FlightMode" + todaysDate + "_" + nowTime + ".png");
	}

	@When("I close the app and reopen it")
	public void iCloseAndReopenApp() {
		Mobile.pressBack();
		Mobile.startExistingApplication("com.telkom.mwallet");
		Mobile.waitForElementPresent(findTestObject("ANDROID/DashboardLA/Home/android.widget.TextView - Home"), 0);
	}

	@Then("I take another screenshot")
	public void iTakeAnotherScreenshot() {
		Mobile.delay(10);
		Mobile.takeScreenshot(folderPath + "/FlightMode3" + todaysDate + "_" + nowTime + ".png");
	}
}
