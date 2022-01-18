package week2.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseOne {
 /*	Open the browser
	Load the URL  http://leaftaps.com/opentaps/control/main
	Maximize the browser
	Enter UserName
	Enter Password
	Click Login
	Click CRM/SFA
	Click Contacts Tab
	Click Create Contact
	Type First Name
	Type Last Name
	Click Create Contact Button
	Print the first name and browser title 
	Close the browser */

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Yuvaraj");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String text = driver.findElement(By.xpath("//*[@id=\"viewContact_firstName_sp\"]")).getText();
		
		System.out.println("First Name : "+text);
		
		System.out.println("The Title of the Page is : "+ driver.getTitle());
		
		driver.close();

	}

}
