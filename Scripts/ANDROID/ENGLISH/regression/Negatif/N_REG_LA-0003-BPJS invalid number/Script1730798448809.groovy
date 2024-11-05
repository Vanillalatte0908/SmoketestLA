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

Mobile.tap(findTestObject('ANDROID/android.widget.TextView - See All', [('variable') : 'see all', (945) : '', (1381) : '']),
	10, FailureHandling.STOP_ON_FAILURE)
Mobile .delay(10)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.CompoundButton - Kartu Uang Elektronik'), 
    0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - BPJS'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - BPJS Kesehatan'), 0)

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - Masukkan VA Number'), '0000000112929339')

Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - insert number of month (e.g 02)'), 
    '05/24')

Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Next (2)'), 0)

Mobile.closeApplication()

