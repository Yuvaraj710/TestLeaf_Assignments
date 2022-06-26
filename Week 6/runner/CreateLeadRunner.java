package runner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;


@CucumberOptions(features = "src/test/java/features/CreateLead.feature"
				, glue = "steps"
				, dryRun = false
				, snippets = SnippetType.CAMELCASE
				, monochrome = true
				, publish = true)
public class CreateLeadRunner extends BaseClass {

}
