package smoketestandro

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

class Logout {

	@Keyword
	def logoutFromApp() {
		Mobile.startExistingApplication('com.telkom.mwallet')

		// Tap Profile button
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/Home/android.widget.TextView - Profile'), 0)

		// Set up for screenshot folder
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + "Logout"
		Files.createDirectories(Paths.get(folderPath))

		// Take initial screenshot
		Mobile.takeScreenshot(folderPath + '/Logout_' + todaysDate + '_' + nowTime + '.png')

		// Scroll to Logout option
		Mobile.scrollToText('Logout')

		// Wait for the Logout button and take another screenshot
		Mobile.waitForElementPresent(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Logout'), 10)
		Mobile.takeScreenshot(folderPath + '/Logout1_' + todaysDate + '_' + nowTime + '.png')

		// Tap Logout and capture final screenshot
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Logout'), 3)
		Mobile.takeScreenshot(folderPath + '/LogoutFinal_' + todaysDate + '_' + nowTime + '.png')
	}
}
