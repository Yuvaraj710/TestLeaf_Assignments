package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features/DeleteLead.feature"
				, glue = "steps"
				, snippets = SnippetType.CAMELCASE
				, monochrome = true
				, publish = true)
public class DeleteLeadRunner extends BaseClass {

}