import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeImage - ic_homepage_favorite'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeImage - ic_mini_system_chevron_right'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Edit'), 0)

Mobile.clearText(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - Smoketet1'), 0)

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - Create a name for this transaction'), 'Smoketest II')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Save'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Go to Payment'), 0)

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - 0'), '1')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Confirm'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 1'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 2'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 3'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 4'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - 5'), 0)