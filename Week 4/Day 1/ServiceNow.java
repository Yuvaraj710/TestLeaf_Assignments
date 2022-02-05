package week4.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	
	/*
	 * Step1: Load ServiceNow application URL 
	 * Step2: Enter user name (Check for frame before entering the username) 
	 * Step3: Enter password 
	 * Step4: Click Login 
	 * Step5: Search “incident“ Filter Navigator 
	 * Step6: Click “All” 
	 * Step7: Click New button 
	 * Step8: Select a value for Caller and Enter value for short_description
	 * Step9: Read the incident number and save it a variable 
	 * Step10: Click on Submit button Step 	
	 * Step11: Search the same incident number in the next search screen as below 
	 * Step12: Verify the incident is created successful and take
	 * snapshot of the created incident.
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://dev101463.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("B3c3QwnjySIQ");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("filter")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();	
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		
		driver.findElement(By.xpath("//tbody[@class='list2_body']//tr/td/a")).click();
		
		driver.switchTo().window(window.get(0));
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("incident.short_description")).sendKeys("Hi This is my first automation");
		
		String incidentnumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		
		driver.findElement(By.id("sysverb_insert")).click();
		
		System.out.println("Incident Number : "+incidentnumber);
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incidentnumber,Keys.ENTER);
		
		String iNuumber = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		
		if(incidentnumber.equals(iNuumber)) {
			System.out.println("Incident Created Successfully..");
		}
		else {
		
			System.out.println("Incident not created");
		}
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./images/servicenow.png");
		FileUtils.copyFile(source, destination);
		

	}

}
