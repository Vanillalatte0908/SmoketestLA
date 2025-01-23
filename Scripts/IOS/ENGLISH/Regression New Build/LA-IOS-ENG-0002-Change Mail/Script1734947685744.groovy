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
import java.text.SimpleDateFormat
import java.util.Date
import java.time.LocalDateTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

Mobile.tap(findTestObject('Object Repository/XCUIElementTypeStaticText - Account'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Email'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Change Email'), 0)

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ changesqio7s' + todaysDate + '_' + nowTime + '.png')

Mobile.sendKeys(findTestObject('Object Repository/IOS/XCUIElementTypeTextField - E.g. linkajalinkaja.id'), 'linkaja2@yopmail.com')

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ changesqios8' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Change Email (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - 5'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/IOS/XCUIElementTypeOther (4)'), 0, 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Back'), 0)

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ changesqios9' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeStaticText - Logout'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/XCUIElementTypeButton - Yes, Logout'), 0)

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ changesqios10' + todaysDate + '_' + nowTime + '.png')