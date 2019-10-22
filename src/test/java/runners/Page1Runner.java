package runners;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\alidf\\git\\GithubPractice\\src\\test\\java\\features\\page1.feature"
, glue = { "steps" },
 dryRun = false,
 monochrome = true,
 strict= true, //check if any step definition is not defined. testing
 plugin = {"pretty", "html:test-output"}
 )










public class Page1Runner {

}
