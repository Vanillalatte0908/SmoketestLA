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

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'), 
    '81113019756')

String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))

String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))

String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))

String folderPath = ('/Users/refqihussein/Desktop/smoketest/' + folderDate) + 'loginnoootp'

Files.createDirectories(Paths.get(folderPath))

Mobile.delay(10)

Mobile.takeScreenshot(((((folderPath + '/ Login') + todaysDate) + '_') + nowTime) + '.png')

Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)

Mobile.sendKeys(findTestObject('ANDROID/Login without OTP/android.widget.EditText'), '123455')

Mobile.delay(10)

Mobile.takeScreenshot(((((folderPath + '/ Login1') + todaysDate) + '_') + nowTime) + '.png')

Mobile.waitForElementPresent(findTestObject('ANDROID/DashboardLA/Home/android.widget.TextView - Home'), 10)

Mobile.delay(10)

Mobile.takeScreenshot(((((folderPath + '/ Login2') + todaysDate) + '_') + nowTime) + '.png')

Mobile.closeApplication()

