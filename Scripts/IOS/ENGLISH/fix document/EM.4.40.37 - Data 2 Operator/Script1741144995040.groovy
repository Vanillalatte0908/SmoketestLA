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

Mobile.startExistingApplication('com.telkomsel.wallet')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - PulsaData (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther (7)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Data'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther (8)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Pulsa  Data (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Pulsa  Data (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - 81234567890 (1)'), '087787069388')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Data'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeOther (8)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Pulsa  Data (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Pulsa  Data (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Back (3)'), 0)

Mobile.closeApplication()

