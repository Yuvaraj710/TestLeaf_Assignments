package week4.day2.assignment;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	/*
	 * Amazon: 
	 * 1.Load the uRL https://www.amazon.in/ 
	 * 2.search as oneplus 9 pro 
	 * 3.Get the price of the first product 
	 * 4.Print the number of customer ratings for the first displayed product 
	 * 5.Mouse Hover on the stars 
	 * 6.Get the percentage of ratings for the 5 star. 
	 * 7.Click the first text link of the first image 
	 * 8.Take a screen shot of the product displayed 
	 * 9.Click 'Add to Cart' button 
	 * 10.Get the cart subtotal and verify if it is correct.
	 */

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Price of the First Product: " + price);
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("No of Ratings: " + rating);

		WebElement star = driver.findElement(By.xpath("(//a[@role='button']//i)[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(star).click().perform();

		String sRating = driver.findElement(By.xpath("//table[@id='histogramTable']/tbody[1]/tr[1]/td[3]/span[2]/a[1]"))
				.getAttribute("title");
		System.out.println(sRating);

		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));

		WebElement photo = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));

		File source = photo.getScreenshotAs(OutputType.FILE);
		File destination = new File("./images/phone.png");
		FileUtils.copyFile(source, destination);

		driver.findElement(By.id("add-to-cart-button")).click();
		String text = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();

		if (price.contains(text)) {
			System.out.println("The Price is same");
		} else {
			System.out.println("The price is not same");
		}

		driver.quit();

	}

}
