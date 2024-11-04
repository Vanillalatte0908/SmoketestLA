import smoketestandro.p2p as P2P
import com.kms.katalon.core.util.KeywordUtil // Importing KeywordUtil

// Create an instance of the P2P class
P2P p2pTransaction = new P2P()

try {
    // Start the P2P transaction process
    p2pTransaction.executeP2PTransaction()

    // Log the test as passed
    KeywordUtil.markPassed("P2P transaction executed successfully.")

} catch (Exception e) {
    // Log the test as failed if an error occurs
    KeywordUtil.markFailed("P2P transaction test failed. Error: " + e.getMessage())
}
