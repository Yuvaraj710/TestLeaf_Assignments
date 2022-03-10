package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {

	@Test(description = "TC_004", priority = 3)
	public void duplicateLead() {


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("yuvarajkumar7@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement leadFirstName = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		String capturedLeadName = leadFirstName.getText();
		// System.out.println(capturedLeadName);

		leadFirstName.click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The title contains the word Duplicate Lead");
		} else {
			System.out.println("The title does not contain the word Duplicate Lead");
		}

		driver.findElement(By.name("submitButton")).click();

		String duplicatedLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		if (capturedLeadName.equals(duplicatedLeadName)) {
			System.out.println("Duplicated lead name is same as Captured name");
		} else {
			System.out.println("Duplicated lead name is not same as Captured name");
		}

	}
}