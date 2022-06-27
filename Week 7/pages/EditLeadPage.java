package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public EditLeadPage updateCompanyName() {
		WebElement element = driver.findElement(By.id("updateLeadForm_companyName"));
		element.clear();
		element.sendKeys("Element5");
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
	
	
}
