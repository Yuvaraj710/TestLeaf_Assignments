package week5.day2.assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider = "fetchdata")
	public void createLead(String cName, String fName, String lName) 
	{	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(name="fetchdata")
	public String[][] sendData() throws IOException
	{
		return RealExcel.readExcel("CreateLead");
		
	}
}






