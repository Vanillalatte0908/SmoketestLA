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

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Profil'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Tidak Aktif'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Aktifkan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Dengan mengaktifkan, kamu menyetujui Syarat dan Ketentuan yang berlaku'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Aktifkan (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText'), '090892')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Ke Beranda'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Semua'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Semua'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Profil'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - LinkAja Syariah'), 0)

Mobile.scrollToText('Beri Masukan dan Saran')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bagaimana cara untuk melakukan pengakhiranpenutupan Akun LinkAja Syariah'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - DSN MUI'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - Pilih alasan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Ingin non-aktifkan dulu, nanti akan aktifkan kembali'), 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Non-aktifkan Layanan'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText'), '090892')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Kembali ke Beranda'), 0)

Mobile.closeApplication()

