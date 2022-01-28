package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windows = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windows.get(1));

		Thread.sleep(2000);

		driver.close();

		driver.switchTo().window(windows.get(0));

		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();

		Thread.sleep(2000);

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> windows1 = new ArrayList<String>(windowHandles1);

		System.out.println(driver.getTitle());

		driver.switchTo().window(windows1.get(1));

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();

		driver.close();

		driver.switchTo().window(windows1.get(2));

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();

		Thread.sleep(2000);

		driver.close();

		driver.switchTo().window(windows1.get(0));

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();

		Thread.sleep(2000);

		Set<String> windowHandles2 = driver.getWindowHandles();

		List<String> windows2 = new ArrayList<String>(windowHandles2);

		for(int i=1; i<windows2.size(); i++)
		{
			driver.switchTo().window(windows2.get(i));
			driver.close();
		}

		driver.switchTo().window(windows2.get(0));

		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();


		Thread.sleep(2000);

		Set<String> windowHandles3 = driver.getWindowHandles();

		List<String> windows3 = new ArrayList<String>(windowHandles3);

		for(int i=1; i<windows3.size(); i++)
		{
			driver.switchTo().window(windows3.get(i));
			driver.close();
		}

		Thread.sleep(2000);
		driver.switchTo().window(windows3.get(0));

		driver.close();
		
	}

}
