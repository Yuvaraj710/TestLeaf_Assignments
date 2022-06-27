package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage VerifyLead() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	
	public LeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
		
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public ViewLeadPage printLeadUpdated() {
		System.out.println("Lead Updated Successfully...");
		return this;
	}
	
}
