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

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Tipe Akun'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Pengaturan Akun'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Metode Pembayaran'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Ketentuan Layanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Kebijakan Privasi'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/ANDROID/INDONESIA/DASHBOARD/android.widget.TextView - Pusat Bantuan'), 0)

Mobile.pressBack()

Mobile.closeApplication()
