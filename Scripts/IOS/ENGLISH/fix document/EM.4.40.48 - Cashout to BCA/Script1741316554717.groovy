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

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - TopUp'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Cash Out'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Bank Transfer (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/XCUIElementTypeOther (14)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - 6550016310'), 0)

Mobile.sendKeys(findTestObject('Object Repository/XCUIElementTypeTextField - 0 (2)'), '10000')

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Done (5)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Send Money'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Send Money'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Back (6)'), 0)

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeButton - Back (6)'), 0)

Mobile.closeApplication()

