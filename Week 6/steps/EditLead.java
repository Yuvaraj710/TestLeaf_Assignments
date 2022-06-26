package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	@Given("Click Leads link")
	public void clickOnLeadsTab()
	{
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on Find lead")
	public void clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Click on Phone Tab in Find By")
	public void clickFindBy()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter Phone Number as {string}")
	public void enterPhoneNumber(String phno)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}
	
	@Given("Click on Find Leads")
	public void clickFindLead()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Given("Click on First Lead from Leads List")
	public void clickFirstLead() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Click on Edit Button")
	public void clickEditButton() 
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Update company name as {string}")
	public void updateCompanyName(String cname) 
	{
		WebElement element = driver.findElement(By.id("updateLeadForm_companyName"));
		element.clear();
		element.sendKeys(cname);
	}
	
	@When("Click on submit button")
	public void clickSubmitButton() 
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Lead is Updated Successfully")
	public void successMsg() 
	{
		System.out.println("Lead Updated Successfully");
	}
	
	
	

	
	

}
