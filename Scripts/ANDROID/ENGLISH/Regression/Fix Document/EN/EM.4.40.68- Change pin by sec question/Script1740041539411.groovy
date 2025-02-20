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

Mobile.startExistingApplication('com.telkom.mwallet')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - PIN Settings'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Forgot PIN'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Security Question (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Select a security question'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - What is your mothers maiden name'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Enter your answer'), 'Linkaja')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Continue'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (1)'), '123455')

Mobile.delay(5)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (1)'), '123455')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Re-login'), 0)

Mobile.closeApplication()

