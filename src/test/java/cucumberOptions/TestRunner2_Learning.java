package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Learnings",
		glue="stepDefinations.Learning",
		monochrome = true,
		plugin = {"pretty", "html:target/site/cucumber-report-default", "json:target/site/learning_report2.json"},
		snippets = SnippetType.CAMELCASE,
		tags= {"@login_with_param_1"}
		)

public class TestRunner2_Learning {

}
