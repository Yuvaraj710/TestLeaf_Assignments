package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaAssignment2 {
	
/*	1) Go to https://www.nykaa.com/
	2) Mouseover on Brands and Search L'Oreal Paris
	3) Click L'Oreal Paris
	4) Check the title contains L'Oreal Paris(Hint-GetTitle)
	5) Click sort By and select customer top rated
	6) Click Category and click Hair->Click haircare->Shampoo
	7) Click->Concern->Color Protection
	8) check whether the Filter is applied with Shampoo
	9) Click on L'Oreal Paris Colour Protect Shampoo
	10) GO to the new window and select size as 175ml
	11) Print the MRP of the product
	12) Click on ADD to BAG
	13) Go to Shopping Bag 
	14) Print the Grand Total amount
	15) Click Proceed	
	16) Click on Continue as Guest
	17) Check if this grand total is the same in step 14
	18) Close all windows
*/
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();
		
		//verify Title
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Title contains L'Oreal Paris");
		} else {
			System.out.println("Title does not contain L'Oreal Paris");
		}
		
		driver.findElement(By.xpath("//button[@class=' css-p2rfnw']//span")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();	
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		String filter = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		if(filter.equals(filter))
		{
			System.out.println("Filter Applied for Shampoo");
		}
		else
		{
			System.out.println("Filter Not Applied for Shampoo");
		}
		
		driver.findElement(By.xpath("(//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		String price = driver.findElement(By.xpath("//span[text()='MRP:']/following::span[1]")).getText();
		System.out.println("The MRP of the Product is: "+price);
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().frame(0);
		String total = driver.findElement(By.xpath("//div[@class='first-col']/div")).getText();
		System.out.println("The Grand Total of the Cart is: "+total);
		
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn full')])[2]")).click();
		String finalValue = driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
		if(total.contains(finalValue))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		driver.quit();
	}
}
