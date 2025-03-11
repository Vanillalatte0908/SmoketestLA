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

Mobile.verifyElementExist(findTestObject('Object Repository/XCUIElementTypeStaticText (4)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - More (2)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Finance (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Other Donations'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Others'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Daarul Quran'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeKey - 1'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Done (4)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Confirm (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 1 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 2 (5)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 3 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 4 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 5 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - ic medium outlinenontint close (1)'), 0)

Mobile.closeApplication()

