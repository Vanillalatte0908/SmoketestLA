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
import java.time.LocalDateTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

Mobile.startExistingApplication('com.telkom.mwallet')

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'),
	'85281409935')

Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Forgot PIN'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Security Question'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - Select a security question'), 
    0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - What is your mothers maiden name'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - Enter your answer (1)'), 
    'Linkaja')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Continue'), 0)

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText'), '123455')

Mobile.delay(10)

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText'), '123455')\

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.ImageButton'), 0)

String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + 'ForgotPin'
Files.createDirectories(Paths.get(folderPath))

Mobile.takeScreenshot(folderPath + '/ ForgotPin' + todaysDate + '_' + nowTime + '.png')

Mobile.closeApplication()