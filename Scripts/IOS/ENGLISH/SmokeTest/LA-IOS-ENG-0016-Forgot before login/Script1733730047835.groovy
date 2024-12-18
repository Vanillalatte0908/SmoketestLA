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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - Enter your phone number'), '85281409935')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Start'), 0)

String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))

String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))

String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))

String folderPath = ('/Users/refqihussein/Desktop/smoketest/' + folderDate) + 'Loginiosnootp'

Files.createDirectories(Paths.get(folderPath))

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Start'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Forgot PIN'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Security Question'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeImage - ic_mini_tint_chevron_down'), 2, 10)

Mobile.waitForElementPresent(findTestObject('Object Repository/IOS/XCUIElementTypeOther (10)'), 5)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - What is your mothers maiden name'), 
    0, 0)

Mobile.setText(findTestObject('IOS/XCUIElementTypeTextField - Enter your answer'), 'Linkaja', 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Done (2)'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeStaticText - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.delay (10)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('IOS/XCUIElementTypeButton - Re-login'), 0)

