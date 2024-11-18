import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


class Listener {

  // Set the Glue code for Cucumber step definitions
    // This tells Katalon where to look for your step definition classes
    // Update with your actual step definition package path
    @BeforeTestCase
    def beforeTestCase() {
        KeywordUtil.logInfo("Setting up before the test case")

        // Setting the glue for Cucumber to find step definitions
        CucumberKW.GLUE = ['oneflow']  // Your package with the step definition class		
        // Starting the application before each test case
        Mobile.startExistingApplication('com.telkom.mwallet')
    }

    @AfterTestCase
    def afterTestCase() {
        KeywordUtil.logInfo("Cleaning up after the test case")

        // Closing the application after each test case
        Mobile.closeApplication()
    }
}