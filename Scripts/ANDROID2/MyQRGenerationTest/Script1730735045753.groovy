import smoketestandro.MyQRGeneration as MyQR
import com.kms.katalon.core.util.KeywordUtil // Importing KeywordUtil

// Create an instance of the MyQRGeneration class
MyQR myQRTransaction = new MyQR()

try {
    // Execute the My QR capture process
    myQRTransaction.captureMyQR()

    // Log the test as passed
    KeywordUtil.markPassed("My QR capture executed successfully.")

} catch (Exception e) {
    // Log the test as failed if an error occurs
    KeywordUtil.markFailed("My QR capture test failed. Error: " + e.getMessage())
}