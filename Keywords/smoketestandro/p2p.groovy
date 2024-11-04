package smoketestandro

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Paths
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class p2p {

	@Keyword
	def executeP2PTransaction() {
		// Launch the application
		Mobile.startExistingApplication('com.telkom.mwallet')

		// Tap on 'Send Money' option
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Send Money'), 2)

		// Setup date and time for folder and file names
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "P2P"
		Files.createDirectories(Paths.get(folderPath))

		// Take initial screenshot
		Mobile.takeScreenshot(folderPath + "/P2P_${todaysDate}_${nowTime}.png")

		// Execute steps in the transaction
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.TextView - Phone Number'), 2)
		Mobile.takeScreenshot(folderPath + "/P2P1_${todaysDate}_${nowTime}.png")

		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.view.ViewGroup (3)'), 2)
		Mobile.takeScreenshot(folderPath + "/P2P2_${todaysDate}_${nowTime}.png")

		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), 0)
		Mobile.takeScreenshot(folderPath + "/P2P3_${todaysDate}_${nowTime}.png")

		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/MyQR and token/android.widget.EditText - 0'), '1')
		Mobile.takeScreenshot(folderPath + "/P2P4_${todaysDate}_${nowTime}.png")

		Mobile.pressBack()

		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Next'), 0)
		Mobile.takeScreenshot(folderPath + "/P2P5_${todaysDate}_${nowTime}.png")

		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Confirm'), 0)
		Mobile.takeScreenshot(folderPath + "/P2P6_${todaysDate}_${nowTime}.png")
	}
}