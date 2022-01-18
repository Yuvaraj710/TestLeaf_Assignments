package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseTwo {
	
//	Open the browser
//	Load the URL
//	Maximize the browser
//	Enter UserName
//	Enter Password
//	Click Login
//	Click CRM/SFA
//	Click Contacts Tab
//	Click Find Contacts
//	Click Email Tab
//	Type email as babu@testleaf.com
//	Click Find Contacts
//	Close the browser

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Contacts')]")).click();		
		
		driver.close();
	}

}
