package smoketestandro

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

class TokenGeneration {

    @Keyword
    def generateToken() {
        // Start the application
        Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')

        // Tap on 'See All' option
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - See All'), 0)

        // Set up folder path for screenshots
        String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
        String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
        String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
        String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Token"
        Files.createDirectories(Paths.get(folderPath))

        // Take initial screenshot
        Mobile.takeScreenshot(folderPath + "/Token_${todaysDate}_${nowTime}.png")

        // Create a token by tapping through the options
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Create Token'), 3)
        Mobile.takeScreenshot(folderPath + "/Token1_${todaysDate}_${nowTime}.png")

        // Enter PIN
        Mobile.tap(findTestObject('Object Repository/ANDROID/Invalid pin/android.widget.TextView - 1'), 0)
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - 2'), 0)
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - 3'), 0)
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - 4'), 0)
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - 5'), 0)
        Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - 5'), 0)

        // Delay and final screenshot
        Mobile.delay(10)
        Mobile.takeScreenshot(folderPath + "/Token2_${todaysDate}_${nowTime}.png")
    }

    @Keyword
    def closeApplication() {
        Mobile.closeApplication()
    }
}
