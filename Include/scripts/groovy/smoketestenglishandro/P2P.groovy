package smoketestenglishandro
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class P2P {
	String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
    String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
    String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
    String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "P2P"

    @Given("The application is launched")
    def launchApplication() {
        Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')
        Files.createDirectories(Paths.get(folderPath))
    }

    @When("I tap on {string}")
    def tapElement(String element) {
        if (element == "Send Money") {
            Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Send Money'), 2)
        } else if (element == "Next") {
            Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Next'), 0)
        }
    }

    @When("I take a screenshot {string}")
    def takeScreenshot(String stepName) {
        Mobile.takeScreenshot(folderPath + '/ ' + stepName + todaysDate + '_' + nowTime + '.png')
    }

    @When("I select {string} for the transfer")
    def selectTransferType(String transferType) {
        if (transferType == "Phone Number") {
            Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Phone Number'), 2)
        }
    }

    @When("I select a recent contact")
    def selectRecentContact() {
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.view.ViewGroup (3)'), 2)
    }

    @When("I enter the amount {string}")
    def enterAmount(String amount) {
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), 0)
        Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), amount)
        Mobile.pressBack()
    }

    @When("I confirm the transaction")
    def confirmTransaction() {
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Confirm'), 0)
    }

    @Then("I close the application")
    def closeApplication() {
        Mobile.closeApplication()
    }
}