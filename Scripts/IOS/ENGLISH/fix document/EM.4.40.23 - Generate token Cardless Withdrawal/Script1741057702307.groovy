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

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - CashOut'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Association of State-Owned Banks (HIMBARA)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Rp 100.000'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 1 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 2 (3)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 3 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 4 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 5 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - 5 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - ic medium outlinetint arrow le'), 0)

Mobile.closeApplication()

