package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features/EditLead.feature"
				, glue = "steps/EditLead.class"
				, snippets = SnippetType.CAMELCASE
				, monochrome = true
				, publish = true)
public class EditLeadRunner extends BaseClass {

}
