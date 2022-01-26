package week3.day2.assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@role='combobox']"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total Item : "+items);
		
		
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		
		System.out.println("Number of Brands : " +brandList.size());
		for (WebElement element : brandList) 
		{
			String brandName = element.getText();
			System.out.println(brandName);
		}
		System.out.println("--------------------------------------------");
		List<WebElement> bagList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Number of Bags : " +bagList.size());
		for (WebElement element : bagList) 
		{
			String bagName = element.getText();
			System.out.println(bagName);
		}
			
	}

}
