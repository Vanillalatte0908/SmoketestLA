import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "Include/features",  // Adjust path as necessary
	glue = "smoketestenglishandro",  // Package name of your step definitions
	plugin = ["pretty", "html:reports/cucumber-html-report", "json:reports/cucumber.json"]
)
class RunCucumberTest {
}
