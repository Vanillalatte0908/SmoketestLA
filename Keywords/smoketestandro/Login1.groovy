package smoketestandro

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Login1 {
	String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
	String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
	String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
	String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "loginnoootp"

	@Keyword
	def startApplication() {
		Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')
		Files.createDirectories(Paths.get(folderPath))
		KeywordUtil.logInfo("Application started and directory created: " + folderPath)
	}

	@Keyword
	def enterPhoneNumber(String phoneNumber) {
		KeywordUtil.logInfo("Entering phone number: " + phoneNumber)
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'), phoneNumber)
	}

	@Keyword
	def takeScreenshot(String stepName) {
		String screenshotPath = folderPath + '/' + stepName + todaysDate + '_' + nowTime + '.png'
		Mobile.takeScreenshot(screenshotPath)
		KeywordUtil.logInfo("Screenshot taken: " + screenshotPath)
	}

	@Keyword
	def clickStartButton() {
		KeywordUtil.logInfo("Clicking start button.")
		Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)
	}

	@Keyword
	def enterPIN(String pin) {
		KeywordUtil.logInfo("Entering PIN: " + pin)
		Mobile.sendKeys(findTestObject('ANDROID/Login without OTP/android.widget.EditText'), pin)
	}

	@Keyword
	def verifyHomeScreen() {
		KeywordUtil.logInfo("Verifying home screen is present.")
		Mobile.waitForElementPresent(findTestObject('ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 10)
	}
}
