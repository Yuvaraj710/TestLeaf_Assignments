package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends BaseClass {

	@Test(description = "TC_002", priority = 1, groups = "Contacts")
	public void createContact() {


		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Yuvaraj");
		driver.findElement(By.id("lastNameField")).sendKeys("K");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Microsoft");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Yuvaraj");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Assurance");

		driver.findElement(By.id("createContactForm_description")).sendKeys("Description Entered");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("yuvarajkumar7@gmail.com");
		
		WebElement dd1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("updateContactForm_description")).clear();

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note Entered");

		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String title = driver.getTitle();
		System.out.println(title);
	}

}