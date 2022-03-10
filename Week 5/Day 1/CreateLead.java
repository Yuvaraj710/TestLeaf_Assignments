package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(description = "TC_001")
	public void createLead() throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvaraj");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");

		WebElement dd1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByValue("LEAD_EMPLOYEE");

		WebElement dd2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByValue("DEMO_MKTG_CAMP");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yuvaraj");

		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");

		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1500");

		WebElement dd3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue("INR");

		WebElement dd4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(dd4);
		dropdown4.selectByValue("IND_SOFTWARE");

		WebElement dd5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(dd5);
		dropdown5.selectByValue("OWN_CCORP");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1267");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker Symbol");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");

		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(Keys.BACK_SPACE, "+91");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yuvarajkumar7@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("63547539");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Yuvaraj");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/Yuvaraj710");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Yuvaraj K");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Murali V");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("AA-IC");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Newtown");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600039");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("39");

		WebElement dd7 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(dd7);
		dropdown7.selectByValue("IND");

		Thread.sleep(2000);

		WebElement dd6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(dd6);
		dropdown6.selectByValue("IN-WB");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);

		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(name);

	}

}
