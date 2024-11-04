import smoketestandro.TokenGeneration as TokenGen
import com.kms.katalon.core.util.KeywordUtil // Importing KeywordUtil

// Create an instance of the TokenGeneration class
TokenGen tokenTransaction = new TokenGen()

try {
    // Execute the token generation process
    tokenTransaction.generateToken()

    // Log the test as passed
    KeywordUtil.markPassed("Token generation executed successfully.")

} catch (Exception e) {
    // Log the test as failed if an error occurs
    KeywordUtil.markFailed("Token generation test failed. Error: " + e.getMessage())
}
