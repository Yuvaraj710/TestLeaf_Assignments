package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {

	@Test(description = "TC_005", priority = 4)
	public void deleteLead() {


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("6354753");

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement leadID = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String leadIDText = leadID.getText();
		System.out.println("leadIDText: " + leadIDText);

		leadID.click();

		driver.findElement(By.className("subMenuButtonDangerous")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.name("id")).sendKeys(leadIDText);

		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		
		if (driver.findElement(By.className("x-paging-info")).isDisplayed()) {
			System.out.println("No records to display is getting printed");
		} else {
			System.out.println("There are records to display");
		}
	}
}
