package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.switchTo().frame("frame1");
		System.out.println("Swithced to Frame 1");
		driver.findElement(By.xpath("//input")).sendKeys("Learning Frames");
		
		driver.switchTo().frame("frame3");
		System.out.println("Swithced to Frame 3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		System.out.println("Swithced to main page");
		
		driver.switchTo().frame("frame2");
		System.out.println("Swithced to Frame 2");
		
		WebElement animals = driver.findElement(By.id("animals"));
		Select animal = new Select(animals);
		animal.selectByIndex(1);
		
		driver.switchTo().defaultContent();
		System.out.println("Swithced to main page");
		
		String text = driver.findElement(By.xpath("(//span)[3]")).getText();
		System.out.println(text);
		
		driver.close();
		

	}

}
