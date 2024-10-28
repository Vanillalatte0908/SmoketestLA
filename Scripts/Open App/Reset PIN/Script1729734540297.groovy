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

Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText - Enter your phone number'), 
    '85281409935')

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.Button - Start'), 0)

for (def index : (0..9)) {
	Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText'), '111111')
}


Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.Button - Reset PIN'), 0)

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.TextView - Security Question'), 0)

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText - Select a security question'), 
    0)

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.TextView - What is your mothers maiden name'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText - Enter your answer'), 'Linkaja')

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.Button - Continue'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText (1)'), '123455')

Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText (1)'), '123455')

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.Button - Re-login'), 0)


Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText - Enter your phone number'), 
    '85281409935')

Mobile.tap(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.Button - Start'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Reset Pin Normal flow/android.widget.EditText'), '123455')

Mobile.closeApplication()

