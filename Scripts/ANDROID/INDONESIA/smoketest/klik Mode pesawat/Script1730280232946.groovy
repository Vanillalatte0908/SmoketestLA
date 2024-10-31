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


Mobile.startExistingApplication('com.telkom.mwallet')


String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "modepesawat"
Files.createDirectories(Paths.get(folderPath))

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ modepesawat' + todaysDate + '_' + nowTime + '.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Connections'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Switch'), 0)

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ modepesawat' + todaysDate + '_' + nowTime + '.png')

Mobile.startExistingApplication('com.telkom.mwallet')

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ modepesawat2' + todaysDate + '_' + nowTime + '.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Connections'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.Switch'), 0)

Mobile.startExistingApplication('com.telkom.mwallet')

Mobile.delay(10)

Mobile.takeScreenshot(folderPath + '/ modepesawat3' + todaysDate + '_' + nowTime + '.png')

Mobile.closeApplication()

