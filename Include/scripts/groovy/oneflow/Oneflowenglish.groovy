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
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - History'), 5)
	}

	@When("The user taps on Pay")
	def tapPay() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Pay'), 5)
	}

	@When("The user taps on ImageButton")
	def tapImageButton1() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.ImageButton'), 5)
	}

	@When("The user taps on Inbox")
	def tapInbox() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Inbox'), 5)
	}

	@When("The user taps on Profile")
	def tapProfile() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Profile'), 5)
	}

	@When("The user taps on Home")
	def tapHome1() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 5)
	}
	
	//BALANCE

	@When("The user taps on Your Balance")
	def tapYourBalance() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.TextView - Your Balance'), 3)
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

	@When("The user taps on Home")
	def tapHome() {
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.TextView - Home'), 0)
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
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.TextView - Bonus Balance'), 0)
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
		Mobile.tap(ObjectRepository.findTestObject('Object Repository/ANDROID/DashboardLA/Dashboard/android.widget.ImageButton'), 0)
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
}
