package week4.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Thread.sleep(2000);
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Greenstech");
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Thread.sleep(1000);
		
		driver.close();
			
	}

}
