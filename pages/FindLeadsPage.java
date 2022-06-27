package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {

	public FindLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;

	}

	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		return this;

	}

	public FindLeadsPage clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;

	}

	public ViewLeadPage clickLead() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}

	public FindLeadsPage enterLeadId(String leadID) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		Thread.sleep(2000);
		return this;
	}

	public FindLeadsPage verifyDeletedLead() {
		boolean noRecords = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		Assert.assertTrue(noRecords);
		System.out.println("Lead Deleted Succesfully");
		return this;
	}

}
