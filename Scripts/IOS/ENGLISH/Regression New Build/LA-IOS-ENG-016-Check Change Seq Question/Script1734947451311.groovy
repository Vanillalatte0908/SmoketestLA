import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Account'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Security Question'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Change Now'), 0)

Mobile.getText(findTestObject('Object Repository/XCUIElementTypeStaticText - Select a security question'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/XCUIElementTypeStaticText - Select a security question'), 0, 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - What is your mothers maiden name'), 0)

Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - Enter your answer'), 'Linkaja')

Mobile.takeScreenshot('all.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Save'), 0)

Mobile.takeScreenshot('all.jpg', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.takeScreenshot('all.jpg', FailureHandling.STOP_ON_FAILURE)

