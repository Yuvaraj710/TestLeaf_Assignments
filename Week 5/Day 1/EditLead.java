package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	@Test(description = "TC_003", priority = 2)
	public void editLead() throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']"))
							.sendKeys("Yuvaraj");

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(companyName);

		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The title contains View Lead");
		} else {
			System.out.println("The title does not contain View Lead");
		}

		driver.findElement(By.linkText("Edit")).click();

		WebElement cName = driver.findElement(By.id("updateLeadForm_companyName"));
		cName.clear();
		cName.sendKeys("Zoho");

		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String changedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(changedCompanyName);
		Thread.sleep(2000);
		if (companyName.equals(changedCompanyName)) {
			System.out.println("Company Name did not get changed");
		} else {
			System.out.println(
					"Company Name changed. Previously it was " + companyName + ", now it is " + changedCompanyName);
		}

	}

}