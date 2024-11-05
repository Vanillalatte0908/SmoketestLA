package smoketestandro

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.nio.file.Files
import java.nio.file.Paths

class ForgotPin {

	@Keyword
	def resetPin(String phoneNumber, String securityAnswer, String newPin) {
		Mobile.startExistingApplication('com.telkom.mwallet')

		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.EditText - Enter your phone number'), phoneNumber)
		Mobile.tap(findTestObject('Object Repository/ANDROID/Login without OTP/android.widget.Button - Start'), 0)

		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Forgot PIN'), 0)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - Security Question'), 0)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - Select a security question'), 0)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.TextView - What is your mothers maiden name'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText - Enter your answer (1)'), securityAnswer)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.Button - Continue'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText'), newPin)
		Mobile.delay(10)
		Mobile.sendKeys(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.EditText'), newPin)

		Mobile.delay(20)
		Mobile.tap(findTestObject('Object Repository/ANDROID/DashboardLA/android.widget.ImageButton'), 0)

		captureScreenshot("ForgotPin")
	}

	private void captureScreenshot(String scenario) {
		String folderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('yyyyMMdd'))
		String todaysDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern('MM_dd_yy'))
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern('HH_mm_ss'))
		String folderPath = "/Users/refqihussein/Desktop/smoketest/" + folderDate + scenario
		Files.createDirectories(Paths.get(folderPath))

		Mobile.takeScreenshot(folderPath + '/' + scenario + todaysDate + '_' + nowTime + '.png')
	}
}
