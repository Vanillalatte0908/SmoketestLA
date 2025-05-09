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

Mobile.verifyElementExist(findTestObject('Object Repository/XCUIElementTypeStaticText (12)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - More (5)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - GAS'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - PERTAGAS POSTPAID'), 0)

Mobile.takeScreenshot('/Users/refqihussein/Desktop/smoketest/screenshot00000006.png')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Back (15)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - LinkAja Products (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Back (15)'), 0)

Mobile.closeApplication()

