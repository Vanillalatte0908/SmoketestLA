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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')

Mobile.tap(findTestObject('Object Repository/DashboardLA/Home/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Full Service'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.Button - Close'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Account Settings'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/Home/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Payment Method'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/Home/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Terms of Service'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/Dashboard/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Privacy Policy'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/Dashboard/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Help Center'), 3)

Mobile.tap(findTestObject('Object Repository/DashboardLA/Dashboard/android.widget.ImageButton'), 0)

Mobile.scrollTo(findTestObject('Object Repository/DashboardLA/android.widget.TextView - Logout'))

Mobile.closeApplication()
