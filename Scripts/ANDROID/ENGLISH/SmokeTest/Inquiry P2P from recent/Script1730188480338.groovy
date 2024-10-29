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

Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Send Money'), 2)

String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "P2P"
Files.createDirectories(Paths.get(folderPath))

Mobile.takeScreenshot(folderPath + '/ P2P' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Phone Number'), 2)

Mobile.takeScreenshot(folderPath + '/ P2P1' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.view.ViewGroup (3)'), 2)

Mobile.takeScreenshot(folderPath + '/ P2P2' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), 0)

Mobile.takeScreenshot(folderPath + '/ P2P3' + todaysDate + '_' + nowTime + '.png')

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), '1')

Mobile.takeScreenshot(folderPath + '/ P2P4' + todaysDate + '_' + nowTime + '.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Next'), 0)

Mobile.takeScreenshot(folderPath + '/ P2P5' + todaysDate + '_' + nowTime + '.png')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Confirm'), 0)

Mobile.takeScreenshot(folderPath + '/ P2P6' + todaysDate + '_' + nowTime + '.png')

Mobile.closeApplication()

