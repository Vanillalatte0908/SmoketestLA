package smoketestandro

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

class MyQRGeneration {

	@Keyword
	def captureMyQR() {
		// Start the application
		Mobile.startExistingApplication('com.telkom.mwallet -c android.intent.category.LAUNCHER 1')

		// Tap on 'See All' option
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - See All'), 0)

		// Set up folder path for screenshots
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "MyQR"
		Files.createDirectories(Paths.get(folderPath))

		// Delay and initial screenshot
		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + "/MyQR_${todaysDate}_${nowTime}.png")

		// Tap on 'My QR' option and capture screenshot
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - My QR'), 5)
		Mobile.delay(10)
		Mobile.takeScreenshot(folderPath + "/MyQR1_${todaysDate}_${nowTime}.png")

		// Return to the previous screen
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.ImageButton'), 0)
	}
}
