import smoketestandro.Login1 as Login


// Create an instance of the Login class
Login login = new Login()

// Start the application (listener will automatically start it)
login.startApplication()
login.enterPhoneNumber("85281409935")
login.takeScreenshot("enterPhoneNumber")
login.clickStartButton()
login.enterPIN("123455")
login.verifyHomeScreen()
login.takeScreenshot("homeScreen")