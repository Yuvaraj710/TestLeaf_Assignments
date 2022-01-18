package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//	1. Launch URL "http://leaftaps.com/opentaps/control/login"	 
//	2. Enter UserName and Password 	  
//	3. Click on Login Button 
//	4. Click on CRM/SFA Link	
//	5. Click on Leads Button	 
//	6. Click on create Lead Button	  
//	7. Enter all the fields in CreateLead page
//     **Note
//          1. Donot work on Parent Account Field
//          2.Enter the Birthdate using SendKeys
//	8. Enter all the fields in contact information   
//	9. Enter all the fields in primary address	 
//	10. Get the Firstname and print it	  
//	11. Click on create Lead Button	 
//	12. Get and Verify the Title of the resulting Page(View Lead)

public class TestCaseThree {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho Corporation");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvaraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceOption = new Select(sourceDD);
		sourceOption.selectByIndex(5);
		
		WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingOption = new Select(marketingDD);
		marketingOption.selectByVisibleText("Affiliate Sites");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yuvi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/04/1997");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryOption = new Select(industryDD);
		industryOption.selectByVisibleText("Computer Software");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("250");
		
		WebElement ownerShipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipOption = new Select(ownerShipDD);
		ownershipOption.selectByIndex(5);
	
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("7564");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ZOHO");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Cloud Software Suite for Businesses");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Run your entire business with Zoho's suite of online productivity tools and SaaS applications. Over 75 million users trust us worldwide.Try our Forever Free Plan!");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("452631");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Chris");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sales@zohocorp.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.zoho.com/");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Murali Dharan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Ist Bulding");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Estancia");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		WebElement countryDD = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryList = new Select(countryDD);
		countryList.selectByVisibleText("India");
		
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateList = new Select(stateDD);
		stateList.selectByVisibleText("TAMILNADU");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603203");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("6");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("First Name = "+firstname);
		System.out.println("Title      = "+driver.getTitle());
		driver.close();

	}

}
