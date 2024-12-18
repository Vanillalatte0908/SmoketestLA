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

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - Enter your phone number'), '85281409935')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Start'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Forgot PIN'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Security Question'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeImage - ic_mini_tint_chevron_down'), 2, 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/IOS/XCUIElementTypeOther (10)'), 5)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - What is your mothers maiden name'), 
    0, 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/IOS/XCUIElementTypeScrollView'), 5)

