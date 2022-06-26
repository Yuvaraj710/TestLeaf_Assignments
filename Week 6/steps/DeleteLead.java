package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass {

	private String leadIDText;

	@Given("Click on the Leads link")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on the Find leads")
	public void findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Click on the Phone")
	public void clickPhone() {
		driver.findElement(By.linkText("Phone")).click();
	}

	@Given("Enter the phone number {string}")
	public void clickPhoneNumber(String phn) {
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys(phn);
	}

	@Given("Click on the find leads button")
	public void findLeads() {
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("Capture lead ID of First Resulting lead and Click First Resulting lead")
	public void capLeads() {
		WebElement leadID = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadIDText = leadID.getText();
		System.out.println("leadIDText: " + leadIDText);
		leadID.click();
		this.leadIDText = leadIDText;
	}

	@Given("Click Delete")
	public void delLeads() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}

	@When("Enter captured lead ID")
	public void capLeadID() {
		driver.findElement(By.name("id")).sendKeys(leadIDText);
	}

	@Then("Verify message 'No records to display' in the Lead List")
	public void varifyDisplay() {
		if (driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No records to display is getting printed");
		} else {
			System.out.println("There are records to display");
		}
	}
}