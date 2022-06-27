package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass {

	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver; 
	}

	public CreateLeadPage clickCreateLeads() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	
	
	
}
