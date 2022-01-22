package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	// Step 1: Download and set the path 
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Male" 
	//			 ( A normal click will do for this step) 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Mary");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jane");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("maryjane7@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("maryjane7@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mary@7");
		
		WebElement birthDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(birthDate);
		date.selectByIndex(6);
		
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(birthMonth);
		month.selectByVisibleText("Apr");
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(birthYear);
		year.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		

	}

}
