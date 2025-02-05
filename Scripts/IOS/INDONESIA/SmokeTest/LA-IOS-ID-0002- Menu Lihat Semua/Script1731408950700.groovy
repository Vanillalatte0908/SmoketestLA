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

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Voucher'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - E-statement LinkAja'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Kode Tiket'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - ic medium outlinetint close'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Buat Token'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Kode Bayar'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - 1'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 2'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 4'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - 5'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back (1)'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - My QR'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Kirim Uang'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Tarik Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeStaticText - Isi Saldo'), 0)

Mobile.tap(findTestObject('Object Repository/IOS/INDONESIA/XCUIElementTypeButton - Back'), 0)

Mobile.closeApplication()

