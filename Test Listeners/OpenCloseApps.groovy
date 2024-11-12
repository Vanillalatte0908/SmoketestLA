import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil // Importing KeywordUtil
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter



class OpenCloseApps {

	
	@BeforeTestCase
	def setupApplication() {
		KeywordUtil.logInfo("Starting the application before the test case")
		//Android
		//Mobile.startExistingApplication('com.telkom.mwallet')
		//IOS
		Mobile.startExistingApplication('com.telkomsel.wallet')
		CucumberGlueGenerator.addDefaultPackages()
	}
	String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
	String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
	String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
	String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "loginnoootp"

	@Given("The application is started")
	def startApplication() {
		// Android
		//Mobile.startExistingApplication('com.telkom.mwallet') 
		//Ios
		Mobile.startExistingApplication('com.telkomsel.wallet') 
		Files.createDirectories(Paths.get(folderPath))
		CucumberGlueGenerator.addDefaultPackages()
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
	@AfterTestCase
	def teardownApplication() {
		Mobile.closeApplication()
		KeywordUtil.logInfo("Closing the application after the test case")		
		CucumberGlueGenerator.addDefaultPackages()
		
}
}