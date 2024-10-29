package smoketestenglishandro
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



class Login1 {
	String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
	String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
	String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
	String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "loginnoootp"

	@Given("The application is started")
	def startApplication() {
		Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')
		Files.createDirectories(Paths.get(folderPath))
	}

	@When("I enter the phone number {string}")
	def enterPhoneNumber(String phoneNumber) {
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'), phoneNumber)
	}

	@And("I take a screenshot {string}")
	def takeScreenshot(String stepName) {
		Mobile.takeScreenshot(folderPath + '/ ' + stepName + todaysDate + '_' + nowTime + '.png')
	}

	@And("I click the start button")
	def clickStartButton() {
		Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)
	}

	@And("I enter the PIN {string}")
	def enterPIN(String pin) {
		Mobile.sendKeys(findTestObject('ANDROID/Login without OTP/android.widget.EditText'), pin)
	}

	@Then("I should see the home screen")
	def verifyHomeScreen() {
		Mobile.waitForElementPresent(findTestObject('ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 10)
	}

	@And("I close the application")
	def closeApplication() {
		Mobile.closeApplication()
	}
}