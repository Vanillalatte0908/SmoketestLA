package oneflow
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class LAIDN {

// LOGIN
	@When("I open apps linkaja")
	def openapps() {
		Mobile.startExistingApplication('com.telkom.mwallet')
	}

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

// CHANGE LANGUAGE
	
	@When("The user taps on Profile")
	def tapProfile() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Profile'), 5)
	}

	@When('the user changes the language to English')
	def changeToEnglish() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/bahasa/android.widget.TextView - English'), 5)
	}

	@When('the user changes the language back to Indonesia')
	def changeToIndonesian() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/bahasa/android.widget.TextView - Indonesia'), 5)
	}
	@When("the user navigates to the Profile indo page1")
	def navigateToProfile1() {
		Mobile.tap(findTestObject('ANDROID/DashboardLA/android.widget.TextView - Profil'), 5)
		Mobile.delay(10)
		takeScreenshot("ProfilePage")
	}

//LOGOUT
	
	@When("the user scrolls to the {string} option")
	def scrollToOption(String optionText) {
		Mobile.scrollToText(optionText)
	}

	@When("the user logs out")
	def logOut() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/ANDROID/Logout/android.widget.TextView - Keluar'), 10)
		Mobile.tap(findTestObject('Object Repository/ANDROID/Logout/android.widget.TextView - Keluar'), 3)
	}

//LOGIN INDONESIA
	
	@When("the user enters phone number indonesia {string}")
	def enterPhoneNumber1(String phoneNumber) {
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.EditText - Masukkan nomor telepon kamu'), phoneNumber)
	}

	@Then("a folder for screenshots is created with the current date")
	def createFolder() {
		folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "masukindo"
		Files.createDirectories(Paths.get(folderPath))
	}

	@When("the user starts the app and enters the PIN {string}")
	def startAppAndEnterPin(String pin) {
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Button - Mulai'), 0)
		Mobile.delay(10)
		takeScreenshot('masuk2')
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.EditText'), pin)
		Mobile.delay(10)
		takeScreenshot('masuk3')
	}

	@Then("the user navigates through various sections of the app")
	def navigateSections() {
		// Navigating and taking screenshots for each step
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Saldo Kamu', 'masuk4')
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Beranda', 'masuk5')
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Saldo Bonus', 'masuk6')
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.ImageButton'), 0)
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Riwayat', 'masuk7')
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Pesan', 'masuk8')
		tapAndCapture('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Profil', 'masuk9')
	}

	@Then("screenshots are captured at each step")
	def takeScreenshot1(String stepName) {
		Mobile.takeScreenshot(folderPath + "/${stepName}" + todaysDate + "_" + nowTime + ".png")
	}

	private void tapAndCapture(String objectPath, String stepName) {
		Mobile.tap(findTestObject(objectPath), 0)
		Mobile.delay(10)
		takeScreenshot(stepName)
	}
	
//FAVORITE CHECK
	@When("the user taps the Favorite button")
	def tapFavoriteButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Button'), 0)
	}

	@Then("a folder for screenshots is created with the current date")
	def createScreenshotFolder() {
		folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "paporit"
		Files.createDirectories(Paths.get(folderPath))
	}

	@When("the user interacts with the app to make a payment")
	def interactWithAppForPayment() {
		// Step 1: Screenshot after delay
		Mobile.delay(10)
		takeScreenshot("paporit")

		// Step 2: Tap and capture image
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.ImageView'), 0)
		Mobile.delay(10)
		takeScreenshot("paporit1")

		// Step 3: Navigate to payment
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Button - Ke Pembayaran'), 0)
		Mobile.delay(10)
		takeScreenshot("paporit2")

		// Step 4: Enter payment details
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.EditText - 0'), '1')
		Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Button - Lanjut'), 0)
		Mobile.delay(10)
		takeScreenshot("paporit3")
	}

	@Then("screenshots are captured at each step")
	def takeScreenshot2(String stepName) {
		Mobile.takeScreenshot(folderPath + "/${stepName}" + todaysDate + "_" + nowTime + ".png")
	}

//ISI SALDO
	
	@When("the user taps on {string}")
	def tapOn(String option) {
		Mobile.tap(findTestObject("Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - " + option), 0)
	}

	@Then("a folder for screenshots is created with the current date")
	def createScreenshotFolder1() {
		folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "isisaldo"
		Files.createDirectories(Paths.get(folderPath))
	}

	@When("the user navigates through bank and merchant options")
	def navigateAndCaptureScreenshots() {
		def steps = [
			['Himpunan Bank Negara', 'bank-logo-Bank BTN', 'ATM'],
			['Transfer Bank', 'bank-logo-Bank BCA', 'ATM'],
			['Bank Syariah', 'bank-logo-Bank Syariah Indonesia', 'BSI-Net (Internet Banking)'],
			['Kartu Debit', null, null],
			['Indomaret', null, null],
			['Merchant  Mitra LinkAja', null, null]
		]

		steps.eachWithIndex { step, index ->
			String category = step[0]
			String logo = step[1]
			String button = step[2]

			Mobile.tap(findTestObject("Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - " + category), 0)
			Mobile.delay(10)
			takeScreenshot("isisaldo" + (index + 1))

			if (logo != null) {
				Mobile.tap(findTestObject("Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Image - " + logo), 0)
				Mobile.delay(10)
				takeScreenshot("isisaldo" + (index + 1) + "_logo")
			}

			if (button != null) {
				Mobile.tap(findTestObject("Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Button - " + button), 0)
				Mobile.delay(10)
				takeScreenshot("isisaldo" + (index + 1) + "_button")
			}

			Mobile.tap(findTestObject("Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.ImageButton"), 0)
		}
	}

	@Then("screenshots are captured at each step")
	def takeScreenshot4(String stepName) {
		Mobile.takeScreenshot(folderPath + "/${stepName}" + todaysDate + "_" + nowTime + ".png")
	}

}
