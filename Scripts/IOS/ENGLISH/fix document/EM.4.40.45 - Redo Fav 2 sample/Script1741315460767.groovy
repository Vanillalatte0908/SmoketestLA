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

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeImage - ic_homepage_favorite (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeImage - ic_mini_system_chevron_right'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Go to Payment'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Pulsa 5.000 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Pulsa  Data (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Favorite Transaction'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Favorite Transaction'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Favorite Transaction'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Favorite Transaction'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Donate to build a mosque - 163164'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Go to Payment'), 0)

Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - 0 (1)'), '1')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Done (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Continue (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Confirm (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 1 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 2 (4)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 3 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 4 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 5 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 5 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - ic medium outlinenontint close'), 0)

Mobile.closeApplication()

