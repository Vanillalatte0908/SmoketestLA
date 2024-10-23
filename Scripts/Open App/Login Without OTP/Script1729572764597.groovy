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

Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.EditText - Enter your phone number'), 
    0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 8'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 2'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 8'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 4'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 9'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 9'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.Button - Start'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 1 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 2 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 3 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 4 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 5 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login without OTP/android.widget.TextView - 5 (1)'), 0)

Mobile.waitForElementPresent(findTestObject('DashboardLA/Home/android.widget.TextView - Home'), 5)

Mobile.closeApplication()

