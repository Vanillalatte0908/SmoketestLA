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

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - TopUp'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Cash Out'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Association of State-Owned Banks (HIMBARA)'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Rp 100.000'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - BCA'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Rp 100.000 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - BCA ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - ATM Withdrawal'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Bank Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeOther (13)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - 0'), '10000')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Send Money'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Indomaret'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Open Token'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Close (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - ic medium outlinetint arrow le'), 0)

Mobile.closeApplication()

