package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@Given("Click Leads link")
	public void clickOnLeadsTab()
	{
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on create lead")
	public void clickCreateLeadButton1()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter company name as {string}")
	public void enterCompanyName(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}

	@Given("Enter first name as {string}")
	public void enterFirstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter last name as {string}")
	public void enterLastName(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@When("Click on Create Lead button")
	public void clickCreateLead() 
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Lead should be created")
	public void leadIsCreatedSuccessfully() 
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

}
